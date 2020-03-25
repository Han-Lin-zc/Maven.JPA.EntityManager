package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pokemon_trainer")
public class PokemonTrainer {

    @Id
    private Integer trainerid;
    private Integer pokelevel;
    private Integer hp;
    private Integer maxhp;
    private Integer attack;
    private Integer defense;
    private Integer spatk;
    private Integer spdef;
    private Integer speed;
    private Integer pokemon_id;


    public PokemonTrainer() {
    }

    public PokemonTrainer(int trainerId, int pokelevel, int hp, int maxhp, int attack, int defense, int spatk, int spdef, int speed, int pokemon_id) {
        this.trainerid = trainerId;
        this.pokelevel = pokelevel;
        this.hp = hp;
        this.maxhp = maxhp;
        this.attack = attack;
        this.defense = defense;
        this.spatk = spatk;
        this.spdef = spdef;
        this.speed = speed;
        this.pokemon_id = pokemon_id;
    }

    public Integer getTrainerId() { return this.trainerid; }

    public void setTrainerId(Integer trainerId) {
        this.trainerid = trainerId;
    }

    public Integer getPokeLevel() {
        return pokelevel;
    }

    public void setPokeLevel(Integer pokeLevel) {
        this.pokelevel = pokeLevel;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getMaxHp() {
        return maxhp;
    }

    public void setMaxHp(Integer maxHp) {
        this.maxhp = maxHp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getSpatk() {
        return spatk;
    }

    public void setSpatk(Integer spatk) {
        this.spatk = spatk;
    }

    public Integer getSpdef() {
        return spdef;
    }

    public void setSpdef(Integer spdef) {
        this.spdef = spdef;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getPokemon_id() {
        return pokemon_id;
    }

    public void setPokemon_id(Integer pokemon_id) {
        this.pokemon_id = pokemon_id;
    }
}
