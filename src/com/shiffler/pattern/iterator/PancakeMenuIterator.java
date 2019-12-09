/**
 * This is our iterator for the Pancake Menu. ArrayList already provides an iterator but we made our own
 * for the purpose of this exercise.
 */

package com.shiffler.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenuIterator implements Iterator<MenuItem> {

    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if ( position >= items.size() || items.get(position) == null)
            return false;
        else
            return true;
    }

    @Override
    public MenuItem next() {
        position++;
        return items.get(position-1);
    }
}
