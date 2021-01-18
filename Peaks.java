public class Peaks extends Mountains implements IsCreatingByNature {

    public Peaks(String type, Part part, int height, Adjectives adjective) {
        super(type, part, height, adjective);
        this.part = Part.PEAKS;
    }

    public void darkened(Adjectives adjective, SnowLine snowLine){
        System.out.print(adjective.getName()+"темневшим над "+snowLine.getType()+", ");
    }

}
