import java.util.Scanner;
class scanner {
    public static void main(String[] args) {
        System.out.println("Enter your name");
       try(Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            System.out.println("Hello " + name);
        }
    }
}