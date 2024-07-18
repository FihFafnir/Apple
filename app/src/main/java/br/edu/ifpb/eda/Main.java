package br.edu.ifpb.eda;

import br.edu.ifpb.eda.cli.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        int selectedOption = menu.choice();
        while (selectedOption != Menu.EXIT_CODE) {
            switch (selectedOption) {
                case 1:
                    menu.addProduct();
                    break;
                case 2:
                    menu.listProducts();
                    break;
                case 3:
                    menu.removeProduct();
                    break;
                case 4:
                    menu.searchProduct();
                    break;
            }
            selectedOption = menu.choice();
        }
    }
}
