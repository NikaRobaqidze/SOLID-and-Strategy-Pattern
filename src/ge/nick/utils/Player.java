package ge.nick.utils;

/*
* Class for user of game. Parameters for playing process.
* It includes all functions to use opportunities of game.
* To define all opportunities implement interfaces.
*/

public class Player implements Attackable, Defensible {

    // Health points.
    private double HP;

    // Gun for attack.
    private Guns gun;

    // Defense to reflect attack damage.
    private Defenses defense;

    // Constructor to set values of player.
    public Player(double HP, Guns gun, Defenses defense) {
        this.HP = HP;
        this.gun = gun;
        this.defense = defense;
    }

    // To get value of health points.
    public double getHP() {
        return HP;
    }

    // To set value of health points.
    public void setHP(double HP) {
        this.HP = HP;
    }

    // To set gun for attack.
    public void setGun(Guns gun) {
        this.gun = gun;
    }

    // To set defense to reflect damage.
    public void setDefense(Defenses defense) {
        this.defense = defense;
    }

    @Override
    public double attackPower() {
        return this.gun.getDP();
    }

    @Override
    public double defensePower() {
        return this.defense.getDefense();
    }

    @Override
    public void attackTo(Player p) {

        double damage = ((100 - p.defensePower()) * this.attackPower()) / 100;
        p.setHP(p.getHP() - damage);
    }

    @Override
    public String toString() {
        return "Player{" +
                "HP=" + HP +
                ", gun=" + gun +
                ", defense=" + defense +
                '}';
    }
}
