import JpaApplication.BuddyInfo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyInfoTest {

    private BuddyInfo buddy1, buddy2;
    private String name, address, number;

    @Before
    public void setUp() throws Exception {
        name = "Yusuf";
        address = "Ottawa";
        number = "613-123-4567";
        buddy1 = new BuddyInfo(name, address, number);
        buddy2 = new BuddyInfo();
        buddy2.setName(name);
    }

    @Test
    public void getNameTest() {
        assertEquals(buddy1.getName(), name);
        assertEquals(buddy2.getName(), name);
    }

    @Test
    public void getAddressTest(){
        assertEquals(buddy1.getAddress(), address);
        assertNull(buddy2.getAddress());
    }

    @Test
    public void getNumberTest(){
        assertEquals(buddy1.getNumber(), number);
        assertNull(buddy2.getNumber());
    }

    @Test
    public void setNameTest() {
        buddy1.setName("Hassan");
        buddy2.setName("Jama");
        assertEquals(buddy1.getName(), "Hassan");
        assertEquals(buddy2.getName(), "Jama");
    }

    @Test
    public void setAddressTest(){
        buddy1.setAddress("Nepean");
        buddy2.setAddress("Carleton");
        assertEquals(buddy1.getAddress(), "Nepean");
        assertEquals(buddy2.getAddress(), "Carleton");
    }

    @Test
    public void setNumberTest(){
        buddy1.setNumber("613-098-7654");
        buddy2.setNumber("613-010-4785");
        assertEquals(buddy1.getNumber(), "613-098-7654");
        assertEquals(buddy2.getNumber(), "613-010-4785");
    }

    @Test
    public void toStringTest() {
        assertEquals("JpaApplication.BuddyInfo: [ name:Yusuf, address:Ottawa, number:613-123-4567 ]", buddy1.toString() );
    }
}