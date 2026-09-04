import java.util.Scanner;
public void main(String[] args) {
    Scanner d =new Scanner(System.in);
    System.out.println("Enter a value:");
    String text = d.nextLine();
    int vowelcount = 0;
    System.out.println("\nVowels found in the string:");
    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);
        switch(Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + "");
                vowelcount++;
                break;
                default:
                    break;
        }
    }
    System.out.println("\nTotal number of vowels: " + vowelcount);
    d.close();
}
