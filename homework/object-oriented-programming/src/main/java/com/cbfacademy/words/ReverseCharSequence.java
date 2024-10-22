package com.cbfacademy.words;

public class ReverseCharSequence implements CharSequence {
    private final String original;

    public ReverseCharSequence(String original) {
        this.original = original;
    }

    @Override
    public int length() {
        return original.length();
    }

    @Override
    public char charAt(int index) {
        // Return characters in reverse order
        return original.charAt(original.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sub = new StringBuilder(original.substring(start, end));
        return sub.reverse().toString();
    }

    @Override
    public String toString() {
        // Reverse the entire string
        return new StringBuilder(original).reverse().toString();
    }

}

