public class NumberOfA {
    public int countA(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.charAt(0) == 'A') {
            return 1 + countA(s.substring(1));
        } else {
            return countA(s.substring(1));
        }
    }

    public static void main(String[] args) {
        NumberOfA numberOfA = new NumberOfA();
        String s  = "BBAACCDDDD";
        System.out.println(numberOfA.countA(s));
    }

}
