public class Constructions implements IsCreatingByPeople {
    private String name;
    Adjectives adjective;
    String consists1;
    String consists2;
    String consists3;
    String consists4;

    public Constructions(String name, Adjectives adjective, String consists1, String consists2, String consists3, String consists4) {
        this.name = name;
        this.adjective = adjective;
        this.consists1 = consists1;
        this.consists2 = consists2;
        this.consists3 = consists3;
        this.consists4 = consists4;
    }


    public void clenched(Hillside hillside, Constructions constructions){
        System.out.print("прилепившихся к " + hillside.getType() + constructions.adjective.getName() + constructions.getName() + ", ");
    }

    public void consists(Adjectives adjective, Constructions constructions, String part, Rocks rocks){
        System.out.print(adjective.getName() + constructions.getName() + " состояли ");

        if (part == "MOSTLY") {
            System.out.print("по большей части ");
        }
        if (part == "PARTLY") {
            System.out.print("от части ");
        }
        if (part == "LITTLE") {
            System.out.print("совсем немного из ");
        }

        System.out.print("из " + rocks.adjective2.getName() + rocks.getName());
    }

    public void imagination(Human human, Frequency frequency, Constructions constructions){
        System.out.print("Волновали и дразнили " + human.pronoun.getPossessive() + "воображение ");
        System.out.println(frequency.getName() + "все эти " + constructions.adjective.getName() + constructions.getConsists1() + ", " + constructions.getConsists2() + " и " + constructions.getConsists3() + ".");
    }

    public static void similar(Constructions constructions, Hillside hillside, Rocks rocks){
        System.out.print(constructions.getConsists1() + constructions.getName());
        hillside.adjoining(hillside);
        System.out.println("казались схожими с " + rocks.getType() + ". ");
    }

    public void separately(Constructions constructions, Adjectives adjectives) {
        System.out.print("все эти " + constructions.getName() + " состоят из отдельных " + adjectives.getName() + constructions.getConsists4());
    }

    public void pattern(Adjectives adjective1, Adjectives adjective2, Constructions constructions) {
        System.out.println("все эти " + adjective1.getName() + constructions.getName() + " складывались в " + adjective2.getName() + "узоры. ");
    }

    public String getName() {
        return name;
    }
    public String getConsists1() {
        return consists1;
    }
    public String getConsists2() {
        return consists2;
    }
    public String getConsists3() {
        return consists3;
    }
    public String getConsists4() {
        return consists4;
    }
}
