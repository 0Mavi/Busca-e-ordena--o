package app;

import java.util.Scanner;

import algoritmos.Busca;
import algoritmos.Ordenacao;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Ui.imprimirTraco();

        int[] arr = Ui.gerarArray(sc);

        Ui.imprimirTraco();
        
        System.out.print("Array gerada: ");
        Ui.imprimirArray(arr);

        Ui.imprimirTraco();

        int op = Ui.menuOpcao(sc);

        switch (op) {
            case 1:
                Ordenacao.bubbleSort(arr);
                break;
            case 2:
                Ordenacao.insertionSort(arr);
                break;
            case 3:
                Ordenacao.selectionSort(arr);
                break;
            default:
                System.out.println("Adios!");
                System.exit(0);
                break;
        }


        Ui.imprimirTraco();
        System.out.print("Array ordenada: ");
        Ui.imprimirArray(arr);

        op = Ui.opcaoBusca(sc);
        Ui.imprimirTraco();
        
        int num = Ui.numeroBusca(sc);
        

        switch (op) {
            case 1:
                Busca.buscaLinear(arr, num);
                break;
            case 2:
                Busca.buscaBinaria(arr, num);
                break;
            default:
                System.out.println("Adios!");
                System.exit(0);
                break;
        }



    }

    
}
