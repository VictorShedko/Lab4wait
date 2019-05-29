package comparator;

public class CharComparator extends Thread{
    private char firstChar;
    private char secondChar;
    private int ready =0;
    private int equal;
    private int index;
    public void run(){
        System.out.println(index +" start");
        if(firstChar==secondChar){
            equal=1;
        }else{
            equal=0;
        }
        try {
        sleep(2000);
        } catch (InterruptedException qq) {
            System.out.println(index +" interupt");  ;
        }
        System.out.println(index +" sleep end");
        this.ready=1;
        System.out.println(index +" ready");
    }
    CharComparator(Integer i,char firstChar,char secondChar,String name){
        super(name);
        this.index=i;
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
