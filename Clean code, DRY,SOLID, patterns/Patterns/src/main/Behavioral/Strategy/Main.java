package org.example.Behavioral.Strategy;

import org.example.Behavioral.Strategy.Sorts.BubbleSort;
import org.example.Behavioral.Strategy.Sorts.QuickSort;
import org.example.Behavioral.Strategy.Sorts.SelectionSort;

import javax.naming.Context;

public class Main {

    public static void main(String[] args) {
        int[] nums = {123, 5, 67, 2, 6};

        ContextClass cc = new ContextClass(new BubbleSort());

        cc.executeSorting(nums);

        cc.setSorting(new QuickSort());
        cc.executeSorting(nums);

        cc.setSorting(new SelectionSort());
        cc.executeSorting(nums);
    }
}
