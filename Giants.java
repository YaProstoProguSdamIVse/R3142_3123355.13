public class Giants extends Mountains implements IsCreatingByNature {
    public Giants(String type, Part part, int height, Adjectives adjective) {
        super(type, part, height, adjective);
        this.part = Part.SYNONYMS;
    }

    public static void towered(IntroductoryWords introductoryWords, Frequency frequency, String place, String time){
        System.out.print(introductoryWords.getName() + "эти " + Giants.getType() + frequency.getName() + "высились ");
        if (place == "HERE") {
            System.out.print("здесь ");
        }
        if (place == "THERE") {
            System.out.print("там ");
        }

        if (time == "ANCIENT") {
            System.out.println("и в исключительно давние времена.");
        }
        if (time == "COUPLEDAYS") {
            System.out.println("и пару дней назад.");
        }
        if (time == "SECOND AGO") {
            System.out.println("буквально секунду назад.");
        }
    }
}

