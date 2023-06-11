/**
* @Author: Nika Robaqidze
* @Email: nika42568@gmail.com

* Play scenario:
* Initialize two players with different values. (except heath)
* Print each player values at every step to compare it and see changes.
* Players attack each other. After it change guns and defense then attack again.
* As result see how same functions values are changing with different parameters.*/

package ge.nick;

import ge.nick.utils.Defenses;
import ge.nick.utils.Guns;
import ge.nick.utils.Player;

public class Launcher {
    public static void main(String[] args) {

        // Initialize Player 1 with values Health - 100, Gun - SHOTGUN, Defense - DIAMOND.
        Player p1 = new Player(100.0, Guns.SHOTGUN, Defenses.DIAMOND);
        System.out.println("Player 1 - " + p1);

        // Initialize Player 2 with values Health - 100, Gun - KATANA, Defense - BRONZE.
        Player p2 = new Player(100.0, Guns.KATANA, Defenses.BRONZE);
        System.out.println("Player 2 - " + p2);

        // Player 1 is attack to Player 2.
        p1.attackTo(p2);

        // Print values after attack.
        System.out.println("Player 1 - " + p1);
        System.out.println("Player 2 - " + p2);

        // Player 1 is changing gun.
        p1.setGun(Guns.HAND);

        // Player 2 is changing defenses.
        p2.setDefense(Defenses.DIAMOND);

        // Print values after changing.
        System.out.println("Player 1 - " + p1);
        System.out.println("Player 2 - " + p2);

        // Player 2 is attack to Player 1.
        p2.attackTo(p1);

        // Print values after attack.
        System.out.println("Player 1 - " + p1);
        System.out.println("Player 2 - " + p2);
    }
}