public class Main {
    static String[] alphabet1 = "abcdefghijklmnopqrstuvwxyz".split(".");
    static String[] alphabet2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(".");
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
        for(char c : eingabe.toCharArray()){
            if(c >31 && c<65) continue;
            if (c >96)
                index = (c % 97);
            else
                index =c % 65;

            returnMorse += alphabetMorse[index]   + " ";

        }

        return returnMorse;
    }
}//class end