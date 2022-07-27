package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int count;

        String[] arrayDupe = new String[array.length];
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
        String[] answer = new String[noNullLength(array)];
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count;
        String[] arrayDupe = new String[array.length];
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
        String[] answer = new String[noNullLength(array)];
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
