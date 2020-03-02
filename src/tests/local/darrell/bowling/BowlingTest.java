package local.darrell.bowling;


import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    @Test
    public void gutterGameReturnsZero(){
        Bowling game = new Bowling();
        for (int i = 0; i < 20; i++){
            game.roll(0);
        }

        int actual = game.score();

        assertEquals(0, actual);
    }

    @Test
    public void rollAllOnesReturnsTwenty(){
        Bowling game = new Bowling();
        for (int i = 0; i < 20; i++){
            game.roll(1);
        }

        int actual = game.score();

        assertEquals(20, actual);
    }

    @Test
    public void rollOneSpareReturnTenPlusNextRoll(){
        Bowling game = new Bowling();
        game.roll(5);
        game.roll(5);
        game.roll(2);

        for (int i = 0; i < 17; i++){
            game.roll(0);
        }

        int actual = game.score();

        assertEquals(14, actual);
    }

    @Test
    public void rollOneStrikeReturnTenPlusNextTwoRolls(){
        Bowling game = new Bowling();
        game.roll(10);
        game.roll(5);
        game.roll(2);

        for (int i = 0; i < 16; i++){
            game.roll(0);
        }

        int actual = game.score();

        assertEquals(24, actual);
    }

    @Test
    public void perfectGameReturnsThreeHundred(){
        Bowling game = new Bowling();

        for (int i = 0; i < 12; i++){
            game.roll(10);
        }

        int actual = game.score();

        assertEquals(300, actual);
    }

    @Test
    public void rollsFiveEveryBallReturnsOneFifty(){
        Bowling game = new Bowling();

        for (int i = 0; i < 21; i++){
            game.roll(5);
        }

        int actual = game.score();

        assertEquals(150, actual);
    }
}
