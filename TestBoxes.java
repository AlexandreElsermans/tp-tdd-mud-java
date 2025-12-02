import org.junit.*;
import static org.junit.Assert.*;

public class TestBoxes {
    @Test 
    public void testBoxesCreate() {
        Box b = new Box();
    }

    @Test
    public void testBoxAdd(){
        Box b = new Box();
        b.add("truc1");
        b.add("truc2");
    }
}