import com.tictactoe.Game;
import com.tictactoe.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
        game.addPlayer("ashish","X");
        game.addPlayer("debu","O");
    }

    @Test
    public void should_update_current_player_move() {
        game.updateMove(5);
        Player player = game.getCurrentPlayer();
        assertThat(player.getMoves(),hasItem(5));
    }

    @Test
    public void should_give_symbol_of_current_player() {
        assertThat(game.getSymbol(),is("X"));
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

    @Test
    public void should_tell_whether_the_game_is_in_play() {
        assertTrue(game.inPlay());
    }

    @Test
    public void should_not_update_move_already_made() {
        game.updateMove(2);
        game.updateMove(2);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        assertTrue(game.getMoves().equals(expected));
    }

    @Test
    public void should_tell_whether_current_player_has_won_the_game() {
        game.updateMove(1);
        game.updateMove(9);
        game.updateMove(2);
        game.updateMove(8);
        game.updateMove(3);
        assertTrue(game.hasCurrentPlayerWon());
        assertThat("ashish",is(game.getWinner()));
    }

    @Test
    public void should_tell_game_in_play_if_current_player_not_won() {
        game.updateMove(1);
        game.updateMove(2);
        game.updateMove(3);
        assertFalse(game.hasCurrentPlayerWon());
    }
}
