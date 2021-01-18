public enum Frequency {
    ONCEAGAIN("в очередной раз "),
    SOMETIMES("иногда "),
    OFTEN("часто "),
    MOREOFTEN("Чаще всего "),
    ASOFTEN("то и дело "),
    MORE("все большее количество "),
    NOCHANGES(""),
    LESS("все меньшее количество "),
    SIMILAR("точно так же "),
    RATHER("скорее уж ");

    private String name;

    Frequency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
