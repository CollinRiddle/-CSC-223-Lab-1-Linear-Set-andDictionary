/**
 * Write a succinct, meaningful description of the class here. You should avoid wordiness
 * and redundancy. If necessary, additional paragraphs should be preceded by <p>,
 * the html tag for a new paragraph.
 *
 * <p>Bugs: (a list of bugs and / or other problems)
 *
 * @author Case and Collin Riddle
 * @date 1/19/2024
 */

package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;

public class ArraySet<E> implements List<E>, Set<E>
{
	protected ArrayList<E> _list;

	public ArraySet() {
		_list = new ArrayList<E>();
	}

	public ArraySet(Collection<E> collection) {
		this();
		for (E item : collection) {
			add(item);
		}
	}

	/**
	 * If the element isn't already in the list, it will add it.
	 **/
	@Override
	public boolean add(E e) {
		//No key, add it
		if (!(_list.contains(e))) {
			_list.add(e);
		}
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return _list.addAll(c);
	}

	@Override
	public int size() {
		return _list.size();
	}

	@Override
	public boolean isEmpty() {
		if (_list.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(Object o) {
		if (_list.contains(o)) {
			return true;
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return _list.iterator();
	}

	@Override
	public Object[] toArray() {
		return _list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return _list.toArray(a);
	}


	@Override
	public boolean remove(Object o) {
		return _list.remove(o);
	}

	/**
	 * Checks to make sure that the list contains all of the elements in a specified colleciton. 
	 **/
	@Override
	public boolean containsAll(Collection<?> c) {
		return _list.containsAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return _list.addAll(index, c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return _list.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return _list.retainAll(c);
	}

	@Override
	public void clear() {
		_list.clear();
	}

	@Override
	public E get(int index) {
		return _list.get(index);
	}

	@Override
	public E set(int index, E element) {
		return _list.set(index, element);
	}

	/**
	 * Adds the specified element at the specified index in the list.
	 **/
	@Override
	public void add(int index, E element) {
		_list.add(index, element);
	}

	@Override
	public E remove(int index) {
		return _list.remove(index);
	}

	@Override
	public int indexOf(Object o) {
		return _list.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return _list.indexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		return _list.listIterator();
	}

	/**
	 * Returns a ListIterator over all of the elements in the list.
	 * Starts at the specified index.
	 **/
	@Override
	public ListIterator<E> listIterator(int index) {
		return _list.listIterator(index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return _list.subList(fromIndex, toIndex);
	}

	/**
	 * Returns a spliterator over all of the elements in the list.
	 **/
	@Override
	public Spliterator<E> spliterator() {
		return List.super.spliterator();
	}

}
