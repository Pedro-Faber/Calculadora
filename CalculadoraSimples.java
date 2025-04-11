import java.util.Scanner;

public class CalculadoraSimples{
    public static void main(String[] args) {
        //Declaração de varíaveis
        int n1, n2, total, op;

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples -- \n");

        //Menu
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Sair");

        //Opção do usuário
        System.out.print("Opção: ");
        op = entrada.nextInt();

        if(op == 1){
            System.out.println("Soma Simples...");

            //Entradas
            System.out.println("Informe N1: ");
            n1 = entrada.nextInt();
            System.out.println("Informe N2:");
            n2 = entrada.nextInt();
            
            //Processamento
            total = n1 + n2;

            //Saída
            System.out.println(n1 + " + " + n2 + " = " + total);
        }else if(op == 2){
            System.out.println("Subtração...");

            //Entrada
            System.out.print("Informe N1: ");
            n1 = entrada.nextInt();
            System.out.print("Informe N2: ");
            n2 = entrada.nextInt();

            //Processamento
            total = n1 - n2;

            //Saída
            System.out.println(n1 + " - " + n2 + " = " + total);

        } else if(op == 3){
            System.out.println("\n\n Forte abraço!");
        } else {
            System.out.println("Opção " + op + " incorreta!");
        }

        
    }
}