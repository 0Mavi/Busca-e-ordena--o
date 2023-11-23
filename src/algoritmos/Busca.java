package algoritmos;

public class Busca {

    public static void buscaLinear (int[] arr, int num){
        int tam = arr.length;

        for(int i = 0; i < tam; i++){
            if(arr[i] == num ){
                System.out.println("\nPosição do numero: " + i);
                return;
            }
        }
        
        System.out.println("Numero não encontrado!");
    }

    public static void buscaBinaria(int[] arr, int num){
        int tam = arr.length;

        int inicio = 0;         
        int meio = 0;         
        int fim = tam - 1;


        while (inicio <= fim) {
            meio = (fim + inicio) / 2;

            if(arr[meio] == num) {
                System.out.println("Encontrou o número: " + num + " na posição: " + meio);
                
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
