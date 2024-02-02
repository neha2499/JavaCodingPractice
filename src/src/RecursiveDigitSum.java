import static java.util.stream.Collectors.joining;

class RecursiveDigitSum {



    public  int superDigit(String n, int k) {
        long sum = getDigitSum(n) * k;
        return superDigit(Long.toString(sum));
    }

    private static long getDigitSum(String n) {
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }
        return sum;
    }

    private static int superDigit(String n) {
        while (n.length() > 1) {
            n = Long.toString(getDigitSum(n));
        }
        return Integer.parseInt(n);
    }

    public static void main(String[] args) {
        RecursiveDigitSum solution= new RecursiveDigitSum();

        int result = solution.superDigit("148", 3);
        System.out.println(result);
    }


}
