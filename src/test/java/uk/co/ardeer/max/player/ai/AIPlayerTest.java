package uk.co.ardeer.max.player.ai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import uk.co.ardeer.max.player.Player;

public class AIPlayerTest {

    @Before
    public void setup(){

    }

    @After
    public void cleanUp(){
        destroyAllPlayers();
    }

    private void destroyAllPlayers(){
        //TODO: Implement me
    }

    @Test
    public void getIdShouldReturn0(){
        Player aiPlayer = new AIPlayer();
        assertThat(aiPlayer.getId(), is(equalTo(0)));
    }

    @Test
    public void isAIShouldReturnTrue(){
        Player aiPlayer = new AIPlayer();
        assertThat(aiPlayer.isAI(), is(equalTo(true)));
    }
}
