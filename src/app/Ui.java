package app;

import algoritmos.Busca;

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

        System.out.println("Array gerada com sucesso!");
        return arr;
    }

    public static int menuOpcao(Scanner sc){
        System.out.println("""
                Escolha o que deseja fazer:

                1 - Bubble Sort
                2 - Insertion Sort
                3 - Selection Sort
                4 - Buscar
                5 - Embaralhar array
                6 - Gerar array
                7 - Sair
                8 - Quicksort
                """);

        return sc.nextInt();
    }

    public static void busca(Scanner sc, int[] arr){
        System.out.println("""
                Escolha o tipo de busca:

                1 - Busca Linear
                2 - Busca Binaria
                3 - Sair
                """);
        int op = sc.nextInt();
        int num = numeroBusca(sc);
        switch (op) {
            case 1:
                Busca.buscaLinear(arr, num);
                break;
            case 2:
                if(!estaOrdenada(arr)){
                    System.out.println("A array precisa estar previamente ordenada!");
                    break;
                }
                Busca.buscaBinaria(arr, num);
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }

    public static int numeroBusca(Scanner sc){
        System.out.print("Digite o numero que deseja buscar: ");

        return sc.nextInt();
    }

    public static void imprimirArray( int[] arr){
        System.out.print("Sua array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println("\n ");
    }

    public static void esperarEnter(Scanner sc){
        System.out.println("Pressione ENTER para continuar...");
        sc.nextLine();
        sc.nextLine();
    }

    public static void imprimirTraco(){
        System.out.println("-------------------------------------");
        System.out.println(" ");
    }

    public static boolean estaOrdenada(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static boolean estaNula(int[] arr){
        if(arr == null){
            System.out.println("Primeiro gere uma array!");
            return true;
        }
        return false;
    }

    public static void embaralharArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int pos = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        System.out.println("Embaralhando array!");
    }
}
