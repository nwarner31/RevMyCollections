import com.revature.nwarner.collections.MyDoubleLinkList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyDoubleLinkListTest {

    MyDoubleLinkList<Integer> mdll;

    @BeforeEach
    public void setupTest() {
        mdll = new MyDoubleLinkList<>();
    }

    @AfterEach
    public void teardown() {
        mdll = null;
    }

    @Test
    public void headNullIfEmptyNoAdd() {
        assertEquals(null, mdll.pop());
    }

    @Test
    public void headNullAfterPushAndPop() {
        mdll.push(12);
        assertEquals(12, mdll.pop());
        assertEquals(null, mdll.pop());
    }

    @Test
    public void headNotNullIfPush() {
        mdll.push(40);
        assertEquals(40, mdll.pop());
    }

    @Test
    public void headNotNullIfAdd() {
        mdll.add(35);
        assertEquals(35, mdll.pop());
    }

    @Test
    public void tailNullIfEmptyNoAdd() {
        assertEquals(null, mdll.remove());
    }

    @Test
    public void tailNullAfterAddAndRemove() {
        mdll.add(42);
        assertEquals(42, mdll.remove());
        assertEquals(null, mdll.remove());
    }

    @Test
    public void tailNotNullIfPush() {
        mdll.push(21);
        assertEquals(21, mdll.remove());
    }

    @Test
    public void tailNotNullIfAdd() {
        mdll.add(56);
        assertEquals(56, mdll.remove());
    }

}
