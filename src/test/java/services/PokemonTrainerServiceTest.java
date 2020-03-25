package services;

import entities.PokemonTrainer;
import org.junit.Test;


public class PokemonTrainerServiceTest {

    PokemonTrainerService pokemonTrainerService = new PokemonTrainerService();
    PokemonTrainer pokemonTrainer1 = new PokemonTrainer(11867, 30, 83, 83, 27, 36, 27, 42, 60, 1 );
    PokemonTrainer pokemonTrainer2 = new PokemonTrainer(11868, 30, 83, 83, 27, 36, 27, 42, 60, 1 );
    PokemonTrainer pokemonTrainer3 = new PokemonTrainer(11869, 130, 400, 400, 400, 300, 200, 400, 60, 45 );


    @Test
    public void findByIdTest() {
        pokemonTrainerService.findById(1);
    }

    @Test
    public void updateTest() {
        pokemonTrainerService.update(pokemonTrainerService.findById(11860), 100);
    }

    @Test
    public void createTest() {
        pokemonTrainerService.create(pokemonTrainer1);
        pokemonTrainerService.create(pokemonTrainer2);
    }

    @Test
    public void deleteByIdTest() {
        pokemonTrainerService.deleteById(11861);
    }

    @Test
    public void deleteTest() {
        pokemonTrainerService.create(pokemonTrainer3);
        pokemonTrainerService.delete(pokemonTrainer3);
    }
}