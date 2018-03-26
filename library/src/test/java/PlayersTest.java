import com.tictactoe.Player;
import com.tictactoe.Players;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertThat;

public class PlayersTest {

    Players players = new Players();
    Player player1 = new Player("ashish","X");
    Player player2 = new Player("debu","O");

    @Before
    public void setUp() {
        players.add("ashish", "X");
        players.add("debu", "O");
    }

    @Test
    public void should_add_player_to_player_list() {
        assertThat(players.getPlayers(),hasItem(player2));
    }

    @Test
    public void should_give_current_player() {
        assertThat(players.getCurrentPlayer(),is(player1));
    }

    @Test
    public void should_change_current_player_index() {
        players.changeCurrentPlayerIndex();
        assertThat(players.getCurrentPlayer(),is(new Player("debu","O")));
    }
}
