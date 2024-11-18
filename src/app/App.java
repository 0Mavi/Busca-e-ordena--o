package app;

import java.util.Scanner;

import algoritmos.Busca;
import algoritmos.Ordenacao;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        int[] arr = null;

        while (op != 7) {
            if(arr != null){
                Ui.imprimirArray(arr);
                Ui.imprimirTraco();
            }

            op = Ui.menuOpcao(sc);
            String tipoOrdenacao = "";

            if(op > 0 && op < 6 && arr == null){
                System.out.println("Primeiro gere uma array!!");
                op = 6;
            }
            switch (op) {
                case 1:
                    Ordenacao.bubbleSort(arr);
                    tipoOrdenacao = "Bubble Sort";
                    break;
                case 2:
                    Ordenacao.insertionSort(arr);
                    tipoOrdenacao = "Insertion Sort";
                    break;
                case 3:
                    Ordenacao.selectionSort(arr);
                    tipoOrdenacao = "Selection Sort";
                    break;
                case 4:
                    Ui.busca(sc, arr);
                    break;
                case 5:
                    Ui.embaralharArray(arr);
                    break;
                case 6:
                    arr = Ui.gerarArray(sc);
                    break;
                case 7:
                    break;
                case 8:
                    Ordenacao.quickSort(arr, 0, arr.length - 1); 
                    tipoOrdenacao = "Quick Sort";
                    Ui.imprimirArray(arr); 
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }


            Ui.imprimirTraco();
            if (op > 0 && op < 4 || op == 8) {
                Ui.imprimirArray(arr);
                System.out.println("Ordenada por " + tipoOrdenacao);
            }
            Ui.esperarEnter(sc);
            Ui.imprimirTraco();
        }
        System.out.println("Obrigado por usar nosso sistema!");
    }

    
}
