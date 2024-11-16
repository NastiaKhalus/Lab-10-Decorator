package ua.edu.ucu.apps.decorator;

public class MockItem implements Item {
    @Override
    public String getDescription() {
        return "Mock item";
    }

    @Override
    public double price() {
        return 10.0;
    }
}
