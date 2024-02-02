public class VowelsConsonants {

    public void countVC(){

        String Str= "chaudhary";
        Str = Str.toLowerCase();
        int vowels =0;
        int consonants=0;


        for(int i=0; i<Str.length(); i++){
            char x= Str.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){

                vowels++;
            }else{
                consonants++;
            }
        }

        System.out.println("vowels"+vowels+" & consonants"+consonants);

    }
}
