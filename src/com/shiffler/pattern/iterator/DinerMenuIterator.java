/**
 * Arrays don't have a built in Iterator so we have created one.
 */

package com.shiffler.pattern.iterator;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    /**
     * Returns true if the iterator has another item
     * @return true if there is another item, false if there isn't
     */
    @Override
    public boolean hasNext() {
        if (items[position] == null || position >= items.length)
            return false;
        else
            return true;
    }

    /**
     * Returns the next menu item
     * @return A menu item
     */
    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
