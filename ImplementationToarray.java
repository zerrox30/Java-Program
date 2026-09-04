import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImplementationToarray{
    public static void main(String[] args) throws IOException{
        String[] names = new String[10];
        System.out.println("Enter names: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = -1;
        String choice = "y";
        while (true){
            try{
                names[++i] = br.readLine();
                System.out.println("Do you wanna add more ?");
                choice = br.readLine();
                if (choice.equals("yes"))
                    break;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array is full");
                System.out.println("Names Are: ");
                for (String name : names){
                    System.out.println(name);
                }
                break;  
            }
        }
    }
}