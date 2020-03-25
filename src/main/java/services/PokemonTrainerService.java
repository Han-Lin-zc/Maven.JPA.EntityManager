package services;

import entities.PokemonTrainer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;


public class PokemonTrainerService {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pokemon-unit");
    private static EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();


    public PokemonTrainer findById(Integer trainerId) {
        return em.find(PokemonTrainer.class, trainerId);
    }

    public ArrayList<PokemonTrainer> findAllTrainers(){
        ArrayList<PokemonTrainer> result = new ArrayList<>();
        em.getTransaction().begin();
        result = (ArrayList<PokemonTrainer>) em.createQuery("SELECT a FROM PokemonTrainer a WHERE a.trainerId < 10 ",PokemonTrainer.class).getResultList();
        return result;
    }

    public void update(PokemonTrainer pokemonTrainer, Integer pokelevel) {
        tx.begin();
        pokemonTrainer.setPokeLevel(pokelevel);
        tx.commit();
    }

    public PokemonTrainer create(PokemonTrainer pokemonTrainer) {
        tx.begin();
        em.persist(pokemonTrainer);
        tx.commit();
        return pokemonTrainer;
    }

    public void deleteById(Integer trainerId) {
        PokemonTrainer pokemonTrainer = em.find(PokemonTrainer.class, trainerId);
        if (pokemonTrainer != null) {
            tx.begin();
            em.remove(pokemonTrainer);
            tx.commit();
        }
    }

    public void delete(PokemonTrainer pokemonTrainer) {
        tx.begin();
        em.remove(pokemonTrainer);
        tx.commit();
    }

}
