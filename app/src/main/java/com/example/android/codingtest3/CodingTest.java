package com.example.android.codingtest3;

import java.util.ArrayList;

/**
 * Created by Android on 7/7/2017.
 */

public class CodingTest {
    public static void main(String[] args) {
        organize(new int[]{1,2,3,4,54,566,7,8,2,3,54,2,2,3,3,54,5,6,78,2,3,4,54,2});
        System.out.println();
        subStrings("frog");
    }

    public static int[] organize(int[] a)
    {

        int temp = 0;
        for (int i = 0; i <a.length ; i++) {

            for (int j = 0; j < a.length; j++) {
                if(a[i] < a[j]){
                    temp =a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }


        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] + ",");
        }

        return a;
    }



    public static ArrayList<String> subStrings(String s){
        ArrayList<String> list = new ArrayList<>();
        list.add(s);
        list.add("");
        for (int i = 0; i <s.length() ; i++) {

            for (int j = i+1; j <s.length() ; j++) {
                if(i !=j) {
                    if (!list.contains("" + s.charAt(i) + s.charAt(j)))
                         list.add("" + s.charAt(i) + s.charAt(j));
                    if (!list.contains("" + s.substring(i)))
                        list.add("" + s.substring(i));
                    if (!list.contains("" + s.charAt(i)+ s.substring(j+1)))
                        list.add("" + s.charAt(i) +s.substring(j+1));
                    if (!list.contains("" + s.substring(i,j)))
                        list.add("" + s.substring(i,j));
                    if (!list.contains("" + s.substring(i,j-1) + s.charAt(j)))
                        list.add("" + s.substring(i,j-1) + s.charAt(j));
                }
            }
        }

        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i) + ",");
        }
        return list;
    }
}
