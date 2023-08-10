import java.util.Scanner;

/**
 * 8/10/2023 SimpleProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a1 = sc.nextLine();
    String a2 = sc.nextLine();
    System.out.println(a1 + a2);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a + b;

    System.out.println(c);
  }
}
