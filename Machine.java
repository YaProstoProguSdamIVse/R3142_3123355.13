public class Machine implements IsCreatingByPeople {
    private Type type;
    private String model;
    private int weight;

    public Machine(Type type,String model, int weight) {
        this.type = type;
        this.model = model;
        this.weight = weight;
    }

    public enum Type {
        PLANE("самолет "),
        CAR("автомобиль "),
        SHIP("корабль "),
        HELICOPTER("вертолет ");

        private String name;

        Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }
    
    public Type getType() {
        return type;
    }

}
