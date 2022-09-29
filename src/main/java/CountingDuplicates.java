/*
Count the number of Duplicates

Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Example

"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice

 */

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] later = text.toLowerCase().trim().toCharArray();
        int a=0;
        int e=0;
        char[] look = new char[later.length];
        for(int i=0;i< later.length;i++){
            int pozycion =0;
            for (int w=0;w< later.length;w++){
                if(later[i]==look[w]){
                    break;
                }
                if (later[i]==later[w]){
                    pozycion++;
                    if (pozycion==2){
                        a++;
                        look[e]=later[i];
                        e++;
                        break;
                    }
                }
            }
        }

        return a;
    }
}
