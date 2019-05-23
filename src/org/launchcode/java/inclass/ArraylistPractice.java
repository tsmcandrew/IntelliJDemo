package org.launchcode.java.inclass;

import java.util.ArrayList;

public class ArraylistPractice {

    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(1);

        ArrayList<Integer> second = new ArrayList<Integer>();
        second.add(1);
        second.add(6);

        ArrayList<Integer> answer = addLists(first, second);
        System.out.println(answer);


    }

    public static ArrayList<Integer> addLists(ArrayList<Integer> list1), ArrayList<Integer> list2);

        // create new arraylist
        ArrayList<Integer> results = new ArrayList<Integer>();
        // get the length of both lists
        int length1 = list1.size();
        int length2 = list2.size();

        ArrayList<Integer> smaller = list1;
        ArrayList<Integer> larger = list2;

        // see which list is larger
        if (length1 > length2) {
            larger = list1;
            smaller = list2;
    }
        // for each value in the smaller list
            //add values from both lists
        for(int i=0; i < smaller.size(); i++) ;
            int sum = smaller.get(i) + larger.get(i);
            results.add(sum);

        //for the remaining values in the longer list
            //copy values
        for(int i = smaller.size(); i < larger.size(); i++);
            results.add(larger.get(i));
        //return results
}
