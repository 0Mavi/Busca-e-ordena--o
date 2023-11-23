package app;

import java.util.Scanner;

public class Ui {


    public static int[] gerarArray(Scanner sc){
        System.out.print("Digite o tamanho da array: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("""
                \nDeseja que o array seja gerado aleatoriamente?

                1 - Sim
                2 - Não
                """);
        int op = sc.nextInt();

        if (op == 1){
            for(int i = 0; i < arr.length; i++){
                arr[i] = (int) (Math.random() * 100 + 1);
            }
        } else {
            System.out.println("Digite os valores do array: \n");
            for (int i = 0; i < arr.length; i++){
                System.out.print(i + " = ");
                arr[i] = sc.nextInt();;
            }
        }

        return arr;
    }

    public static int menuOpcao(Scanner sc){
        System.out.println("""
                Escolha um tipo de ordenação:

                1 - Bubble Sort
                2 - Selection Sort
                3 - Insertion Sort
                4 - Sair
                """);

        return sc.nextInt();
    }

    public static int opcaoBusca(Scanner sc){
        System.out.println("""
                Escolha o tipo de busca:

                1 - Busca Linear
                2 - Busca Binaria
                3 - Sair
                """);
        
        return sc.nextInt();
    }

    public static int numeroBusca(Scanner sc){
        System.out.print("Digite o numero que deseja buscar: ");

        return sc.nextInt();
    }

    public static void imprimirArray( int[] arr){ 

        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n ");
    }

    public static void imprimirTraco(){
        System.out.println("-------------------------------------");
        System.out.println(" ");
    }
}
