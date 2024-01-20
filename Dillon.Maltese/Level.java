import java.util.Random;

public class Level {
    public static void main(String[] args) {
        Level level1 = new Level();
        Level level2 = new Level();
        Level level3 = new Level();
        Game game = new Game(level1, level2, level3);
        int result = game.playManyTimes(10);
        System.out.println("Maximum score after playing many times: " + result);
    }

    public boolean goalReached() {
        //Supposed to be whether they reached the goal but since the function in not implemented I just generated whether it was reached or not randomly
        Random r = new Random();
        return r.nextBoolean();
    }

    public int getPoints() {
        //Supposed to be how many points they got but since the function in not implemented I just generated random points
        Random r = new Random();
        return r.nextInt(100);
    }
}

class Game {
    private Level level1;
    private Level level2;
    private Level level3;

    public Game(Level level1, Level level2, Level level3) {
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
    }

    public boolean isBonus() {
        //Supposed to be whether they got a bonus but since the function in not implemented I just generated whether they got a bonus or not randomly
        Random r = new Random();
        return r.nextBoolean();
    }

    public int getScore() {
        int score = 0;
        if(level1.goalReached()) {
            score += level1.getPoints();
            if(level2.goalReached()) {
                score += level2.getPoints();
                if(level3.goalReached()) {
                    score += level3.getPoints();
                    if(isBonus()) {
                        score = score * 3;
                    }
                }
            }
        }
        return score;
    }

    public int playManyTimes(int num) {
        int fNum = 0;
        int place;
        for(int i = 0; i < num; i++) {
            place = getScore();
            if(place > fNum) {
                fNum = place;
            }
        }
        return fNum;
    }
}