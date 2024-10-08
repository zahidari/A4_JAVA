import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Main {
    static String[] zifferMorse = {"-----", ".----", "..---", "...--", "....-",
                                    ".....", "-....", "--...", "---..", "----."};
    static String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split(".");

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
    public static String getZeichen(String eingabe){
        String ruckgabe = "";

        //der Satz wurde in Wörtern geteilt.
        String[] splittedStr = eingabe.split("\\/\\/"); //für // zeichen

        //jedes Word wird enzeln behandelt
        for(String s : splittedStr){
            //jedes Word wird einzelne Buchstabe
            String[] alphabetArr = s.split("\\/");
                for(String s2 : alphabetArr){
                    //vergleiche
                    for (int i = 0; i < alphabetMorse.length; i++) {
                        if(s2.equals(alphabetMorse[i])){
                            ruckgabe += alphabet[i];
                            break;
                        }



                    }

                }
        }





        return ruckgabe;
    }//getZeichen end
}//class end