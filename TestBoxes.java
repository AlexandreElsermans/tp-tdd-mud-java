import  org.junit.Test;
import static org.junit.Assert.*;


public class TestBoxes {
    @Test 
    public void testBoxesCreate() {
        Box b = new Box();
    }

    @Test
    public void testBoxAdd(){
        Box b = new Box();
        Thing truc1 = new Thing("truc1");
        Thing truc2 = new Thing("truc2");
        b.add(truc1);
        b.add(truc2);
    }

    @Test
    public void testGetContents() {
        Box b = new Box();
        Thing truc1 = new Thing("truc1");
        b.add(truc1);
        b.getContents();
    }

    @Test
    public void testContentsNull() {
        Box b = new Box();
        Thing truc1 = new Thing("truc1");
        Thing truc2 = new Thing("truc1");
        b.add(truc1);
        assertTrue(b.contains(truc1));
        assertFalse(b.contains(truc2));
    }

    @Test
    public void testBoxRemove(){
        Box b = new Box();
        Thing truc1 = new Thing("truc1");
        Thing truc2 = new Thing("truc2");
        b.add(truc1);
        b.add(truc2);
        b.remove(truc2);
        assertTrue(b.contains(truc1));
        assertFalse(b.contains(truc2));
    }

    @Test(expected = RuntimeException.class)
    public void testBoxRemoveException() {
        Box b = new Box();
        Thing truc1 = new Thing("truc1");
        Thing truc2 = new Thing("truc2");
        b.add(truc1);
        b.remove(truc2);
    }
}