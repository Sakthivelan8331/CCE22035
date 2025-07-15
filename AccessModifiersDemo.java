class AccessModifiersDemo {
    public int publicNum = 10;
    private int privateNum = 20;
    protected int protectedNum = 30;
    int defaultNum = 40;

    public void showPublic() {
        System.out.println("* Public: " + publicNum);
    }

    private void showPrivate() {
        System.out.println("* Private: " + privateNum);
    }

    protected void showProtected() {
        System.out.println("* Protected: " + protectedNum);
    }

    void showDefault() {
        System.out.println("* Default: " + defaultNum);
    }

    void accessAll() {
        showPublic();
        showPrivate();
        showProtected();
        showDefault();
    }

    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();
        obj.accessAll();
    }
}