import  org.junit.Assert;
import org.apache.log4j.Logger;
import org.junit.Before;
        import org.junit.Test;
public class QueueTest {
    Queue q= new QueueImpl(3);
    int[] vector = new int[4];
    @Before
    public void setUp() throws ColaLlenaException{


        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3;
        vector[3] = 4;
        q.push(vector[0]);
    }
    @Test(expected =  ColaLlenaException.class)
    public void testpush() throws ColaLlenaException {


        q.push(vector[1]);
        q.push(vector[2]);
        q.push(vector[3]);
        q.push(vector[0]);
    }
    @Test(expected = ColaVaciaException.class)
    public void testpop() throws ColaVaciaException {

       q.pop();
       q.pop();
    }
;
    @Test
    public void testpop2() throws  ColaVaciaException {

        Object i= q.pop();
        Assert.assertEquals(i,vector[0]);

    }
}
