import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BmiTest {
    TinhBMI util = new TinhBMI();
    @Test
    void test1(){
        assertThrows(IllegalArgumentException.class,()->{util.tinhBmi(49.50,0);});
    }

    @Test
    void test2(){
        assertThrows(IllegalArgumentException.class,()->{util.tinhBmi(49.50,3.01);});
    }

    @Test
    void test3(){
        assertThrows(IllegalArgumentException.class,()->{util.tinhBmi(0,1.58);});
    }

    @Test
    void test4(){
        assertThrows(IllegalArgumentException.class,()->{util.tinhBmi(700.50,1.58);});
    }

    @Test
    void test5(){
        assertThrows(IllegalArgumentException.class,()->{util.tinhBmi(0,0);});
    }

    @Test
    void test6(){
        assertThrows(IllegalArgumentException.class,()->{util.tinhBmi(0,3.01);});
    }

    @Test
    void test7(){
        assertThrows(IllegalArgumentException.class,()->{util.tinhBmi(700.5,0);});
    }

    @Test
    void test8(){
        assertThrows(IllegalArgumentException.class,()->{util.tinhBmi(700.5,3.01);});
    }
}
