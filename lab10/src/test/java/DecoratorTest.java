import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ua.edu.ucu.apps.decorator.Item;
import ua.edu.ucu.apps.decorator.MockItem;
import ua.edu.ucu.apps.decorator.RibbonDecorator;
import ua.edu.ucu.apps.decorator.PaperDecorator;
import ua.edu.ucu.apps.decorator.BasketDecorator;

public class DecoratorTest {

    @Test
    public void testRibbonDecorator() {
        Item mockItem = new MockItem();
        Item decoratedItem = new RibbonDecorator(mockItem);
        assertEquals("Mock item, with ribbon", decoratedItem.getDescription());
        assertEquals(mockItem.price() + 40, decoratedItem.price());
    }

    @Test
    public void testPaperDecorator() {
        Item mockItem = new MockItem();
        Item decoratedItem = new PaperDecorator(mockItem);
        assertEquals("Mock item, wrapped in paper", decoratedItem.getDescription());
        assertEquals(mockItem.price() + 13, decoratedItem.price());
    }

    @Test
    public void testBasketDecorator() {
        Item mockItem = new MockItem();
        Item decoratedItem = new BasketDecorator(mockItem);
        assertEquals("Mock item, in a basket", decoratedItem.getDescription());
        assertEquals(mockItem.price() + 4, decoratedItem.price());
    }
}
