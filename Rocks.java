public class Rocks {
    private String name;
    private String type;
    private Age age;
    private PhysicalState pstate;
    private Occurrence occurrence;
    Adjectives adjective1;
    Adjectives adjective2;

    public Rocks(String name, String type, Age age, PhysicalState pstate, Occurrence occurrence, Adjectives adjective1, Adjectives adjective2) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.pstate = pstate;
        this.occurrence = occurrence;
        this.adjective1 = adjective1;
        this.adjective2 = adjective2;
    }

    public enum Age {
        ANCIENT("древние "),
        YOUNG ("молодые "),
        UNKNOWN ("неизвестные ");

        private String time;

        Age(String time) {
            this.time = time;
        }

        public String getAge() {
            return time;
        }
    }

    public enum PhysicalState {
        DESTROYED("разрушенные "),
        PERFECTLY("идеально сохранившиеся "),
        OVWERGROWN("заросшие "),
        WEATHERED("выветрившиеся "),
        CRACKED("потрескавшиеся ");

        private String state;

        PhysicalState(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    public enum Occurrence {
        RARE,
        COMMON,
        FREQUENT;

        public void around(Rocks.Occurrence occurrence) {
            if (occurrence.equals(occurrence.RARE)) {
                System.out.println(", которого больше нигде вокруг не было."); }
            else if (occurrence.equals(occurrence.COMMON)) {
                System.out.println(", которого вокруг было достаточно."); }
            else if (occurrence.equals(occurrence.FREQUENT)) {
                System.out.println(", который находился повсюду."); }
        }

    }

    public void conformity(Rocks rock, Boolean conf, Sourse sourse, Human human) {

        System.out.print("Вид "+rock.pstate.getState()+rock.age.getAge()+"пород ");
        if (conf == true) {
            System.out.print("полностью соответсвовал ");
        }
        else {
            System.out.print("абсолютно не соответсвовал ");
        }
        System.out.print(sourse.getName()+human.getName()+"а: ");
    }

    public void strength(Rocks rocks, Adjectives adjectives, Boolean s){
        System.out.print(", но " + adjectives.getName() + rocks.adjective1.getName() + rocks.getName());
        if (adjective1.equals(adjectives.DURABLE) & (s == true)) {
            System.out.print(" помогла ему "); }
        else if (adjective1.equals(adjectives.DURABLE) & (s == false)) {
            System.out.print(" не помогла ему "); }
        else if (adjective1.equals(adjectives.FRAGILE) & (s == false)) {
            System.out.print(" помешала ему "); }
        else if (adjective1.equals(adjectives.FRAGILE) & (s == true)) {
            System.out.print(" не помешала ему "); }
        System.out.println("выстоять. ");
    }

    public void tookAShape(Rocks rocks, Frequency frequency, Adjectives adjectives){
        System.out.print(rocks.getName() + rocks.getType() + frequency.getName()+ "принимают " + adjectives.getName() + "формы ");
    }

    public void riddled(IntroductoryWords introductoryWords, Rocks rocks, Cave.Tunnels tunnels) {
        System.out.print(", " + introductoryWords.getName() + "весь " + rocks.getName() + rocks.getType() + "был пронизан ");
        tunnels.underground();
        System.out.println(". ");
    }

    String getName() { return name; }
    String getType() { return type; }
}
