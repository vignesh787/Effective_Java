package com.part7;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private Object[] entries;

    private int size = 0;

    private static final int INITIAL_SIZE = 16;

    /**
     * Constructor
     */
    public Stack(){
        entries = new Object[INITIAL_SIZE];

    }

    public void push(Object e){
       // check for size before pushing
        ensureSize();
            entries[size++] = e;
    }

    public Object pop(){
        if(size == 0 ){
            throw new EmptyStackException();
        }
        Object result = entries[--size];
        entries[size] = null; // Eleminating obselete references
        return result;
    }

    public void ensureSize(){
        if(entries.length == size){
            Arrays.copyOf(entries,2*(size + 1));
    }

}
