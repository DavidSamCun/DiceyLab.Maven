import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
//import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {


    @Test
    public void diceTest(){         //set dice

        //Given
        Dice dice = new Dice();    //Dice amount
        int expected = 1;                 //expected default 1

        //When          //Calling the die
        int actual = dice.getAmntDice();

        //Then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void twoDiceTest(){

        //Given
        Dice dice = new Dice(2);
        int expected = 2;

        //When
        int actual = dice.getAmntDice();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addDiceTest(){

        //Given
        Dice dice = new Dice(2);
        int expected = 3;

        //when
        dice.addDice();
        int actual = dice.getAmntDice();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDiceTest(){
        //Given
        Dice dice = new Dice(2);
        int expected = 1;

        //when
        dice.removeDie();
        int actual = dice.getAmntDice();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void tossAndSumTest1() {
        //Given
        Dice dice = new Dice();
        boolean inRange = true;

        //when
        int roll = dice.tossAndSum();
        boolean rollRange;
        if ((1 <= roll) && (roll <= 6)) {
            rollRange = true;
        } else {
            rollRange = false;
        }

        //Then
        System.out.println(roll);
        Assert.assertEquals(inRange, rollRange);
    }


    @Test
    public void tossAndSumTest2(){
        //Given
        Dice dice = new Dice(2);
        boolean inRange = true;

        //when
        int amntDice = dice.getAmntDice();
        int roll = dice.tossAndSum();
        boolean rollRange;
        if((1*amntDice <= roll) && (roll <= 6*amntDice )){
            rollRange = true;
        } else {
            rollRange = false;
        }
        //Then
        System.out.println(roll);
        Assert.assertEquals(inRange, rollRange);

        }

    @Test
    public void tossAndSumTest3(){
        //Given
        Dice dice = new Dice(3);
        boolean inRange = true;

        //when
        int amntDice = dice.getAmntDice();
        int roll = dice.tossAndSum();
        boolean rollRange;
        if((1*amntDice <= roll) && (roll <= 6*amntDice )){
            rollRange = true;
        } else {
            rollRange = false;
        }
        //Then
        System.out.println(roll);
        Assert.assertEquals(inRange, rollRange);

    }

    @Test
    public void tossAndSumTest5(){
        //Given
        Dice dice = new Dice(5);
        boolean inRange = true;

        //when
        int amntDice = dice.getAmntDice();
        int roll = dice.tossAndSum();
        boolean rollRange;
        if((1*amntDice <= roll) && (roll <= 6*amntDice )){
            rollRange = true;
        } else {
            rollRange = false;
        }
        //Then
        System.out.println(roll);
        Assert.assertEquals(inRange, rollRange);

    }




}