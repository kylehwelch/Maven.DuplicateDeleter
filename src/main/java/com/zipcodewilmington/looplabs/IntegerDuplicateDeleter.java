package com.zipcodewilmington.looplabs;


/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int count;
        for (int i : array)
            {
                count = 0;
                for (int j = 0; j < array.length; j++) {
                   if (array[j] == i) {
                       count++;
                    }
                }
                if (count >= maxNumberOfDuplications) {
                    for (int j = 0; j < array.length; j++) {
                        if (array[j] == i) {
                            array[j] = null;
                        }
                    }
                }
            }
        Integer[] answer = new Integer[noNullLength(array)];
        int twocount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                answer[twocount] = array[i];
                twocount++;
            }
        }
        return answer;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];
    }

    @Override
    public <T> int noNullLength(T[] arr) {
        int count = 0;
        for (T t : arr) {
            if (t != null) count++;
        }
        return count;
    }
}
