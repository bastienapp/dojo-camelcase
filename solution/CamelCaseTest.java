import junit.framework.*;
import org.junit.Test;

public class CamelCaseTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		assertEquals("a", CamelCase.convert("a"));
	}
	@Test
	public void test2() throws Exception {
		assertEquals("aB", CamelCase.convert("a b"));
	}
	@Test
	public void test3() throws Exception {
		assertEquals("suiteDeMots", CamelCase.convert("suite de mots"));
	}
	@Test
	public void test4() throws Exception {
		assertEquals("texteMalFichu", CamelCase.convert("tExTE mAl fICHu"));
	}
}
