
public class Human {
    private String name;
    private int age;
    private Male male;
    protected Pronoun pronoun;
    private boolean pilotAbillity;

    public Human(String name, int age, Male male, Pronoun pronoun, boolean pilotAbillity) {
        this.name = name;
        this.male = male;
        this.age = age;
        this.pronoun = pronoun;
        this.pilotAbillity = pilotAbillity;
    }

    public enum Male {
        MALE,
        FEMALE,
        UNKNOWN
    }

    public enum Pronoun {
        I("я ","мне ","мой "),
        HE("он ","ему ","его "),
        WE("мы ","нам ","наш ");

        private String normal;
        private String objective;
        private String possessive;

        Pronoun(String normal, String objective, String possessive) {
            this.normal = normal;
            this.objective = objective;
            this.possessive = possessive;
        }

        public void approaching(Peaks peak) {
            System.out.print("Приближаясь к "+peak.adjective.getName()+peak.getType()+", ");
        }

        public void notice(Pronoun pronoun, Frequency frequency) {
            System.out.print(pronoun.getNormal()+"замечал");
            if (pronoun.equals(pronoun.WE)) {
                System.out.print("и "); }
            else { System.out.print(" "); }
            System.out.print(frequency.getName());
        }

//        public void understood(Pronoun pronoun){
//            System.out.print(pronoun.getNormal()+" уже понял");
//            if (pronoun.equals(pronoun.WE)) {
//                System.out.print("и, "); }
//            else { System.out.print(", "); }
//            System.out.print("что ");
//        }

        public String getNormal() {
            return normal;
        }
        public String getObjective() {
            return objective;
        }
        public String getPossessive() {
            return possessive;
        }
    }

    public void dressed(Human human, Boolean all){
        System.out.print("из одежды " + human.pronoun.getNormal());
        if (all == true){
            System.out.println("надели абсолютно все, что было.");
        }
        else {
            System.out.println("не надели абсолюно ничего.");
        }
    }

    public void vision (Boolean op, Human human, Adjectives adjective){
        System.out.print(human.pronoun.getNormal() + "почувствовали ");
        if (op == true){
            System.out.print("нехватку воздуха " + "и " + adjective.getName() + "холод: ");
        }
        else {
            System.out.print("комфорт и тепло: ");
        }

        class Porthole {
            String name = "иллюминаторы ";
            public void position(){
                if (op == true){ System.out.print("из-за плохой "); }
                else { System.out.print("из-за хорошей"); }

                System.out.print("видимости " + human.pronoun.getObjective() + "пришлось оставить " + name);

                if (op == true){
                    System.out.println("открытыми.");
                }
                else {
                    System.out.println("закрытыми.");
                }
            }
        }
        Porthole porthole = new Porthole();
        porthole.position();
    }

    public void takingOff( Boolean c, IntroductoryWords introductoryWords, Human human, Machine machine){
        if (c==true){
            System.out.print(introductoryWords.getName() + "взлетев, ");
        } else {
            throw new HaveTakenOff(introductoryWords.getName() + human.pronoun.getPossessive() + machine.getType().getName() + "не взлетел.");
        }
    }

    public void remember(Human human, Frequency frequency){
        System.out.print("и "+frequency.getName()+"вспоминал");
        if (human.pronoun.equals(human.pronoun.WE)) {
            System.out.print("и "); }
        else { System.out.print(" "); }
    }

    public void pilot(Human human, Machine machine) {
        System.out.print(human.getName()+" вел "+machine.getType().getName());
    }

    public void considered(Human human, Instrument instrument) {
        if (human.pronoun.equals(human.pronoun.I)) {
            System.out.print(", а " + human.pronoun.getNormal() + " рассматривал их " + instrument.getType() + ", "); }
        if (human.pronoun.equals(human.pronoun.HE)) {
            System.out.println("полюбоваться "+instrument.getType()+"на все эти диковины "); }
    }

    public void click(Instrument instrument, Frequency frequency) {
        System.out.print(frequency.getName()+"щелкая "+instrument.getType()+" ");
    }

    public void replace(Human human2, Frequency frequency) {
        System.out.print("и "+frequency.getName()+"замещая у руля "+human2.getName()+"а ");  //товарищА
    }

    public void toenable(Human human2) {
        if (human2.pronoun.equals(human2.pronoun.HE)) {
            System.out.print("чтобы и ему дать возможность "); }
        if (human2.pronoun.equals(human2.pronoun.I)) {
            System.out.print("чтобы и мне дать возможность "); }
    }

    public void pilotingDuration(IntroductoryWords introductoryWords, Human human) {
        System.out.print(introductoryWords.getName());
        if (human.pilotAbillity==true) {
            System.out.print("достаточно долго, "); }
        else {
            System.out.print("ненадолго, "); }

        if (human.pronoun.equals(human.pronoun.I)) {
            System.out.print("ибо мое искусство пилотирования "); }
        else if (human.pronoun.equals(human.pronoun.HE)) {
            System.out.print("ибо его искусство пилотирования "); }

        if (human.pilotAbillity==true) {
            System.out.println("было на высоте."); }
        else {
            System.out.println("оставляло желать лучшего."); }

    }

    public void understood(Human human, Boolean t){
        if (t == true) {
            System.out.print(human.getName() + " уже понял");
            if (human.pronoun.equals(human.pronoun.WE)) {
                System.out.print("и, ");
            } else {
                System.out.print(", ");
            }
            System.out.print("что ");
        }
        else { System.out.println(human.pronoun.getNormal() + "не понимал. "); }
    }

    public void liar(Human human, Boolean t){
        System.out.print("Всё, что говорил " + human.getName() + " оказалось ");
        if (t == true) { System.out.print("ложью: "); }
        else { System.out.print("правдой: "); }
    }

    public void seem(Human human, int quanity, Boolean coincidence) {
        if (coincidence == false) {
            System.out.print(", а " + human.getName() + " чудилось, что "); }
        else if ((quanity <= 1) & (coincidence == true)) {
            System.out.print(", то же самое померещилось и " + human.getName()); }
        else if ((quanity >= 2) & (coincidence == true)) {
            System.out.print("Нам с " + human.getName() + " несколько раз померещилось, что "); }
    }

    public void accompany(Human human){
        System.out.println(" , сопровождавшему " + human.getName() + "а " + ". ");
    }

    public String getName() {
        return name;
    }

    public void setName() throws DoPersonHaveName {
        if (name == ""){
            throw new DoPersonHaveName("Отсутствует имя");
        }
    }
}
