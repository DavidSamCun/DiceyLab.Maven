import java.util.Random;

public class Dice {

    private static Random rand = new Random();
    private static int dice = 1;       //Default number of dice
    private static int defMax = 1;
    private static int defMin = 6;       //Default min
    //private final int numOfDie;
    //private int rollResult;

    //Default constructor

    public Dice(){
        this.dice = 1;
    }

    public Dice(int amnt){
        if(amnt<0){
            System.out.println("Need an amount greater than 0");
        } else {
            this.dice = amnt;
        }
    }

    public void removeDie(){//Setter
        if (this.dice > 0) {
            this.dice--;
        } else {
            System.out.println("Amount can't be less than 1");
        }
    }

    public void addDice(){               //Setter
        this.dice++;
    }

    public int getAmntDice(){            //Getter
        return this.dice;
    }

    public int tossAndSum(){             //Getter
        int output = rand.nextInt(1*dice, 6*dice);
        return output;
    }


}
