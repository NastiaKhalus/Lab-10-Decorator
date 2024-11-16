package ua.edu.ucu.apps.decorator;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", in a basket";
    }

    @Override
    public double price() {
        return item.price() + 4;
    }
}
