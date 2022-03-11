import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    void incremintBin() {

        //Given
        Bins bins1 = new Bins(1, 6);
        int roll = 5;

        //When
        int expected = 1;
        bins1.incremintBin(roll);
        int actual  = bins1.getRollAmount(5);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    void getRollTest() {

        //Given
        Bins bins1 = new Bins(1, 6);
        int roll = 5;

        //When
        int expected = 10;
        for(int i = 1; i <= 10; i++) {
            bins1.incremintBin(roll);
        }

        int actual  = bins1.getRollAmount(5);
        //Then
        Assert.assertEquals(expected,actual);

    }

    //@Test



}