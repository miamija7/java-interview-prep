import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumOf3Test {
    @Test
    public void testOne(){
        int[] args = {-1,0,1,2,-1,-4};
        List<List<Integer>> answer = new ArrayList();
        List<Integer> list1 = new ArrayList();
        list1.add(-1);
        list1.add(0);
        list1.add(1);
        List<Integer> list2 = new ArrayList();
        list2.add(-1);
        list2.add(-1);
        list2.add(2);
        answer.add(list1);
        answer.add(list2);

        assertEquals(answer, SumOf3.solve(args));
    }
}
