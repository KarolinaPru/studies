package logic.Test;

import logic.Java.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by karol on 20.03.2017.
 */
public class PlayerTest {

    @Test
    public void constructor_GivenNewPlayer_WhenCalled_ThenInstancesAreOfPlayerClass() {

        Player p = new Player("");

        assertEquals(p.getClass(), new Player("").getClass());

    }

    @Test
    public void getId_Given4Players_WhenCalled_ValueShouldBe3() {
        Player p1 = new Player("1");
        Player p2 = new Player("2");
        Player p3 = new Player("3");
        Player p4 = new Player("4");

        int expectedId = 4;

        assertEquals(expectedId, Player.getId());
    }

    @Test
    public void getGamesPlayed_GivenPlayer_WhenCalled_ThenCorrectNumberIsReturned(){
        Player player = new Player("");
        player.setGamesPlayed(4);

        int expectedGamesPlayed = 4;

        assertEquals(expectedGamesPlayed, player.getGamesPlayed());
    }





}