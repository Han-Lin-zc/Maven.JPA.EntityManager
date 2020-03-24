package services;


import entities.Pokemon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class PokemonService {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    private static EntityManager em = emf.createEntityManager();

    private static void persistPokemon(Pokemon pokemon) { em.persist(pokemon); }

    private static Pokemon findPokemon(Integer id) { return em.find(Pokemon.class, id); }
}
