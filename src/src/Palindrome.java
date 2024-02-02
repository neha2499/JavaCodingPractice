public class Palindrome {
       // when reverse is equals to actual string
    public void palindrome(){
        String str = "neha";
        String reverse= "";

        for (int i=0; i<str.length(); i++)
        {
            reverse= str.charAt(i)+reverse; //extracts each character String Concatenation
            System.out.println(reverse);
             //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ reverse);

        if(reverse.equals(str)){
            System.out.println("the given string is a palindrome");
        } else{
            System.out.println("not a palindrome");
        }
    }



    }

