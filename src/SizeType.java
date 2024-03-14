public enum SizeType {
    SMALL("Mały", 3),
    MEDIUM("Średni",2),
    BIG("Duży",1);

    private final String translation;
    private int test;

    SizeType(String translation, int test) {
        this.translation = translation;
        this.test = test;
    }

    public String getTranslation(){
        return translation;
    }

    public int getTestValue(){
        return test;
    }
}