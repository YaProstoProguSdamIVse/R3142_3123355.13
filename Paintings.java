class Paintings implements IsCreatingByPeople {
    private String author;
    private String collection;
    private Adjectives adjective;

    public Paintings(String author, String collection, Adjectives adjective) {
        this.author = author;
        this.collection = collection;
        this.adjective = adjective;
    }

    public void info(Paintings paintings) {
        System.out.println(paintings.adjective.getName()+"картины "+paintings.getAuthor()+"а "+"из "+paintings.getCollection()+".");
    }

    public String getAuthor() {
        return author;
    }
    public String getCollection() {
        return collection;
    }
}