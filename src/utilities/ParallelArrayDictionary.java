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

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ParallelArrayDictionary<Key, Value> implements Map<Key, Value>
{
    protected ArraySet<Key>    _keys;
    protected ArrayList<Value> _values;
	
	public ParallelArrayDictionary()
	{
		_keys = new ArraySet<Key>();
		_values = new ArrayList<Value>();
	}

	@Override
	public int size() {
		return _keys.size();
	}

	@Override
	public boolean isEmpty() {
		if(_keys.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		if (_keys.equals(key)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		if (_values.contains(value)) {
			return true;
		}
		return false;
	}

	@Override
	public Value get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value put(Key key, Value value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Key> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Value> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<Key, Value>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}