package test;

import com.java.examples.FootballPoints;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
class FootballPointsTest {
    @Test
    public void test1(){
        FootballPoints footballPoints=new FootballPoints();
        assertEquals(3, FootballPoints.totalPoints(1, 0, 0));

    }
}