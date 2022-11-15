package Java;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class Testing {
    @Test
    public void testNumberofline() {
        Count mycount = new Count();
        String str = "this is the first line";


        mycount.count(str);

        mycount.count(str);
        mycount.count(str);
        mycount.count(str);
        mycount.count(str);

        long expected = 5;
        long actual = mycount.getLine();
        assertEquals(expected, actual);
    }



    @Test
    public void testNumberofCharacter() {
        Count mycount = new Count();
        String str = "this is me";
        String str1 = "done";

        mycount.count(str);
        mycount.count(str1);


        long expected = 14;
        long actual = mycount.getCharacter();
        assertEquals(expected, actual);
    }

    @Test
    public void testStop() {
        Count mycount = new Count();
        String str = "this is me";
        String str1 = "stop";

        boolean expected = true;
        boolean actual = mycount.count(str);
        assertEquals(expected, actual);



        boolean expected1 = false;
        boolean actual1 = mycount.count(str1);
        assertEquals(expected1, actual1);
    }


}
