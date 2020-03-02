package local.darrell.bowling;

public class Bowling {
    private int score = 0;
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public int score() {
        boolean isStrike;
        boolean isSpare;

        for (int frame = 0, currentRoll = 0; frame < 10; frame++) {
            isStrike = rolls[currentRoll] == 10;
            isSpare = rolls[currentRoll] + rolls[currentRoll+1] == 10 && !isStrike;

            if (isStrike){
                score += 10 + rolls[currentRoll+1] + rolls[currentRoll+2];
                currentRoll += 1;
            }
            else if (isSpare){
                score += 10 + rolls[currentRoll+2];
                currentRoll+=2;
            } else {
                score += rolls[currentRoll] + rolls[currentRoll+1];
                currentRoll+=2;
            }
        }

        return score;
    }

    public void roll(int pinCount) {
        rolls[currentRoll] = pinCount;
        currentRoll++;
    }
}
