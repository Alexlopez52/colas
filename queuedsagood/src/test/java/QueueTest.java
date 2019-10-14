
import org.junit.Before;
        import org.junit.Test;
public class QueueTest {
    Queue q= new QueueImpl(3);
    int[] vector = new int[4];
    @Before
    public void setUp() {


        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3;
        vector[3] = 4;
    }
    @Test
    public void testpush() throws ColaLlenaException {

        q.push(vector[0]);
        q.push(vector[1]);
        q.push(vector[2]);
        q.push(vector[3]);
        q.push(vector[0]);


    }
}
