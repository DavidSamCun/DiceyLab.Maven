

public class Simulation {

    Dice dice;
    Bins bin;
    int tries;

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

    }

}
