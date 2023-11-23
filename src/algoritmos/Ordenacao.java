package algoritmos;

public class Ordenacao {
    
    public static void bubbleSort(int[] arr){
        /*
           1. Compara o elemento atual com o próximo elemento.
           2. Se o elemento atual for maior que o próximo elemento, troque-os.
           3. Se o elemento atual for menor que o próximo elemento, não faça nada.
           4. Repita o passo 1 até o final do array.
           5. Repita os passos 1, 2, 3 e 4 até que não haja mais trocas.
        */

        int tam = arr.length;
        int temp = 0;

        // Percorre a array
        for(int i = 0; i < tam; i++){
            // Percorre a array a partir do elemento atual
            for(int j = 1; j < (tam - i); j++){
                // Compara o elemento atual com o próximo elemento
                if (arr[j-1] > arr[j]){
                    // Troca os elementos se o elemento atual for maior que o próximo elemento
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        /*
          1. Encontre o menor elemento da array.
          2. Troque o menor elemento com o primeiro elemento da array.
          3. Repita o passo 1 e 2 até que a array esteja ordenada.
         */

        int tam = arr.length;
        int temp = 0;
        int min = 0;

        // Percorre a array
        for(int i = 0; i < tam; i++){
            // Define o primeiro elemento como o menor
            min = i;
            // Percorre a array a partir do elemento atual
            for(int j = i; j < tam ; j++){
                // Compara o elemento atual com o menor
                if(arr[j] < arr[min]){
                    // Se o elemento atual for menor que o menor, define o elemento atual como o menor
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
   }

   public static void insertionSort(int[] arr){
        /*
            1. Percorra a array a partir do segundo elemento.
            2. Compare o elemento atual com seu antecessor.
            3. Se o elemento atual for menor que seu antecessor, troque-os.
            4. Repita o passo 2 e 3 até que o elemento atual seja maior que seu antecessor.
            5. Repita os passos 1, 2, 3 e 4 até que a array esteja ordenada.
         */

        int tam = arr.length;
        int temp = 0;

        // Percorre a array a partir do segundo elemento
        for(int i = 1; i < tam; i++){
            // define o elemento atual como o elemento a ser comparado
            int x = i;
            // Compara o elemento atual com seu antecessor até que o elemento atual seja maior que seu antecessor
            while (x > 0 && arr[x-1] > arr[x]) {
                temp = arr[x];
                arr[x] = arr[x-1];
                arr[x-1] = temp;
                x = x - 1;
            }
        }
   }
}
