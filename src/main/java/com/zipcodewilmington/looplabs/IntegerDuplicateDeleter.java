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
        Integer[] arrayDupe = new Integer[array.length];
        for (int i = 0 ; i < array.length ; i++) {
            arrayDupe[i] = array[i];
        }

        for (int i = 0 ; i < array.length ; i++)
            {
                count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (arrayDupe[j] == arrayDupe[i]) {
                       count++;
                    }
                }
                if (count >= maxNumberOfDuplications) {
                    for (int j = 0; j < array.length; j++) {
                        if (arrayDupe[j] == arrayDupe[i]) {
                            array[j] = null;
                        }
                    }
                }
            }
        Integer[] answer = new Integer[noNullLength(array)];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                answer[count] = array[i];
                count++;
            }
        }
        return answer;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count;
        Integer[] arrayDupe = new Integer[array.length];
        for (int i = 0 ; i < array.length ; i++) {
            arrayDupe[i] = array[i];
        }

        for (int i = 0 ; i < array.length ; i++)
        {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (arrayDupe[j] == arrayDupe[i]) {
                    count++;
                }
            }
            if (count == exactNumberOfDuplications) {
                for (int j = 0; j < array.length; j++) {
                    if (arrayDupe[j] == arrayDupe[i]) {
                        array[j] = null;
                    }
                }
            }
        }
        Integer[] answer = new Integer[noNullLength(array)];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                answer[count] = array[i];
                count++;
            }
        }
        return answer;
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
