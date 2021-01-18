public enum IntroductoryWords {
    PROBABLY("Скорее всего, "),
    HOWEVER("Впрочем, "),
    APPARENTLY("видимо, "),
    NONETHELESS("Тем не менее, ");

    private String name;

    IntroductoryWords(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}