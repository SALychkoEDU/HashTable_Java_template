package com.hashtable;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class HashTable<T> {
    private int size;
    private ArrayList<T> table[];
    HashTable(int size) {
        this.size = size;
        table = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new ArrayList<T>();
        }
    }
    protected int getIndex(T key) {
        // Получает индекс по ключу
        int hash_key = Math.abs(key.hashCode() % size);
        return hash_key;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        // Ваш код тут
        return str.toString();
    }
}

class HashMap<T> extends HashTable<T> {
    HashMap(int size) {
        super(size);
    }
    T get(int key) {
        return null;
    }
    void set(int key, T value) {
    }
    void del(int key) {
    }
    boolean contains() {
        return false;
    }
}

class HashSet<T> extends HashTable<T> {
    HashSet(int size) {
        super(size);
    }
    T get(int key) {
        return null;
    }
    void set(int key) {
    }
    void del(int key) {
    }
    boolean contains() {
        return false;
    }
    HashSet<T> intersection(HashSet<T> setB) {
        return null;
    }
    HashSet<T> difference(HashSet<T> setB) {
        return null;
    }
    HashSet<T> union(HashSet<T> setB) {
        return null;
    }
}