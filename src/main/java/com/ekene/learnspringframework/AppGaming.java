package com.ekene.learnspringframework;

import com.ekene.learnspringframework.game.GameRunner;
import com.ekene.learnspringframework.game.MarioGame;
import com.ekene.learnspringframework.game.SuperContraGame;

public class AppGaming {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gamerRunner = new GameRunner(superContraGame);
        gamerRunner.run();
    }
}
