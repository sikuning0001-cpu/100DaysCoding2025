import java.util.Scanner;

class Main{
  static String sayang(String nama){
    return "aku sayang " + nama;
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String nama = in.nextLine();
    System.out.printf("%s",sayang(nama));
  }
}