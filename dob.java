import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

class dob
{
    public static void main(String[] args) {
        LocalDate dateOfBirth;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your date of birth (yyyy - mm - dd) : ");
        String temp = scn.nextLine();
        dateOfBirth=LocalDate.parse(temp);
        LocalDate localDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, localDate);
        String age = period.getYears()+" years"+period.getMonths()+" months"+period.getDays()+" days";
        System.out.println(localDate);
        System.out.println("Your Dob is : "+dateOfBirth);
        System.out.println(age);
        scn.close();
    }
}