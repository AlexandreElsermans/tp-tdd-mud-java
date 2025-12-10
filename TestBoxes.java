import  org.junit.Test;
import static org.junit.Assert.*;


public class TestBoxes {
    @Test 
    public void testBoxesCreate() {
        Box b = new Box(true);
    }

    @Test
    public void testBoxAdd(){
        Box b = new Box(true);
        Thing truc1 = new Thing("truc1", 0);
        Thing truc2 = new Thing("truc2", 0);
        b.add(truc1);
        b.add(truc2);
    }

    @Test
    public void testGetContents() {
        Box b = new Box(true);
        Thing truc1 = new Thing("truc1", 0);
        b.add(truc1);
        b.getContents();
    }

    @Test
    public void testContentsNull() {
        Box b = new Box(true);
        Thing truc1 = new Thing("truc1", 0);
        Thing truc2 = new Thing("truc2", 0);
        b.add(truc1);
        assertTrue(b.contains(truc1));
        assertFalse(b.contains(truc2));
    }

    @Test
    public void testBoxRemove(){
        Box b = new Box(true);
        Thing truc1 = new Thing("truc1", 0);
        Thing truc2 = new Thing("truc2", 0);
        b.add(truc1);
        b.add(truc2);
        b.remove(truc2);
        assertTrue(b.contains(truc1));
        assertFalse(b.contains(truc2));
    }

    @Test(expected = RuntimeException.class)
    public void testBoxRemoveException() {
        Box b = new Box(true);
        Thing truc1 = new Thing("truc1", 0);
        Thing truc2 = new Thing("truc2", 0);
        b.add(truc1);
        b.remove(truc2);
    }

    @Test
    public void testIsOpen() {
        Box b = new Box(true);
        assertTrue(b.isOpen());
    }

    @Test
    public void testOpenToClose() {
        Box b = new Box(true);
        b.close();
        assertFalse(b.isOpen());
    }
    
    @Test
    public void testActionLook() {
        Box b  = new Box(true);
        Thing ceci = new Thing("ceci", 0);
        Thing cela = new Thing("cela", 0);
        b.add(ceci);
        b.add(cela);
        b.actionLook();
    }

    @Test
    public void testThingCreates() {
        Thing t = new Thing("truc", 3);
    }

    @Test
    public void testGetVolume() {
        Thing t = new Thing("truc", 5);
        t.getVolume();
    }

    @Test
    public void testGetCapacity() {
        Box b = new Box(true);
        b.setCapacity(5);
        b.getCapacity();
    }

    @Test
    public void testSetCapacity() {
        Box b = new Box(true, 10);
        Thing t = new Thing("truc", 5);
        b.setCapacity(5);
        assertEquals(b.getCapacity(), 5);
    }

    @Test
    public void testHasRoomFor() {
        Box b = new Box(true, 10);
        Thing t = new Thing("truc", 9);
        Box b2 = new Box(true, 8);
        Thing t2 = new Thing("truc2", 9);
        assertTrue(b.hasRoomFor(t));
        assertFalse(b2.hasRoomFor(t2));
    }
}