import mongo.MongodbHelper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MongoTest {
    @Test
    public void testUseDb()
    {
        String dbName = MongodbHelper.getInstance().useDB("test");

        assertEquals("test", dbName);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUseDbWithEmptyName() throws IllegalStateException
    {
        MongodbHelper.getInstance().useDB("");
    }
}
