package com.shiffler.pattern.iterator;
import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
