package Ex017;

public class Main {
    public static void main(String[] args) {
        int valor_car = 50000;
        int valor_parcela = 2000;
        if(valor_parcela<1000){
            System.out.println("A parcela não pode ser menor que 1000R$");
            return;
        }else{
            int quantas_vezes = valor_car/valor_parcela;
            System.out.println("o carro pode ser parcelado em "+quantas_vezes+" vezes e o valor da parcela é "+valor_parcela);
        }

        
    }
}
