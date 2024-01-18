/**
 * Write a succinct, meaningful description of the class here. You should avoid wordiness
 * and redundancy. If necessary, additional paragraphs should be preceded by <p>,
 * the html tag for a new paragraph.
 *
 * <p>Bugs: (a list of bugs and / or other problems)
 *
 * @author <your name>
 * @date <date of completion>
 */

package utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class ParallelArrayDictionaryTest
{
	@Test
	void testParallelArrayDictionary() {

	}

	@Test
	void testGet() {

	}

	@Test
	void testPut()
	{
	}

	@Test
	void testRemove() {

	}

	@Test
	void testPutAll() {
		ParallelArrayDictionary<String, Integer> abc = new ParallelArrayDictionary<>();

		ParallelArrayDictionary<String, Integer> map = new ParallelArrayDictionary<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);

		abc.putAll(map);
		assertTrue(abc.get("One").equals(1));
		assertTrue(abc.get("Two").equals(2));
		assertTrue(abc.get("Three").equals(3));
		assertEquals(3, abc.size());
	}

	@Test
	void testClear() {
		ParallelArrayDictionary<String, Integer> abc = new ParallelArrayDictionary<>();
		abc.put("", 0);
		abc.put("Two", 1);

		assertFalse(abc.isEmpty());
		abc.clear();
		assertEquals(0, abc.size());
		assertTrue(abc.isEmpty());
		assertNull(abc.get(""));
	}
}
