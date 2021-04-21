package ch.zhaw.iwi.devops.scoreKeeperKata;

public class ScoreKeeperKata {
    private int scoreA = 0;
    private int scoreB = 0;

    public void scoreTeamA() {
       scoreA += 1;
    }
   
    public void scoreTeamA2(){
        scoreA += 2;
    }

    public void scoreTeamA3(){
        scoreA += 3;
    }

    public void scoreTeamB1(){
        scoreB += 1;
    }

    public void scoreTeamB2(){
        scoreB += 2;
    }

    public void scoreTeamB3(){
        scoreB += 3;
    }

    public String getScore() throws NumberFormatException{
        return String.format("%03d:%03d", scoreA % 1000, scoreB % 1000);
    }

    public String toString(){
        return getScore();
    }

}