package algoritmos;

public class Busca {

    public static void buscaLinear (int[] arr, int num){

        /*
            1. Percorra a array
            2. Compare o elemento atual com o elemento buscado
            3. Se o elemento atual for igual ao elemento buscado, retorne a posição do elemento atual
            4. Se o elemento atual for diferente do elemento buscado, continue a percorrer a array
            5. Se o elemento buscado não for encontrado, retorne uma mensagem de erro
         */

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

        /*
            1. Defina o inicio, meio e fim da array
            2. Compare o elemento do meio com o elemento buscado
            3. Se o elemento do meio for igual ao elemento buscado, retorne a posição do elemento do meio
            4. Se o elemento do meio for menor que o elemento buscado, defina o inicio como o elemento do meio + 1
            5. Se o elemento do meio for maior que o elemento buscado, defina o fim como o elemento do meio - 1
            6. Se o inicio for maior que o fim, retorne uma mensagem de erro
         */

        int tam = arr.length;

        int inicio = 0;         
        int meio = 0;         
        int fim = tam - 1;

        // Enquanto o inicio for menor ou igual ao fim
        while (inicio <= fim) {
            // Define o meio como a metade da array
            meio = (fim + inicio) / 2;

            // Se o elemento do meio for igual ao elemento buscado, retorne a posição do elemento do meio
            if(arr[meio] == num) {
                System.out.println("Encontrou o número: " + num + " na posição: " + meio);
                
                break;
            }

            // Se o elemento do meio for menor que o elemento buscado, defina o inicio como o elemento do meio + 1
            if(arr[meio] < num) {
                inicio = meio + 1;
              } else {
                fim = meio - 1;
            }

            // Se o inicio for maior que o fim, retorne uma mensagem de erro
            if(inicio > fim) {
                System.out.println("Não encontrou o número: " + num);
            }


        }
    }
}
