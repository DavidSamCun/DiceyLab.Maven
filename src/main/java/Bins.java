
public class Bins {

    private static int min;
    private static int max;
    private static int[] bin;

    public Bins(){
        this.min = 1;
        this.max = 6;
//        this.bin = new int[max - min +1];
        this.bin = new int[max+1];
    }

    public Bins(int min, int max){
        this.min = min;
        this.max = max;
        this.bin = new int[max+1];
    }

    public void incremintBin(int roll){
        bin[roll]++;
    }

    public int getRollAmount(int roll){
//        int amount = 0;
//        bin[roll-min] = amount;
        return bin[roll];
    }

}


/*

idea is to get bins that have an array list of ints. and each int index would increment based on roll

    example
            Bins results = new Bins( 2 the min roll, 12 the max roll)


                    Integer number of tens ====== results.getBin(10) // returns the number of times 10 has been roled
                    results.incrementBin 10  ==== increment bin 10 by 1 if rolled a 10
Need to study array list
*/
