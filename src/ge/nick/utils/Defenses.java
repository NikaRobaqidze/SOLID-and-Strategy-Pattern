package ge.nick.utils;

/*
* Enum of defenses. List of all defenses in game.
* Defense % is initialized enum by hand.
*/

public enum Defenses {

    DIAMOND(50.0),
    BRONZE(30.0);

    // Key for % of defense, Reflected power.
    private final double defense;

    // Constructor to set value.
    Defenses(double defense){ this.defense = defense; }

    // Get function to get value of defense.
    public double getDefense(){ return this.defense; }

    @Override
    public String toString() {
        return "Defenses{" + "defense=" + defense + "%}";
    }
}
