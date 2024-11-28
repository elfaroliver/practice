package Misc;

import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BilamengunSwitch {
  public static void main(String[] args) {
    try {
      Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);
      System.out.println("Veldu mengunarflokk með tölu");
      int mengun = input.nextInt();
      switch (mengun) {
        case 1:
          System.out.println("Ertu hjólreiðamanneskja?");
          break;
        case 2:
        case 3:
        case 4:
          System.out.println("Leimmér að giska. Yaris?");
          break;
        case 5:
        case 6:
          System.out.println("Núna erum við komin í 25 ára station");
          break;
        case 7:
          System.out.println("Þú átt barn");
          break;
        case 8:
          System.out.println("Strætó- eða vörubílstjóri");
          break;
        case 9:
          System.out.println("Jeppi og fjögur börn");
          break;
        case 10:
          System.out.println("Einkaflugstjóri Queen TayTay");
          break;
        default:
          System.out.println("Þú verður að velja tölu milli 1-9");
      }
    } catch (InputMismatchException e) {
      System.out.println("Rangt inntak, vinsamlegast sláðu inn tölu hafðu hana einnig á bilinu 1-9"/* + e.getMessage()*/);
    }
  }
}
