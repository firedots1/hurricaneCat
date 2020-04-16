import java.util.Scanner;

public class Hurricane {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Wind Speed: ");
        i = input.nextInt();
        if ((i >= 74) && (i <= 95))
        {
            System.out.println("This is an Category 1 hurricane.");
        }
        else if ((i >= 96) && (i <= 110))
        {
            System.out.println("This is an Category 2 hurricane. Please Find Shelter!");
        }
        else if ((i >= 111) && (i <= 129))
        {
            System.out.println("This is an Category 3 hurricane. Please Find Shelter!");
        }
        else if ((i >= 130) && (i <= 156))
        {
            System.out.println("This is an Category 4 hurricane. Please Find Shelter!");
        }
        else if (i >= 157)
        {
            System.out.println("This is an Category 5 hurricane. Please Find Shelter Immediately!!!");
        }
        else
            {
            System.out.println("This is a undefined Category of an hurricane, anything below 74, is undefined!");
            }
    }
}
