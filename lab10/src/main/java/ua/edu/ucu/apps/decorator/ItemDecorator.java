package ua.edu.ucu.apps.decorator;

public abstract class ItemDecorator implements Item {
    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double price() {
        return item.price();
    }
}
