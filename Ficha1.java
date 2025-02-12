public class Ficha1 {

    public Ficha1(){

    }

    public double celsiusToFarenheit(double graus){

        double far = ( graus * 9/5 ) + 32;

        return far;

    }

    public int maximoNumeros(int a, int b){

        if (a > b){
            return a;
        } else if (b > a){
            return b;
        }

        return 0;
    }

    public String criaDescricaoConta(String nome, double saldo){

        return "O titular da conta " + nome + " tem um saldo de " + saldo + " euros.";

    }

    public double eurosParaLibras(double valor, double taxaConversao){

        double conversao = valor * taxaConversao;

        return conversao;

    }

    public double mediaDeDoisNumeros(int a, int b){
        double media = (a+b)/2;
        return media;
    }

    public int numeroMenor(int a, int b){
        if (a < b){
            return a;
        } else if (b < a){
            return b;
        }
        return 0;
    }

    public long factorial(int num){

        int i = num;

        long resFactorial = 1;

        if (i == 0){
            return resFactorial;
        } else {
            resFactorial = i * factorial(i-1);
        }
        return resFactorial;
    }

}
