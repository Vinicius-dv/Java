package Ex018;

public class Main {
    public static void main(String[] args) {
        int [] idades = new int[3];
        idades[0] = 10;
        idades[1] = 22;
        idades[2] = 321;
        int soma_arr = 0;
        for(int i=0;i<idades.length;i++){
            for(int j=i+1;j<idades.length;j++){
                soma_arr = idades[i]+idades[j];
            }
        }
        System.out.println(soma_arr);
    }
}
