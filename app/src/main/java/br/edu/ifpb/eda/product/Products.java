package br.edu.ifpb.eda.product;

import br.edu.ifpb.eda.linkedlist.LinkedList;

public class Products {
    LinkedList<Product> productLinkedList = new LinkedList<>();

    private int getIndex(String name) {
        int index = 0;
        for (Product product : productLinkedList) {
            if (product.checkSameName(name))
                return index;
            index++;
        }
        return -1;
    }

    private Product get(String name) {
        for (Product product : productLinkedList)
            if (product.checkSameName(name))
                return product;
        return null;
    }

    public void add(String name, int amount) {
        Product product = get(name);
        if (product != null)
            product.updateAmount(amount);
        else
            productLinkedList.addLast(new Product(name, amount));
    }

    public boolean remove(String name, int amount) {
        int productIndex = getIndex(name);
        if (productIndex == -1)
            return false;

        Product product = productLinkedList.get(productIndex);
        if (product.getAmount() < amount)
            return false;

        product.updateAmount(-amount);
        if (product.getAmount() == 0)
            productLinkedList.remove(productIndex);
        return true;
    }

    public boolean search(String name) {
        for (Product product : productLinkedList)
            if (product.checkSameName(name))
                return true;
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product : productLinkedList)
            stringBuilder.append(String.format("%s\n", product));
        return stringBuilder.toString();
    }

}
