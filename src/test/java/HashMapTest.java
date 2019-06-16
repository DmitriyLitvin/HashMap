import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashMapTest {
    HashMap hashMap = new HashMap();

    @Before
    public void setUp() throws Exception {
        hashMap.put(1, 100L);
        hashMap.put(-40, 200L);
        hashMap.put(150, 300L);
        hashMap.put(500, 50L);
        hashMap.put(440, 100000L);
        hashMap.put(200, 100000L);
        hashMap.put(40000, 100000L);
        hashMap.put(-5, 10000000L);
        hashMap.put(90, 170000L);
        hashMap.put(Integer.MIN_VALUE, 900L);
        hashMap.put(Integer.MIN_VALUE, 1L);
        hashMap.put(70, 100000L);
        hashMap.put(920, 105L);
        hashMap.put(80000, 10L);
        hashMap.put(4005, 190000L);
        hashMap.put(470, 8000L);
        hashMap.put(800, 500L);
        hashMap.put(880, 17000L);
        hashMap.put(460, 100700L);
        hashMap.put(430, 100900L);
        hashMap.put(-420, 100400L);
        hashMap.put(4880, 70000L);
        hashMap.put(4880, 70000L);
        hashMap.put(460, 8000L);
        hashMap.put(4300, 8800L);
        hashMap.put(50, 300L);
        hashMap.put(420, 90L);
        hashMap.put(760, 67000L);
        hashMap.put(910, 80000L);
        hashMap.put(4450, 1500L);
        hashMap.put(410, 100000L);
        hashMap.put(9920,800L);
        hashMap.put(430, 10L);
        hashMap.put(70, 180L);
        hashMap.put(470, 90L);
        hashMap.put(4560, 100L);
        hashMap.put(750, 100000L);
        hashMap.put(820, 80L);
        hashMap.put(460, 120L);
        hashMap.put(9920, 1800L);
        hashMap.put(120, 80L);
        hashMap.put(410, 120L);
        hashMap.put(9820, 1800L);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void get() {
        Assert.assertEquals(hashMap.get(120), new Long(80L));
    }

    @Test
    public void size() {
        Assert.assertEquals(hashMap.size(), 157);
    }
}