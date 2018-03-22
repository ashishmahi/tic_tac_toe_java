import com.tictactoe.Player;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player("Ashish");
    }

    @Test
    public void getName() {
        assertThat(player.getName(),is("Ashish"));
    }
}
