//package helloworld;

import static org.junit.Assert.*;
//import com.javatpoint.logic.*;
import org.junit.Test;

public class TestLogic {

    
    @Test
    public static void testFindMax(){
            assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
            //assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
    }
    
    public static void main(String[] args) 
    {
        testFindMax();
        //TestCase2 a = new TestCase2();
        //a.setUpBeforeClass();
    }
}
// https://www.javatpoint.com/junit-tutorial
// https://condor.depaul.edu/glancast/383class/docs/junit_netbeans.html