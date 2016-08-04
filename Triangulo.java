import java.util.Scanner;

class Triangulo{

   static float base = 0;
   static float altura = 0;
   static float resultado = 0;

   public static void main(String args[]){
         Scanner entrada = new Scanner(System.in);
         System.out.println("Digite o valor da base");
         base = entrada.nextFloat();

         System.out.println("Digite o valor da altura");
         altura = entrada.nextFloat();

         resultado = (base * altura)/2.0f;

         System.out.println("O valor do triangulo é: "+ resultado);

   }

}