package com.zipcodewilmington.arrayutility;

import com.sun.org.apache.bcel.internal.generic.ObjectType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility <ObjectType>{
public ObjectType [] intArray;

    public ArrayUtility(ObjectType[] intArray) {
        this.intArray = Arrays.copyOf(intArray, intArray.length);
    }

    //public ObjectType countDuplicatesInMerge(Object[] a, Object[] c){
//        int arr1length = a.length;
//        int arr2length = c.length;
//        int dupCount = 0;
//        int newarrlength = arr1length + arr2length;
//        ObjectType[] newArray = new ObjectType[newarrlength];
//        System.arraycopy(a, 0, newArray, 0, arr1length);
//        System.arraycopy(c, 0, newArray, arr1length, arr2length);
//
//        for (int i = 0; i < newArray.length; i++) {
//            int previous = (int) newArray[0] - ( 1);
//            if (newArray[i] == previous) {
//                ++dupCount;
//            } else {
//                previous = (ObjectType) newArray[i];
//            }
//        }return dupCount;
        //return null;
  //  }

    public Integer getMostCommonFromMerge(Integer[] arrayToMerge) {
        return null;
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
        ObjectType[] list = Arrays.copyOf(intArray, intArray.length- count);
        for (int i = 0; i < intArray.length; i++) {
            int x = 0;
            if(!(intArray[i].equals((valueToRemove)))) {
                list[x] = intArray[i];
                x++;
            }
        }


        return list;
    }
}
