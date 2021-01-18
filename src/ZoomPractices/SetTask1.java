package ZoomPractices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTask1 {

    /*
    1)create a method that will accept an int []and print unique odd numbers in ascending order
 2)create a method that will accept an String array
 that will convert HashSet the length of elements that have even number of a length
     3) create a method that will take a will print the middle char if the length is odd num*/
    public static void uniqueOdd(int [] arr){
        TreeSet<Integer> treeSet=new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1){
                treeSet.add(arr[i]);
            }
        }
        for (int odd:treeSet) {
            System.out.print(odd+" ");
        }
    }
    public static void evenLength(String [] names){
        HashSet<String> set=new HashSet<>(Arrays.asList(names)); // [] --> ArrayList --> Set or Map
        for (String name:set) {
            if(name.length()%2==0){
                System.out.println(name+"'s length is "+name.length());
            }
        }
    }
    public static void middleChar(String [] str){ // {"pen","apple","banana","pear","apple","pen"}
        LinkedHashSet<String> set=new LinkedHashSet<>(Arrays.asList(str));
        for (String word:set) {
            if(word.length()%2==1){
                String reversed=""; //"ne
                for (int i = word.length()-1; i >=0 ; i--) {
                    reversed+=word.charAt(i);
                }
                System.out.println(reversed);
            }
            //2
        }
        //3 XXXX
    }
    public static void main(String[] args) {
        int[] arr = {23, 6, 8, 9, 5, 1, 44, 11, 115, 9, 6, 1, 23, 11};
        //uniqueOdd(arr);
        System.out.println();
        String[] words = {"Army", "Ayhan", "Ridvan", "Serhat", "Renas", "Ayhan", "Army", "Mehmet", "Serhat"};
        //evenLength(words);
        String[] elements = {"Army", "Ayhan", "Ridvan", "Serhat", "Renas", "Aydin", "Army", "Mehmet", "Muammer"};
        middleChar(elements);

    }
}

