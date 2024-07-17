package br.edu.ifpb.eda.cli;

import java.util.Scanner;

public class Menu {
    public static final Scanner scanner = new Scanner(System.in);
    public static final int EXIT_CODE = 5;
    public static final String[] OPTIONS = {
            "Adicionar Produto",
            "Listar Produto",
            "Retirar Produto",
            "Checar Produto",
            "Sair"
    };

    public int choice() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < OPTIONS.length; i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(" - ");
            stringBuilder.append(OPTIONS[i]);
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder.toString());
        return scanner.nextInt();
    }
}