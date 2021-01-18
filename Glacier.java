public class Glacier implements IsCreatingByNature{
    private String name;
    Age age;
    Adjectives adjective;

    public Glacier(String name, Age age, Adjectives adjective) {
        this.name = name;
        this.age = age;
        this.adjective = adjective;
    }

    public enum Age {
        ANCIENT("древние "),
        YOUNG ("молодые "),
        ETERNAL("вечные "),
        UNKNOWN ("неизвестные ");

        private String time;

        Age(String time) {
            this.time = time;
        }

        public String getAge() {
            return time;
        }
    }

    public String getName() {
        return name;
    }

}
