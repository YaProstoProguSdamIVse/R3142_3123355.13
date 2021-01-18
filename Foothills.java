public class Foothills extends Mountains implements IsCreatingByNature {

    public Foothills(String type, Part part, int height, Adjectives adjective) {
        super(type, part, height, adjective);
        this.part = Part.FOOTHILLS;
    }

    public void height(Foothills foothills){
        System.out.print(", достигавшем приблизительно " + height + " футов, ");
    }

}