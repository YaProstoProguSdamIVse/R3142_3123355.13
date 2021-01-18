public enum Times {
    FOREVER("вечно "),
    EVERLASTING("веки вечные "),
    LONGYEARS("долгие годы "),
    DAYNIGHTS("днями и ночами "),
    INSTANT("лишь мгновение "),;

    private String name;

    Times(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
