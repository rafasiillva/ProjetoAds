public class Main {

    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 9;
        int num3 = 7;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        
        float total1 = (num1+num2+num3)/3;
        float total2 = (num4+num5+num6)/3;

      System.out.println("A primeira média é: "+total1);
      System.out.println("A segunda média é: "+total2);
     
      float soma = total1+total2;

      System.out.println("A soma das médias é: "+soma);
      System.out.println("A media da soma das médias é: "+soma/2);
     
     }
    }