/*
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]

 */

public class ReversedSequence {
    public static int[] reverse(int n){
        int[] tab = new int[n];
        if(n>0){
            for(int i=0;i<tab.length;i++){
                tab[i]=n-i;
            }
        }
        return tab;
    }
}
