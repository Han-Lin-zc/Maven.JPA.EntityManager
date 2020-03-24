import entities.PokemonTrainer;
import services.PokemonTrainerService;

public class Main {

    public static void main(String[] args) {
        PokemonTrainerService pokemonTrainerService = new PokemonTrainerService();

        PokemonTrainer pokemonTrainer = pokemonTrainerService.findById(1);

        System.out.println("Trainer found: " + pokemonTrainer);
    }

}
