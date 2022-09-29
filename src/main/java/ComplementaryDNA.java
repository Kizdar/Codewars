/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"


 */

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        char[] car = dna.toCharArray();
        String word ="";
        for(int i=0;i<car.length;i++){
            if(car[i]=='A')word+="T";
            if(car[i]=='T')word+="A";
            if(car[i]=='C')word+="G";
            if(car[i]=='G')word+="C";
        }

        return word;
    }
}
