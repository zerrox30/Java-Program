//checked exception handling b/w two ways
//1st way: 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionInput2 {
    public static void main(String[] args) {
        String line = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a line: ");
        try {
            line = br.readLine();
        }
          catch (IOException e) {
            e.printStackTrace();
    }
    System.out.println("You entered: " + line);
    }
}
