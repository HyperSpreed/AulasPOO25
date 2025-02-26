import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ficha1 ficha = new Ficha1();



        /*EXERCICIO 1 - ficha1

        System.out.println("Introduza uma temperatura em Celsius: ");

        double temp = scanner.nextDouble();
        double far = ficha.celsiusToFarenheit(temp);

        System.out.println("A temperatura " + temp + " em Celsius, equivale a " + far + " em Farenheit.");

        */



        /* EXERCICIO 2 - ficha1

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


        /* EXERCICIO 3 - ficha1

        System.out.println("Introduza o nome da conta: ");
        String nome = scanner.next();

        System.out.println("Introduza o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        System.out.println(ficha.criaDescricaoConta(nome, saldo));
        */

        /* EXERCICIO 4 - ficha1

        System.out.println("Introduza o valor em euros: ");
        Double valor = scanner.nextDouble();

        System.out.println("Introduza a taxa de conversao: ");
        double taxaConversao = scanner.nextDouble();

        double resultado = ficha.eurosParaLibras(valor,taxaConversao);

        System.out.println("O valor " + valor + " em euros, equivale a " + resultado + " em libras.");
        */

        /* EXERCICIO 5 - ficha1

        System.out.println("Introduza o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduza o segundo numero: ");
        int num2 = scanner.nextInt();

        double valorMedia = ficha.mediaDeDoisNumeros(num1,num2);

        int numeroMaior = ficha.maximoNumeros(num1,num2);
        int numeroMenor = ficha.numeroMenor(num1,num2);

        System.out.println("Ordem dos numeros de forma decrescente: " + numeroMaior + " e " + numeroMenor + " e a media entre eles é: " + valorMedia);
        */

        /* EXERCICIO 6 - ficha1

        System.out.println("Introduza o numero para fatorial: ");
        int num = scanner.nextInt();

        long fatorialResultado = ficha.factorial(num);
        System.out.println(fatorialResultado);

        */

        /* EXERCICIO 1 - ficha2

        System.out.println("Intoduza um array de numeros: ");
        System.out.println("Quantos numeros deseja introduzir: ");

        int lenght = scanner.nextInt();
        int[] colecao = new int[lenght];

        System.out.println("Introduza " + lenght + " numeros: ");

        for (int i = 0; i < colecao.length; i++) {
            int numero = scanner.nextInt();
            colecao[i] = numero;
        }

        Ficha2 ficha2 = new Ficha2(colecao);

        int minimo =ficha2.calculaMinimo();
        System.out.println("O menor valor é: " + minimo);

        System.out.println("Indique dois indices. ");
        System.out.println("Indice 1: ");
        int idx1 = scanner.nextInt();
        System.out.println("Indice 2: ");
        int idx2 = scanner.nextInt();

        int [] resultado_sub_array = ficha2.subArray(idx1, idx2);

        System.out.println("O sub array é: " + Arrays.toString(resultado_sub_array));


        System.out.println("Introduz quantos numeros tem o primeiro array: ");
        int lengthArray1 = scanner.nextInt();
        int [] array1 = new int[lengthArray1];

        System.out.println("Introduz os numeros para o primeiro array:");
        for (int i = 0; i < array1.length; i++) {
            int numero = scanner.nextInt();
            array1[i] = numero;
        }

        System.out.println("Introduz quantos numeros tem o segundo array: ");
        int lengthArray2 = scanner.nextInt();
        int [] array2 = new int[lengthArray2];

        System.out.println("Introduz os numeros para o segundo array:");
        for (int i = 0; i < array2.length; i++) {
            int numero = scanner.nextInt();
            array2[i] = numero;
        }

        Ficha2 ficha2 = new Ficha2(array1,array2);

        int [] resultadoComuns = ficha2.comumArray(array1, array2);

        System.out.println("O sub array comuns é: " + Arrays.toString(resultadoComuns));

         */

        /*EXERCICIO 3 - ficha2*/



        System.out.println("Intoduza um array de numeros: ");
        System.out.println("Quantos numeros deseja introduzir: ");

        int lenght = scanner.nextInt();
        int[] colecao = new int[lenght];

        System.out.println("Introduza " + lenght + " numeros: ");

        for (int i = 0; i < colecao.length; i++) {
            int numero = scanner.nextInt();
            colecao[i] = numero;
        }

        Ficha2 ficha2 = new Ficha2(colecao);

        int []arrayOrdenado =ficha2.ordenaArray(colecao);

        for (int i = 0; i < arrayOrdenado.length; i++) {
            System.out.println(arrayOrdenado[i]);
        }




    }
}
