

public class Simulation {

    Dice dice;
    Bins bin;
    int tries;
    String rollResult;

    public Simulation(){

        this.dice = new Dice(1);
        this.bin = new Bins(1, 6);

    }

    public Simulation(int dice, int amountOfTries){

        this.dice = new Dice(dice);
        this.bin = new Bins (1*dice, 6*dice);
        this.tries = amountOfTries;


    }

    public void runSimulation(){
        for(int i = 0; i<this.tries; i++){
            this.bin.incremintBin(dice.tossAndSum());
        }
    }

    public void result(){
        int min = 1*this.dice.getAmntDice();
        int max = 6*this.dice.getAmntDice();
        int range = max - min + 1;
        this.rollResult = "*** \n" +
                "Simulation of " + this.dice.getAmntDice() +
                " dice tossed for " + this.tries + " times. \n" +
                "***\n\n";

        for(int i = 0; i < range; i++){
            this.rollResult += String.format(min+" :    ");
        }

    }

}
