package br.edu.ifpb.eda.product;

public class Product {
    public final String name;
    private int amount = 0;
    public Product(String name) {
        this.name = name;
    }
    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == String.class)
            return name.equals(obj);
        return super.equals(obj);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nome: ");
        stringBuilder.append(name);
        stringBuilder.append("\nQuantidade: ");
        stringBuilder.append(amount);
        return stringBuilder.toString();
    }
}
