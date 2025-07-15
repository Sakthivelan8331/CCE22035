class DataTypesCombination {
    byte b = 127;
    short s = 32000;
    int i = 100000;
    long l = 10000000000L;
    float f = 12.34f;
    double d = 12345.6789;
    char c = 'Z';
    boolean bool = true;
    String str = "Data Types";

    void show() {
        System.out.println("* byte: " + b);
        System.out.println("* short: " + s);
        System.out.println("* int: " + i);
        System.out.println("* long: " + l);
        System.out.println("* float: " + f);
        System.out.println("* double: " + d);
        System.out.println("* char: " + c);
        System.out.println("* boolean: " + bool);
        System.out.println("* String: " + str);
    }

    public static void main(String[] args) {
        DataTypesCombination data = new DataTypesCombination();
        data.show();
    }
}