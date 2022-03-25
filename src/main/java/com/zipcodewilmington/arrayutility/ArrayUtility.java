package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Type;
import java.util.Collection;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility {
    public <T> Object countDuplicatesInMerge(Object[] a, Object[] c){
        int arr1length = a.length;
        int arr2length = c.length;
        int dupCount = 0;
        int newarrlength = arr1length + arr2length;
        Object[] newArray = new Object[newarrlength];
        System.arraycopy(a, 0, newArray, 0, arr1length);
        System.arraycopy(c, 0, newArray, arr1length, arr2length);

        for (int i = 0; i < newArray.length; i++) {
            Object previous = newArray[0] - ( 1);
            if (newArray[i] == previous) {
                ++dupCount;
            } else {
                previous = newArray[i];
            }
        }return dupCount;
    }

}
