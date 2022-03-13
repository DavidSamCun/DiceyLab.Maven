
public class Bins {

    private static int min;
    private static int max;
    private static int[] bin;

    public Bins(){
        this.min = 1;
        this.max = 6;
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
        return bin[roll];
    }

}
