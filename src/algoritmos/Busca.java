package algoritmos;

public class Busca {

    public static void buscaLinear (int[] arr, int num){
        int tam = arr.length;

        System.out.println("Posições percorridas: ");
        for(int i = 0; i < tam; i++){
            if(arr[i] == num ){
                System.out.println(" ");
                System.out.println("Posição do numero: " + i);
                return;
            }
            System.out.print(i + " ");
        }

    }

    public static void buscaBinaria(int[] arr, int num){
        int tam = arr.length;

        int inicio = 0;         
        int meio = 0;         
        int fim = tam - 1;


        while (inicio <= fim) {
            meio = (fim + inicio) / 2;

            if(arr[meio] == num) {
                System.out.println("Encontrou o número: " + num);
                break;
            }

            if(arr[meio] < num) {
                inicio = meio + 1;
              } else {
                fim = meio - 1;
            }

            if(inicio > fim) {
                System.out.println("Não encontrou o número: " + num);
            }

        }
    }
}
