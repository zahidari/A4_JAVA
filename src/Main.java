import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Main {
    static String[] zifferMorse = {"-----", ".----", "..---", "...--", "....-",
                                    ".....", "-....", "--...", "---..", "----."};
    static String[] alphabet = "abcdefghijklmnopqrstuvwxyz ".split("");

    static String[] alphabetMorse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };


    public static void main(String[] args) {



        String message = "-../.././..././...//.-./.-/./-/..././.-..//../.../-//--././.-../---/./.../-";

    //String morse = getMorseZeichen("Was machen wir jetzt?");

        //System.out.println(morse);

        String intget = getZeichen(message);
        System.out.println(intget);

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


    /**
     *
     * @param morseEingabe gesuchte morse code
     * @return int index
     */
    public static int searchAlphabet(String morseEingabe){

        for (int i = 0; i < alphabetMorse.length; i++) {
            if(morseEingabe.equals(alphabetMorse[i]) )
                return i;
        }

        return 26;
    }
    public static String getZeichen(String eingabe){
        String ruckgabe = "";
        int index = 0;

        //der Satz wurde in Wörtern geteilt.
        String[] splittedStr = eingabe.split("\\/"); //für // zeichen


        for(String tempStr : splittedStr){
            index = searchAlphabet(tempStr);
            ruckgabe += alphabet[index];
        }


        return ruckgabe;
    }//getZeichen ende

}//class end