//Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.
//
//        Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
//
//        Example:
//
//        conversion.solution(1000); //should return "M"
//
//        Help:
//
//        Symbol    Value
//        I          1
//        V          5
//        X          10
//        L          50
//        C          100
//        D          500
//        M          1,000
//
//        Remember that there can't be more than 3 identical symbols in a row.

public class RomanNumeralsEncoder {

    public String solution(int n) {
        int t=0;
        String num= "";
        t=n/1000;
        num = numer(t,"M");
        t=(n%1000)/100;
        if(t<=3){
            num+=numer(t,"C");
        }
        if(t==4){
            num+="CD";
        }
        if (t==5){
            num+="D";
        }
        if (t>5&&t<9){
            t=t%5;
            num+="D";
            num+=numer(t,"C");
        }
        if(t==9) {
            num += "CM";
        }

        t=(n%100)/10;
        if(t<=3){
            num+=numer(t,"X");
        }
        if(t==4){
            num+="XL";
        }
        if (t==5){
            num+="L";
        }
        if (t>5&&t<9){
            t=t%5;
            num+="L";
            num+=numer(t,"X");
        }
        if(t==9) {
            num += "XC";
        }
        t=(n%10)/1;
        if(t<=3){
            num+=numer(t,"I");
        }
        if(t==4){
            num+="IV";
        }
        if (t==5){
            num+="V";
        }
        if (t>5&&t<9){
            t=t%5;
            num+="V";
            num+=numer(t,"I");
        }
        if(t==9){
            num+="IX";
        }


        return num;
    }

    public static String numer(int a,String b){
        String z="";
        for(int i=0;i<a;i++){
            z+=b;
        }
        return z;
    }
}
