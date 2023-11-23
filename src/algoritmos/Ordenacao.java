package algoritmos;

public class Ordenacao {
    
    public static void bubbleSort(int[] arr){
        int tam = arr.length;
        int temp = 0;

        for(int i = 0; i < tam; i++){
            for(int j = 1; j < (tam - i); j++){
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        int tam = arr.length;
        int temp = 0;
        int min = 0;

        for(int i = 0; i < tam; i++){
            min = i;
            for(int j = i; j < tam ; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
   }

   public static void insertionSort(int[] arr){
        int tam = arr.length;
        int temp = 0;

        for(int i = 1; i < tam; i++){
            int x = i;
            while (x > 0 && arr[x-1] > arr[x]) {
                temp = arr[x];
                arr[x] = arr[x-1];
                arr[x-1] = temp;
                x = x - 1;
            }
        }
   }
}
