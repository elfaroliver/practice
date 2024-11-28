package Misc;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class VikudagurSwitch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);
    System.out.println("Veldu vikudag með tölu");
    int vikudagur = input.nextInt();

    switch(vikudagur) {
      case 1:
        System.out.println("Þú hefur valið Sunnudag");
        break;
      case 2:
        System.out.println("Þú hefur valið Mánudag");
        break;
      case 3:
        System.out.println("Þú hefur valið Þriðjudag");
        break;
      case 4:
        System.out.println("Þú hefur valið Miðvikudag");
        break;
      case 5:
        System.out.println("Þú hefur valið Fimmtudag");
        break;
      case 6:
        System.out.println("Þú hefur valið Föstudag");
        break;
      case 7:
        System.out.println("Þú hefur valið Laugardag");
        break;
      default:
        System.out.println("Þú verður að velja tölu milli 1-7");
    }
  }
}
