package comparator;

import comparator.CharComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringComparator {


   public int compare(String firstString,String secondString){

        int size=firstString.length();
        if(secondString.length()<size)size=secondString.length();
       List<CharComparator> threadList=new ArrayList<>();
        /// wait for data


        for(int i=0;i<size;i++) {
            CharComparator charCompare= new CharComparator(i,firstString.charAt(i),secondString.charAt(i),"charcompare");
            threadList.add(charCompare);

        }
        for(CharComparator comparator:threadList) {
            comparator.start();

        }
       System.out.println(" -----start");
       for(CharComparator comparator:threadList) {
           while (comparator.getReady() == 0) {

           }
           System.out.println(" gg");
       }
       System.out.println(" wait end");
        List<Integer> anwser=threadList.stream().map(f->f.getEqual()).collect(Collectors.toList());
            int firstNotEqual=anwser.size()+1;
            for(Integer i:anwser){
                if((i==0)&&(i<firstNotEqual))firstNotEqual=anwser.indexOf(0);

        }

       if(firstNotEqual==anwser.size()+1)return -1;
       return firstNotEqual;
    }





}
