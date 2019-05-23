package comparator;

import comparator.CharComparator;

public class StringComparator {


   public int compare(String firstString,String secondString){

        int size=firstString.length();
        if(secondString.length()<size)size=secondString.length();
        /// wait for data
        for(int i=0;i<size;i++) {
            CharComparator charCompare= new CharComparator(firstString.charAt(i),secondString.charAt(i),"charcompare");
            charCompare.start();
            while (charCompare.getReady()==0){

            }
            if(charCompare.getEqual()==0)return i;

        }
        return -1;

    }





}
