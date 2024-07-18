package br.edu.ifpb.eda.product;

import br.edu.ifpb.eda.utils.NormalizerProductName;

public class Product {
    public final String name;
    private int amount = 0;

    public Product(String name, int amount) {
        this.name = NormalizerProductName.normalize(name);
        this.amount = amount;
    }

    public void updateAmount(int deltaAmount) {
        this.amount += deltaAmount;
    }

    public int getAmount() {
        return this.amount;
    }

    public boolean checkSameName(String anotherName) {
        String normalizedAnotherName = NormalizerProductName.normalize(anotherName);
        return this.name.equalsIgnoreCase(normalizedAnotherName);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nome: ");
        stringBuilder.append(name);
        stringBuilder.append(" | Quantidade: ");
        stringBuilder.append(amount);
        return stringBuilder.toString();
    }
}
