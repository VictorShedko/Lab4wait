package comparator;

public class CharComparator extends Thread{
    private char firstChar;
    private char secondChar;
    private int ready =0;
    private int equal;

    public void run(){

        if(firstChar==secondChar){
            equal=1;
        }else{
            equal=0;
        }
        this.ready=1;
    }
    CharComparator(char firstChar,char secondChar,String name){
        super(name);
        this.firstChar=firstChar;
        this.secondChar=secondChar;

    }

    public int getReady() {
        return ready;
    }

    public int getEqual() {
        return equal;
    }
}
