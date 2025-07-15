import java.util.*;
import java.io.*;

public class inputout {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== * Scanner Input * ===");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.println("* Hello " + name + ", you're " + age + " years old. *");

        System.out.println("\n=== * BufferedReader Input * ===");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("City: ");
        String city = br.readLine();
        System.out.print("Pincode: ");
        int pin = Integer.parseInt(br.readLine());
        System.out.println("* You're from " + city + " - " + pin + " *");

        sc.close();
        br.close();
    }
}