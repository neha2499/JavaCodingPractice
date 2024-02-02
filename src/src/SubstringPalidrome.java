
class SubstringPalindrome {

    int resultStart;
    int resultLength;

    public String longestPalindrome(String s) {
        int strLength = s.length();
        if (strLength < 2) {
            return s;
        }
        for (int start = 0; start < strLength - 1; start++) {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }

        if(resultLength==1){
            return "None";
        } else {
        return s.substring(resultStart, resultStart + resultLength);}
    }

    private void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }


    public static void main(String[] args) {


        // input for inputStr
        String inputStr = "YABBAC";


        SubstringPalindrome substringPalindrome = new SubstringPalindrome();
        String s = substringPalindrome.longestPalindrome(inputStr);
        System.out.println(s);
    }

}