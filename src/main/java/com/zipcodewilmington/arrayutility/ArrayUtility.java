package com.zipcodewilmington.arrayutility;

//import com.sun.org.apache.bcel.internal.generic.ObjectType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<ObjectType>{
public ObjectType [] intArray;

    public ArrayUtility(ObjectType[] intArray) {
        this.intArray = Arrays.copyOf(intArray, intArray.length);
    }

    public Integer countDuplicatesInMerge(ObjectType[] arrayToMerge, ObjectType valueToEvaluate){
        int count = 0;
        ObjectType[] newArr = mergeArrays(intArray, arrayToMerge);
        intArray = Arrays.copyOf(newArr, newArr.length);
        count = getNumberOfOccurrences(valueToEvaluate);
        return count;

    }

    public ObjectType getMostCommonFromMerge(ObjectType[] arrayToMerge) {
        ObjectType[] newArr = mergeArrays(intArray, arrayToMerge);
        int min = Integer.MIN_VALUE;
        int occ = 0;
        ObjectType result = null;
        for (int i =  0; i < newArr.length; i++)
        {
            occ = getNumberOfOccurrences(newArr[i]);
            if (occ > min) {
                min = occ;
                result = newArr[i];
            }
        }
        return (ObjectType) result;




//        int reserve = 0;
//        int count = 1;
//        for (int i = 1; i < newArr.length; i++) {
//            if (newArr[i] == newArr[reserve]){
//                count++;
//            } else {
//                count--;
//            }
//            if (count == 0) {
//                reserve = i;
//                count = 1;
//            }
//        }
//        return newArr[reserve];

    }

    public Integer getNumberOfOccurrences(Object valueToEvaluate) {
        int count = 0;
        for (ObjectType s : intArray) {
            if (s.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public ObjectType[] removeValue(Object valueToRemove) {
        int count = getNumberOfOccurrences(valueToRemove);
        ObjectType[] list = Arrays.copyOf(intArray, intArray.length - count);
        int x = 0;
        for (int i = 0; i < intArray.length; i++) {
            if(!(intArray[i].equals((valueToRemove)))) {
                list[x] = intArray[i];
                x++;
            }
        }
        return list;
    }

    public ObjectType[] mergeArrays(ObjectType[] a, ObjectType[] c){
        int arr1length = a.length;
        int arr2length = c.length;
        int dupCount = 0;
        int newarrlength = arr1length + arr2length;
        ObjectType[] newArray = Arrays.copyOf(a, newarrlength);
        System.arraycopy(a, 0, newArray, 0, arr1length);
        System.arraycopy(c, 0, newArray, arr1length, arr2length);
        return newArray;
    }

}
