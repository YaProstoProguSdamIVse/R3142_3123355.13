public class Cave implements IsCreatingByNature {
    private String name;
    public Cave(String name){
        this.name = name;
    }

    public static class Tunnels {
        public void underground(){
            System.out.print("подземные туннели ");
        }
    }

    public static class Enter {
        static String name = "вход ";
        static String type = "отверстие ";
        static String form1 = "квадрат ";  //можно формы фигуры в энам
        static String form2 = "полукруг ";

        public static void form(Adjectives adjectives) {
            System.out.println(adjectives.getName() + "формы были " + type + ". ");
        }

        public static void represents(Frequency frequency){
            System.out.println(frequency.getName() + "они представляли собой форму " + form1 + "или " + form2 + ".");
        }
    }

    public static class StoneFormations {
        String name = "каменные образования ";
        public void groupedNear(Adjectives adjectives) {
            System.out.print(", рядом с которыми" + "группировались " + adjectives.getName() + name + ", ");
        }
    }

    public void riddle(Adjectives adjective1, StoneFormations stoneFormations, Adjectives adjective2){
        System.out.print(adjective1.getName() + name);
        stoneFormations.groupedNear(adjective2);
        System.out.print("казались не меньшей загадкой ");
    }

    String getName() { return name; }

}
