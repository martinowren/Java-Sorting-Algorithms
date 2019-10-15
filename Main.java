import java.util.Random;

class Main {
    static int[] array;


    public static void main(String[] args) {
        int[] tusen = createArray(10);
        for(int i : tusen) {
            System.out.println(i);
        }
        System.out.println("");
        int[] tusenSelSorted = SelectionSort(tusen);
        for(int i : tusenSelSorted) {
            System.out.println(i);
        }
        System.out.println("");
        int[] tusenInsSorted = InsertionSort(tusen);
        for(int i : tusenInsSorted) {
            System.out.println(i);
        }
        System.out.println("");
        int[] test = createArray(5);
        int[] to = InsertionSort(test);
        for(int i : to) {
            System.out.println(i);
        }

    }

    static int[] createArray(int storrelsePåArr) {
        array = new int[storrelsePåArr];
        Random ran = new Random();
        for(int i = 0; i < storrelsePåArr; i++) {
            array[i] = ran.nextInt();
        }
        return array;
    }

    static int[] SelectionSort(int[] inputArray) {
        int[] array = inputArray;
        int lengdenPåArray = array.length;

        for(int i = 0; i < lengdenPåArray-1;i++) {
            int minsteTalletiUsortert = i;
            for(int j = i+1; j < lengdenPåArray; j++) {
                if (array[j] < array[minsteTalletiUsortert]) {
                    minsteTalletiUsortert = j;
                }
            }
            int temp = array[minsteTalletiUsortert];
            array[minsteTalletiUsortert] = array[i];
            array[i] = temp;
        }

        return array;
    }
    
    static int[] InsertionSort(int[] inputArray) {
        int[] array = inputArray;
        int lengdenPåArray = array.length;
        for(int i = 0; i < lengdenPåArray; i++) {
            int nokkel = array[i];
            int j = i - 1;

            while(j >= 0 && nokkel < array[j]) {
                array[j+1] = array[j];
                j -= 1;
            }
            array[j+1] = nokkel;
        }
        return array;
    }

    static int[] MergeSort_sortering(int[] inputArray, int start, int slutt) {
        int[] array = inputArray;
        int lengdenPåArray = array.length;

        if(start < slutt) {
            int splittePunktet = (start + array[lengdenPåArray-1]) / 2;

            MergeSort_sortering(array, start, splittePunktet);
            MergeSort_sortering(array, splittePunktet, slutt);


            MergeSort_merging(array, start, splittePunktet, slutt);
        }

        return array;
    }

    static void MergeSort_merging(int[] inputArray, int start,int midtPunkt, int slutt) {
        int strlPåArray1 = midtPunkt - start + 1;
        int strlPåArray2 = slutt - midtPunkt;

        int[] arrayEn = new int[strlPåArray1];
        int[] arrayTo = new int[strlPåArray2];

        for(int i = 0; i < strlPåArray1; ++i) {
            arrayEn[i] = inputArray[start+i];
        }
        for(int i = 0; i < strlPåArray2; ++i) {
            arrayTo[i] = inputArray[midtPunkt+1+i];
        }

        int i = 0;
        int j = 0;

        while(i < strlPåArray1 && j < strlPåArray2) {
            if(arrayEn[i] <= arrayTo[j]) {
                inputArray[i+j-1] = arrayEn[i];
                i++;
            } else {
                inputArray[i+j-1] = arrayTo[i];
                j++;
            }
        }
        while(i <= strlPåArray1) {
            inputArray[i+j-1] = arrayEn[i];
            i++;
        }
        while(j <= strlPåArray2) {
            inputArray[i+j-1] = arrayTo[i];
            j++;
        }
        
    }

    static int[] MergeSort(int[] inputArray) {
        int lengdenPåArray = array.length;
        return MergeSort_sortering(array, 0, lengdenPåArray-1);
    }
}

