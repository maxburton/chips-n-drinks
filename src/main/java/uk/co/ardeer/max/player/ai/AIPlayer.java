package uk.co.ardeer.max.player.ai;

import uk.co.ardeer.max.player.Player;

public class AIPlayer implements Player {
    private int id;
    private static final boolean IS_AI = true;

    public AIPlayer(){
        id = 0;
    }

    public int getId(){
        return id;
    }

    public boolean isAI(){
        return IS_AI;
    }
}
