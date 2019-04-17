
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print(" nome "); 
        carro01.nome = scan.next();
        
        System.out.print(" marca ");
        carro01.marca = scan.next();
        
        System.out.print(" cor ");
        carro01.cor = scan.next();
        
        System.out.print("fabricacao");
        carro01.fabricacao = scan.next ();
        
        System.out.print ("lagura");
        carro01.largura = scan.next ();
        
        System.out.print ("peso");
        carro01.largura = scan.next ();

        System.out.println("Nome: " + carro01.nome);
        System.out.println("Marca: " + carro01.marca);
        System.out.println("Cor: " + carro01.cor);
        System.out.println("fabricacao" + carro01.fabricacao);
        System.out.println("largura" + carro01.largura);
        
    }0
}
