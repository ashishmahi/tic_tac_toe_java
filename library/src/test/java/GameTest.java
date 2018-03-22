import com.tictactoe.Game;
import com.tictactoe.Player;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
        game.addPlayer("ashish");
        game.addPlayer("debu");
    }

    @Test
    public void should_update_current_player_move() {
        game.updateMove(5);
        Player player = game.getCurrentPlayer();
        assertThat(player.getMoves(),hasItem(5));
    }

    @Test
    public void should_update_move_in_game() {
        game.updateMove(5);
        assertThat(game.getMoves(),hasItem(5));
    }

    @Test
    public void should_update_moves_alternatively_between_player() {
        game.updateMove(3);
        Player player1 = game.getCurrentPlayer();
        assertThat(player1.getMoves(),hasItem(3));
        game.updateMove(5);
        assertThat(player1.getMoves(),not(hasItem(5)));
    }

    @Test
    public void should_tell_current_player_name() {
        assertThat(game.getCurrentPlayerName(),is("ashish"));
    }
}
