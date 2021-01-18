public enum Sourse {
    DESCRIPTION("описания "),
    DREAM("мечты "),
    STORY("истории "),
    IMAGINATION("представления "),
    BOOK("книги "),
    MOVIE("фильмы "),
    NEWSPAPER("газеты ");

    private String name;

    Sourse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

