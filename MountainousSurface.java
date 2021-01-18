public class MountainousSurface extends Mountains implements IsCreatingByNature {
    public MountainousSurface(String type, Part part, int height, Adjectives adjective) {
        super(type, part, height, adjective);
        this.part=Part.SYNONYMS;
    }

    public void description(MountainousSurface mountainousSurface, Cave cave, Adjectives adjective) {
        System.out.print(mountainousSurface.getType() + "вблизи " + cave.getName() + "была " + mountainousSurface.adjective.getName() + "и " + adjective.getName());
    }

}
