import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Ficha2 {

    private int[] array1;
    private int[] array2;
    private int [] colecao;

    Scanner scanner = new Scanner(System.in);


    /*

    public Ficha2(int []colecao){
        this.colecao = colecao;
    }




    public Ficha2(int []array1 , int []array2){
        this.array1 = array1;
        this.array2 = array2;
    }
    */

    public Ficha2(int capacidade){
        this.datas = new LocalDate[capacidade];
        this.tamanho = 0;
    }

    public int calculaMinimo(){
        int min = Integer.MAX_VALUE;
        for ( int valor : this.colecao){
            if (valor < min){
                min = valor;
        }
    }
        return min;
    }

    public int[] subArray(int idx1, int idx2){
        int [] subarray = Arrays.copyOfRange(this.colecao, idx1, idx2);
        return subarray;
    }

    public int[] comumArray(int[] array1, int[] array2){

        int size = 0;

        for (int i : array1){
            for (int j : array2){
                if (i == j){
                    size++;
                    break;
                }
            }
        }

        int[] arrayComum = new int[size];
        int index = 0;

        for (int i : array1){
            for (int j : array2){
                if (i == j){
                    arrayComum[index] = i;
                    index++;
                }
            }
        }

        return arrayComum;

    }

    private LocalDate[] datas;
    private int tamanho;



}
