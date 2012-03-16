package hu.bme.mit.androtext.gen.util;

import java.util.Iterator;

public class IteratorExtensions {

	public static <T> Iterable<T> toIterable(final Iterator<T> iterator) {
		return new Iterable<T>() {
			@Override
			public Iterator<T> iterator() {
				return iterator;
			}
		};
	}
	
}
