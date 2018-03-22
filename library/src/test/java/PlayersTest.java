import com.tictactoe.Player;
import com.tictactoe.Players;
import org.junit.Test;

import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertThat;

public class PlayersTest {
    @Test
    public void should_add_player_to_player_list() {
        Players players = new Players();
        Player player = new Player("ashish");
        players.add(player);
        assertThat(players.getPlayers(),hasItem(player));
    }
}
