import com.tictactoe.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Ashish","X");
    }

    @Test
    public void should_give_players_name() {
        assertThat(player.getName(),is("Ashish"));
    }

    @Test
    public void should_add_move_to_players_moves() {
        player.addMove(1);
        assertThat(player.getMoves(),hasItem(1));
    }

    @Test
    public void should_give_moves_of_player() {
        ArrayList<Integer> expectedMoves = new ArrayList<Integer>();
        expectedMoves.add(5);
        player.addMove(5);
        assertThat(player.getMoves(),is(expectedMoves));
    }

    @Test
    public void dummyTest() {
        assertFalse(false);
        assertTrue(true);
    }
}
