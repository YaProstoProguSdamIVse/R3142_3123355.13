public enum Adjectives {
    EXCRUCIATING("мучительный "),
    FLAT("ровная "),
    SMOOTH("гладкая "),
    EXCEPTIONAL("исключительная "),
    OUTLANDISH("диковинные "),
    INCOMPREHENSIBLE("непонятные "),
    // горы
    HIGH("высокие "),
    SNOWY("заснеженные "),
    GLOOMY("мрачные "),
    GENTLE("пологие "),
    FORMIDABLE("грозные "),
    // породы
    NUDE("обнаженный "),
    LIGHT("легкий "),
    DURABLE("прочный "),
    FRAGILE("хрупкий "),
    // картина
    MYSTERIOUS("загадочные "),
    // конструкции
    CORRECT("геометрически правильные "),
    STRANGE("странные "),
    UNUSUAL("Необычные "),
    //размер
    SMALL("маленькеие "),
    LITTLE("небольшие "),
    MEDIUM("средние "),
    BIG("большой "),
    GIANT("гигантские ");

    private String name;

    Adjectives(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
