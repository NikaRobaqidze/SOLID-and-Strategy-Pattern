package ge.nick.utils;

/*
 * Enum of guns. List of all guns in game.
 * Gun damage power is initialized enum by hand.
 */

public enum Guns {

    SHOTGUN(30.0),
    KATANA(20.0),
    HAND(10.0);

    // Key to save damage power.
    private final double DP;

    // Constructor to set value.
    Guns(double damage) { this.DP = damage; }

    // Get function to get value of damage.
    double getDP(){ return this.DP; }

    @Override
    public String toString() {
        return "Guns{" + "damage=" + DP + '}';
    }
}
