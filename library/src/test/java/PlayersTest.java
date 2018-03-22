import com.tictactoe.Player;
import com.tictactoe.Players;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertThat;

public class PlayersTest {

    Players players = new Players();
    Player player1;
    Player player2;

    @Before
    public void setUp() throws Exception {
        player1 = new Player("ashish");
        player2 = new Player("debu");
        players.add(player1);
        players.add(player2);
    }

    @Test
    public void should_add_player_to_player_list() {
        assertThat(players.getPlayers(),hasItem(player1));
    }

    @Test
    public void should_give_current_player() {
        assertThat(players.getCurrentPlayer(),is(player1));
    }
}
