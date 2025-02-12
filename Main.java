import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ficha1 ficha = new Ficha1();


        /*EXERCICIO 1

        System.out.println("Introduza uma temperatura em Celsius: ");

        double temp = scanner.nextDouble();
        double far = ficha.celsiusToFarenheit(temp);

        System.out.println("A temperatura " + temp + " em Celsius, equivale a " + far + " em Farenheit.");

        */



        /* EXERCICIO 2

        System.out.println("Introduza o valor para a:");
        int a = scanner.nextInt();

        System.out.println("Introduza o valor para b:");
        int b = scanner.nextInt();

        if (a==b){
            System.out.println("Os valores introduzidos sao iguais.");
        } else {
            int resultado = ficha.maximoNumeros(a,b);
            System.out.println("O maior numero entre os dois valores é: " + resultado);
        }

        */


        /* EXERCICIO 3

        System.out.println("Introduza o nome da conta: ");
        String nome = scanner.next();

        System.out.println("Introduza o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        System.out.println(ficha.criaDescricaoConta(nome, saldo));
        */

        /* EXERCICIO 4

        System.out.println("Introduza o valor em euros: ");
        Double valor = scanner.nextDouble();

        System.out.println("Introduza a taxa de conversao: ");
        double taxaConversao = scanner.nextDouble();

        double resultado = ficha.eurosParaLibras(valor,taxaConversao);

        System.out.println("O valor " + valor + " em euros, equivale a " + resultado + " em libras.");
        */

        /* EXERCICIO 5

        System.out.println("Introduza o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduza o segundo numero: ");
        int num2 = scanner.nextInt();

        double valorMedia = ficha.mediaDeDoisNumeros(num1,num2);

        int numeroMaior = ficha.maximoNumeros(num1,num2);
        int numeroMenor = ficha.numeroMenor(num1,num2);

        System.out.println("Ordem dos numeros de forma decrescente: " + numeroMaior + " e " + numeroMenor + " e a media entre eles é: " + valorMedia);
        */

        /* EXERCICIO 6

        System.out.println("Introduza o numero para fatorial: ");
        int num = scanner.nextInt();

        long fatorialResultado = ficha.factorial(num);
        System.out.println(fatorialResultado);

        */
    }
}
