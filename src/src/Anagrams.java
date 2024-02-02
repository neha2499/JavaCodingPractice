import java.util.Arrays;

public class Anagrams {

    // if two strings get the same group of characters
    public boolean anagrams() {
        boolean status;
        String str1 = "hello";
        String str2 = "olelhi";
        //removes white spaces from string 1
        String s1 = str1.replaceAll("\\s", "");
//removes white spaces from string 2
        String s2 = str2.replaceAll("\\s", "");
        if (s1.length() != s2.length()){
           status = false;
        }else {



            char[] arrayS1 = s1.toLowerCase().toCharArray();
            char[] arrayS2 = s2.toLowerCase().toCharArray();

            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            status= Arrays.equals(arrayS1, arrayS2);

        }
        return status;
    }
}
