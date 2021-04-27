package ch.zhaw.iwi.devops.scoreKeeperKata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

public class ScoreKeeperKataTest {
    private ScoreKeeperKata sck;

    @Before
    public void setup(){
        
        sck = new ScoreKeeperKata();
    }

    @Test
    public void testScoreTeamA1(){        
        sck.scoreTeamA();
        Assert.assertEquals("001:000", sck.getScore());
    }

    @Test
    public void testScoreTeamA2(){
        sck.scoreTeamA2();
        Assert.assertEquals("002:000", sck.getScore());
    }

    @Test
    public void testScoreTeamA3(){
        sck.scoreTeamA3();
        Assert.assertEquals("003:000", sck.getScore());
    }

    @Ignore
    public void testScoreTeamB1(){       
        sck.scoreTeamB1();
        Assert.assertEquals("000:001", sck.getScore());
    }

    @Ignore
    public void testScoreTeamB2(){
        sck.scoreTeamB2();
        Assert.assertEquals("000:002", sck.getScore());
    }
        
    @Ignore
    public void testScoreTeamB3(){
        sck.scoreTeamB3();
        Assert.assertEquals("000:003", sck.getScore());
    }

    @Ignore
    public void testScoreTeamB3Twice(){
        sck.scoreTeamB3();
        sck.scoreTeamB3();
        Assert.assertEquals("000:006", sck.getScore());
    }

    @Ignore
    public void testScoreMutlipleTeamsMultipleTimes(){
        sck.scoreTeamA();
        sck.scoreTeamA2();
        sck.scoreTeamB3();
        sck.scoreTeamB3();
        Assert.assertEquals("003:006", sck.getScore());
    }

    @Ignore
    public void testScoreTeamAMax(){
        for(int i = 0; i< 999; i++){
            sck.scoreTeamA();
        }        
        Assert.assertEquals("999:000", sck.getScore());
    }

    @Ignore
    public void testScoreTeamBOverFlow(){
        for(int i = 0; i< 1000; i++){
            sck.scoreTeamA();
        }        
        Assert.assertEquals("000:000", sck.getScore());
    }
  
    
}
