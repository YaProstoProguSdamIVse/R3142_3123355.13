public abstract class Mountains implements IsCreatingByNature {

    private static String type;
    Part part;
    protected int height;
    public Adjectives adjective;

    public Mountains(String type, Part part, int height, Adjectives adjective) {
        this.type = type;
        this.part = part;
        this.height = height;
        this.adjective = adjective;
    }

    public enum Part {
        PEAKS,
        SNOWLINE,
        HILLSIDE,
        FOOTHILLS,
        SYNONYMS
    }

    public static String getType() {
        return type;
    }

    public Adjectives getAdjective() {
        return adjective;
    }

}