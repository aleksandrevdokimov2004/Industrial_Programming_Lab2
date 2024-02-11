public class Task2 {

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String deqToN(int number, int to){
        String outNumber="";
        while(number>0){
            int digit = number % to;
            if(digit < 10)
                outNumber += Integer.toString(digit);
            else
                outNumber += Character.toString((char) (digit+55));
            number /= to;
        }
        if(outNumber.isEmpty()) return "0";
        return reverseString(outNumber);
    }
}
