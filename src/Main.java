import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
      System.out.println("Lütfen Doğum yılınızı giriniz");
       int age=scanner.nextInt();
       int result=age%12;

      if(result==0){
          System.out.println("Maymun");
      }else if(result==1){
          System.out.println("Horoz");
      }else if(result==2) {
          System.out.println("Köpek");
      }else if(result==3) {
          System.out.println("Domuz");
      }else if(result==4) {
          System.out.println("Fare");
      }else if(result==5) {
          System.out.println(" Öküz");
      }else if(result==6) {
          System.out.println("Kaplan");
      }else if(result==7) {
          System.out.println("Tavşan");
      }else if(result==8) {
          System.out.println(" Ejderha");
      }else if(result==9) {
          System.out.println("Yılan");
      }else if(result==10) {
          System.out.println("At");
      }else if(result==11) {
          System.out.println("Koyun");
      }
    }
}