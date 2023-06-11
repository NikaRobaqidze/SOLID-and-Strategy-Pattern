package ge.nick.utils;

/**
* Interface to set functions for object that can attack.
* Single set of attack functions for different classes.
*/

public interface Attackable {

    // Get damage power of weapon to decrease health of opponent.
    double attackPower();

    // To start fight with player.
    void attackTo(Player p);
}
