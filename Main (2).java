import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter your first name:");
    char firstName = scanner.next().charAt(0);
    
    System.out.println("Enter your middle name:");
    char middleName = scanner.next().charAt(0);
    
    System.out.println("Enter your last name:");
    char lastName = scanner.next().charAt(0);
    
    System.out.println("Your initials are " + firstName + middleName + lastName);
  }
} 