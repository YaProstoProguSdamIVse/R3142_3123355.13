public class Hillside extends Mountains implements IsCreatingByNature {

    public Hillside(String type, Part part, int height, Adjectives adjective) {
        super(type, part, height, adjective);
        this.part = Part.HILLSIDE;
    }

    public void adjoining(Hillside hillside) {
        System.out.print(", примыкающие к " + hillside.getType() + ", ");
    }

}
