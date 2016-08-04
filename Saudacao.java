import javax.swing.JOptionPane;
import java.util.Scanner;

class Saudacao {

   public static void main(String args[]){
     // System.out.println("Digite o nome do aluno: ");

     // Scanner entrada = new Scanner(System.in);

      String nome = JOptionPane.showInputDialog( "Digite seu nome");
      JOptionPane.showMessageDialog(null, nome + " Bem vindo ao curso");
      //Aqui criamos o objeto que irá receber o nome do aluno
     // String nome = entrada.nextLine();

     // System.out.println(nome
     //    + " Bem vindo ao curso ");

   }


}
