package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Ui.imprimirTraco();

        int[] arr = Ui.gerarArray(sc);

        Ui.imprimirTraco();
        
        Ui.imprimirArray(arr);

        Ui.imprimirTraco();

        Ui.menuOpcao(sc);
    }

    
}
