public class Main {
    static String[] zifferMorse = {"-----", ".----", "..---", "...--", "....-",
                                   ".....", "-....", "--...", "---..", "----."};
    static String[] alphabetMorse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };


    public static void main(String[] args) {





    String morse = getMorseZeichen("Was machen wir jetzt?");
        System.out.println(morse);



    }//main end

    public static String getMorseZeichen(String eingabe){

        String returnMorse = "";
        int index = 0;
        for(char c : eingabe.toLowerCase().toCharArray()){


            if(Character.isDigit(c)){ // ist es eine Zahl ?
                index = c - '0';
                returnMorse += zifferMorse[index]   + " ";

            }

            // fals der c ein alphabet ist, wird sie als morse angegeben.
            if(Character.isAlphabetic(c)) {
                index = c -'a';
                returnMorse += alphabetMorse[index]   + " ";
            }


        }

        return returnMorse;
    }
}//class end