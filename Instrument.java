public enum Instrument {
    BINOCULARS("в биноколь "),
    AERIALCAMERA("аэрокамерой ");

    private String type;

    Instrument(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
