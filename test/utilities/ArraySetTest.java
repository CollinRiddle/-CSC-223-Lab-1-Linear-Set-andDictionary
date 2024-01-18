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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ArraySetTest
{


	@Test
	void testArraySetCollectionOfE() {

	}

	/**
	 * Creates an ArraySet<String> that contains two elements.
	 * Tests that the size method is working along with the isEmpty.
	 * Tests contains, clear, and the iterator.
	 **/
	@Test
	void testAddE() {
		ArraySet<String> abc = new ArraySet<String>(Arrays.asList("Bye", "Hi"));
		abc.add(1, "Hello");
		assertEquals(3, abc.size());

		abc.add("");
		assertEquals(4, abc.size());

		assertFalse(abc.isEmpty());
		assertTrue(abc.contains("Hello"));
		assertTrue(abc.contains(""));

		Iterator<String> iterator = abc.iterator();
		assertTrue(iterator.hasNext());
		assertEquals("Bye", iterator.next());

		abc.clear();
		assertTrue(abc.isEmpty());
	}

	@Test
	void testAddAllCollectionOfQextendsE() {
	}

	@Test
	void testRetainAll() {
	}

	/**
	 * Creates a collection of elements and tests the removeAll function.
	 **/
	@Test
	void testRemoveAll() {
		ArraySet<String> abc = new ArraySet<String>(Arrays.asList("Bye", "Hi"));
		Collection<String> elements = Arrays.asList("Bye", "Hi");
		assertTrue(abc.containsAll(elements));
		
		abc.removeAll(elements);
		assertFalse(abc.contains("Bye"));
		assertFalse(abc.contains("Hi"));	
	}

	/**
	 * Tests the addAll method through the creation of a collection.
	 * Checks that all of the indexes are working correctly.
	 **/
	@Test
	void testAddAllIntCollectionOfQextendsE() {
		ArraySet<String> abc = new ArraySet<String>(Arrays.asList("Bye", "Hi"));
		Collection<String> elements = Arrays.asList("Case", "Collin");
		abc.addAll(1, elements);
		
		assertEquals("Bye", abc.get(0));
		assertEquals("Hi", abc.get(3));
		assertEquals("Collin", abc.get(2));
		assertEquals("Case", abc.get(1));
		assertEquals(4, abc.size());
	}
}
