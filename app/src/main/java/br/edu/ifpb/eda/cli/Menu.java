package br.edu.ifpb.eda.cli;

import java.util.Scanner;

import br.edu.ifpb.eda.product.Products;
import br.edu.ifpb.eda.utils.NormalizerProductName;

public class Menu {
    public static final String[] OPTIONS = {
            "Adicionar Produto",
            "Listar Produto",
            "Retirar Produto",
            "Checar Produto",
            "Sair"
    };
    public static final int EXIT_CODE = OPTIONS.length;
    public static final String WINDOW_SEPARATOR = "=============================================================\n";
    public static final Scanner scanner = new Scanner(System.in);
    public static final Products products = new Products();

    public int choice() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(WINDOW_SEPARATOR);
        for (int i = 0; i < OPTIONS.length; i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(" - ");
            stringBuilder.append(OPTIONS[i]);
            stringBuilder.append("\n");
        }
        stringBuilder.append(WINDOW_SEPARATOR);
        System.out.print(stringBuilder.toString());
        return scanner.nextInt();
    }

    public void addProduct() {
        String productName;
        int productAmount;

        System.out.print(WINDOW_SEPARATOR);
        System.out.print("Digite o nome do produto à ser adicionado: ");
        productName = scanner.next();
        System.out.print("Digite a quantidade do produto à ser adicionado: ");
        productAmount = scanner.nextInt();
        System.out.print(WINDOW_SEPARATOR);

        products.add(productName, productAmount);

        System.out.println("Produto Adicionado com Sucesso.");
    }

    public void listProducts() {
        System.out.print(WINDOW_SEPARATOR);
        System.out.print(products.toString());
        System.out.print(WINDOW_SEPARATOR);
    }

    public void removeProduct() {
        String productName;
        int productAmount;
        boolean removeResult;

        System.out.print(WINDOW_SEPARATOR);
        System.out.print("Digite o nome do produto à ser retirado: ");
        productName = scanner.next();
        System.out.print("Digite a quantidade do produto à ser retirado: ");
        productAmount = scanner.nextInt();
        System.out.print(WINDOW_SEPARATOR);

        removeResult = products.remove(productName, productAmount);
        System.out.println(removeResult ? "Produto Retirado com Sucesso." : "Não foi possível retirar o produto.");
    }

    public void searchProduct() {
        String productName;
        boolean searchResult;

        System.out.print(WINDOW_SEPARATOR);
        System.out.print("Digite o nome do produto à ser checado: ");
        productName = NormalizerProductName.normalize(scanner.next());
        searchResult = products.search(productName);
        System.out.print(WINDOW_SEPARATOR);
        System.out.println(String.format("%s %s no estoque.", searchResult ? "Há" : "Não há", productName));
    }
}
