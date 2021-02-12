import JpaApplication.AddressBook;
import JpaApplication.BuddyInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressBookTest {

    private AddressBook book;
    private BuddyInfo buddy1, buddy2, buddy3;

    @Before
    public void setUp() throws Exception {
        book = new AddressBook();
        buddy1 = new BuddyInfo("hassan", "Carleton", "613-963-8520");
        buddy2 = new BuddyInfo("yusuf", "CFIA", "613-123-4567");
        buddy3 = new BuddyInfo("jama", "OttawaU", "613-789-4563");
        book.addBuddy(buddy3);
        book.addBuddy(buddy1);
        book.addBuddy(buddy2);
    }

    @Test
    public void addBuddyTest() {
        book.addBuddy(buddy3);
        assertEquals(book.getBuddy(3), buddy3);
    }

    @Test
    public void getBuddyTest() {
        assertEquals(book.getBuddy(2), buddy2);
        assertEquals(book.getBuddy(0), buddy3);
    }

    @Test
    public void removeBuddyTest() {
        book.removeBuddy(1);
        assertNotEquals(book.getBuddy(1), buddy1);
    }

    @Test
    public void toStringTest() {
        assertEquals(book.toString(), "JpaApplication.AddressBook: \n" +
                "1 | JpaApplication.BuddyInfo: name='jama', address='OttawaU', number='613-789-4563'\n" +
                "2 | JpaApplication.BuddyInfo: name='hassan', address='Carleton', number='613-963-8520'\n" +
                "3 | JpaApplication.BuddyInfo: name='yusuf', address='CFIA', number='613-123-4567'\n");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Running TearDown");
        book = null;
    }
}