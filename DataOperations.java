class DataOperations {
    int number = 25;
    double price = 99.99;
    char grade = 'A';
    boolean isActive = true;
    String name = "Sakthi";

    void display() {
        System.out.println("* Number: " + number);
        System.out.println("* Price: " + price);
        System.out.println("* Grade: " + grade);
        System.out.println("* Active: " + isActive);
        System.out.println("* Name: " + name);
    }

    void operate() {
        number += 10;
        price *= 1.1;
        grade = 'B';
        isActive = !isActive;
        name = name.toUpperCase();
    }

    public static void main(String[] args) {
        DataOperations obj = new DataOperations();
        obj.display();
        System.out.println("----- After Operation -----");
        obj.operate();
        obj.display();
    }
}
