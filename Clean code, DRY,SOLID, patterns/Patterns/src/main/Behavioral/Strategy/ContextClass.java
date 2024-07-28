package org.example.Behavioral.Strategy;

import org.example.Behavioral.Strategy.Sorts.Sorting;

public class ContextClass {

    private Sorting sorting;

    public ContextClass(Sorting sorting) {
        this.sorting = sorting;
    }

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public void executeSorting(int[] array) {
        sorting.sort(array);
    }
}
