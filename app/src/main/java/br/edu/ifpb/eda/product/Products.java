package br.edu.ifpb.eda.product;

import br.edu.ifpb.eda.linkedlist.LinkedList;

public class Products {
    LinkedList<Product> productLinkedList = new LinkedList<>();

    boolean check(String name) {
        for (int i = 0; i < productLinkedList.size(); i++)
            if (productLinkedList.get(i).equals(name))
                return true;
        return false;
    }

}
