

public class Simulation {

    private Dice dice;
    private Bins bin;
    private int tries;


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
        for(int i = 0; i<tries; i++){
            this.bin.incremintBin(dice.tossAndSum());
        }
    }

    public void result(){

        int min = 1*this.dice.getAmntDice();
        int max = 6*this.dice.getAmntDice();
        int range = max - min + 1;
        String rollOutput;
        String rollResult = "*** \n" +
                "Simulation of " + this.dice.getAmntDice() +
                " dice tossed for " + this.tries + " times. \n" +
                "***\n\n";
        System.out.println(rollResult);
        for(int i = 0; i < range; i++){
            rollOutput = (min + i) + "" + bin.getRollAmount(i);


//            this.rollResult += String.format("%3d : ", min + i) +  String.format("%3d  : ", bin.getRollAmount(i)) +
//                    String.format("%.2f : ",  Double.valueOf(bin.getRollAmount(i)/this.tries)) +"\n";
        }
            //"%3d |\n"
    }

}
