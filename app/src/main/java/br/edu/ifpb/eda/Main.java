package br.edu.ifpb.eda;

import br.edu.ifpb.eda.cli.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int selectedOption = menu.choice();
        while (selectedOption != Menu.EXIT_CODE) {
            selectedOption = menu.choice();
        }
    }
}
