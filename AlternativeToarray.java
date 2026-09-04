import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AlternativeToarray {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        ArrayList<String> names = new ArrayList<String>();
        System.out.println("Enter name:");
        names.add(br.readLine());
        String choice;
        do {
            System.out.println("Do you wanna add more? (yes/no)");
            choice = br.readLine();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Enter name:");
                names.add(br.readLine());
            }

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Names are: " + names);
    }
}