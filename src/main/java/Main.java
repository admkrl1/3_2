// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj długość boku trójkąta: ");
    int dlugoscBoku = scanner.nextInt();

    
    
    for (int i = 1; i <= dlugoscBoku; i++) {
        for (int j = 1; j <= dlugoscBoku; j++) {
            if (i == dlugoscBoku || j == 1 || j == i) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    
    for (int k = 1; k <= dlugoscBoku; k++) {
      for (int l = 1; l <= dlugoscBoku + 1 - k; l++) {
              System.out.print("  ");
      }

      for (int l = 1; l <= k; l++))
      System.out.println();
    }
    
    scanner.close();
  
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}