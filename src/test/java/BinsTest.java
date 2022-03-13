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

    @Test
    void getRollTest2() {

        //Given
        Bins bins1 = new Bins(2, 12);
        int roll = 10;

        //When
        int expected = 10;
        for(int i = 1; i <= 10; i++) {
            bins1.incremintBin(roll);
        }



        int actual  = bins1.getRollAmount(10);
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    void getRollTest3() {

        //Given
        Dice dice1 = new Dice(2);
        int min = 1* dice1.getAmntDice();
        int max = 6* dice1.getAmntDice();
        Bins bins1 = new Bins(min, max);
        int count = 0;

        //When
        for(int i = 0; i < 1000000; i++) {
            bins1.incremintBin(dice1.tossAndSum());
        }

        for(int i = min; i <= max; i++){
            System.out.println(i + " " + bins1.getRollAmount(i));
            count += bins1.getRollAmount(i);
            System.out.println(count);
        }
        //Then
        //Assert.assertEquals(expected,actual);

    }

}