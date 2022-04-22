public class Constructor {

    private long parameter;

    public Constructor (long parameter) {
        if (parameter > 0 && parameter < 120) {
            this.parameter = parameter;
        }
        else throw new RuntimeException("WTF?");
    }
}
