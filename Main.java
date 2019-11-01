import java.util.Random;

class Main {
    static int[] array;

    public static void main(String[] args) {
        // int[] tusen = createArray(1000);

        testOppaveFem();

        // int[] tusenSorted = QuickSort(tusen);
        // for(int i : tusenSorted) {
        //     System.out.println(i);
        // }

    }
    static void testOppgaveFire() {
        int[] tusenRand = {5,4,8,9,7,2,3,1,6,0};
        int[] tusenASC = {0,1,2,3,4,5,6,7,8,9};
        int[] tusenDESC = {9,8,7,6,5,4,3,2,1,0};
        // for(int i : tusen) {
        //     System.out.println(i);
        // }
        for(int i : SelectionSort(tusenRand)) {
            System.out.print(i);
        }
        System.out.println("");
        for(int i : SelectionSort(tusenASC)) {
            System.out.print(i);
        }
        System.out.println("");
        for(int i : SelectionSort(tusenDESC)) {
            System.out.print(i);
        }
        System.out.println("\n");


        for(int i : QuickSort(tusenRand)) {
            System.out.print(i);
        }
        System.out.println("");
        for(int i : QuickSort(tusenASC)) {
            System.out.print(i);
        }
        System.out.println("");
        for(int i : QuickSort(tusenDESC)) {
            System.out.print(i);
        }
        System.out.println("\n");

        
        for(int i : HeapSort(tusenRand)) {
            System.out.print(i);
        }
        System.out.println("");
        for(int i : HeapSort(tusenASC)) {
            System.out.print(i);
        }
        System.out.println("");
        for(int i : HeapSort(tusenDESC)) {
            System.out.print(i);
        }
        System.out.println("\n");
    }

    static void testOppaveFem() {
        int[] tusen = createArray(1000);
        int[] femtusen = createArray(5000);
        int[] titusen = createArray(10000);
        int[] femtitusen = createArray(50000);
        int[] hundretitusen = createArray(100000);;

        long t = System.nanoTime();
        SelectionSort(tusen);
        double tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Selectionsort: " + tid);

        t = System.nanoTime();
        SelectionSort(femtusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Selectionsort: " + tid);

        t = System.nanoTime();
        SelectionSort(titusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Selectionsort: " + tid);

        t = System.nanoTime();
        SelectionSort(femtitusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Selectionsort: " + tid);

        t = System.nanoTime();
        SelectionSort(hundretitusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Selectionsort: " + tid);

        System.out.println("\n");
        tusen = createArray(1000);
        femtusen = createArray(5000);
        titusen = createArray(10000);
        femtitusen = createArray(50000);
        hundretitusen = createArray(100000);;

        t = System.nanoTime();
        HeapSort(tusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Heapsort: " + tid);

        t = System.nanoTime();
        HeapSort(femtusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Heapsort: " + tid);

        t = System.nanoTime();
        HeapSort(titusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Heapsort: " + tid);

        t = System.nanoTime();
        HeapSort(femtitusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Heapsort: " + tid);

        t = System.nanoTime();
        HeapSort(hundretitusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Heapsort: " + tid);

        System.out.println("\n");

        tusen = createArray(1000);
        femtusen = createArray(5000);
        titusen = createArray(10000);
        femtitusen = createArray(50000);
        hundretitusen = createArray(100000);

        t = System.nanoTime();
        QuickSort2(tusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Quicksort: " + tid);

        t = System.nanoTime();
        QuickSort2(femtusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Quicksort: " + tid);

        t = System.nanoTime();
        QuickSort2(titusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Quicksort: " + tid);

        t = System.nanoTime();
        QuickSort2(femtitusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Quicksort: " + tid);

        t = System.nanoTime();
        QuickSort2(hundretitusen);
        tid = ( System.nanoTime() - t) / 1000000;
        System.out.println("Quicksort: " + tid);


        // for(int i : tusenSorted) {
        //     System.out.println(i);
        // }

        
        // System.out.println(tid);
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



    static int[] HeapSort(int[] inputArray) {
        int[] array = inputArray;
        int lengdenPåArray = array.length;

        for(int i = lengdenPåArray / 2 - 1; i >= 0; i--) {
            HeapSort_lagHeaps(array, lengdenPåArray, i);
        }
        
        for(int i = lengdenPåArray - 1;i >= 0; i--) {
            int midlertidig = array[0];
            array[0] = array[i];
            array[i] = midlertidig;
            
            HeapSort_lagHeaps(array, i, 0);
        }






        return array;
    }

    static void HeapSort_lagHeaps(int[] inputArray, int strl, int rot) {
        // ROTA ER DEN STORSTE
        int storste = rot;
        int venstre = 2*rot+1;
        int hoyre = 2*rot+2;

        if(venstre < strl && inputArray[venstre] > inputArray[storste]) {
            storste = venstre;
        }
        if(hoyre < strl && inputArray[hoyre] > inputArray[storste]) {
            storste = hoyre;
        }

        if(storste != rot) {
            int bytte = inputArray[rot];
            inputArray[rot] = inputArray[storste];
            inputArray[storste] = bytte;

            HeapSort_lagHeaps(inputArray, strl, storste);
        }
    }


    
    static int[] QuickSort(int[] inputArray) {
        int[] array = inputArray;
        int lengdenPåArray = array.length;
        QuickSort_rekursiv(array, 0, lengdenPåArray-1);


        return array;
    }

    static void QuickSort_rekursiv(int[] inputArray, int start, int slutt) {
        if(start < slutt) {
            int partisjonsIndex = QuickSort_partisering(array, start, slutt);
            QuickSort_rekursiv(inputArray, start, partisjonsIndex-1);
            QuickSort_rekursiv(inputArray, partisjonsIndex+1, slutt);
        }

    }

    static int QuickSort_partisering(int[] inputArray, int start, int slutt) {
        int vendePunkt = inputArray[slutt];
        int mindreIndex = (start-1); // Dette er indeksen for elementet før denne partisjonen
        for(int j = start; j < slutt; j++) {
            if(inputArray[j] < vendePunkt) {
                mindreIndex++;

                int midlertidig = inputArray[mindreIndex];
                inputArray[mindreIndex] = inputArray[j];
                inputArray[j] = midlertidig;
            }
        }

        int midlertidig = inputArray[mindreIndex+1];
        inputArray[mindreIndex+1] = inputArray[slutt];
        inputArray[slutt] = midlertidig;

        return mindreIndex+1;
    }

    static int[] QuickSort2(int[] inputArray) {
        int[] array = inputArray;
        int lengdenPåArray = array.length;
        QuickSort_rekursiv2(array, 0, lengdenPåArray-1);


        return array;
    }

    static void QuickSort_rekursiv2(int[] inputArray, int start, int slutt) {
        int leftPivot;

        while(start < slutt) {
            leftPivot = QuickSort_partisering2(inputArray, start, slutt);


            if(leftPivot-start < slutt-leftPivot) {
                QuickSort_rekursiv2(inputArray, start, leftPivot-1);
                start = leftPivot+1;
            } else {
                QuickSort_rekursiv2(inputArray, leftPivot+1, slutt);
                slutt = leftPivot-1;
            }
        }
    }

    static int QuickSort_partisering2(int[] inputArray, int start, int slutt) {
        int pivot = inputArray[slutt];
        int left = start;
        int end = slutt-1;
        while(left <= end) {
            while(left <= end && inputArray[left] <= pivot) {
                left++;
            }
            while(end >= left && inputArray[end] >= pivot) {
                end--;
            }
            if(left < end) {
                int midlertidig = inputArray[left];
                inputArray[left] = inputArray[end];
                inputArray[end] = midlertidig;
            }
        }
        int midlertidig = inputArray[left];
        inputArray[left] = inputArray[slutt];
        inputArray[slutt] = midlertidig;
        return left;
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
        int lengdenPåArray = inputArray.length;
        return MergeSort_sortering(inputArray, 0, lengdenPåArray-1);
    }


    // static int[] BucketSort(int[] inputArray) {
    //     // Bruker en versjon av Bucketsort som implementerer insertionsort for hver bucket
    //     int lengdenPåArray = array.length;
    //     int maksPerBucket = lengdenPåArray * 0.1;
        
    //     int[][] bucketArray = new int[maksPerBucket];

    //     for(int i = 0; i < inputArray.length-1; i++) {
    //         int indexOfBucket = maksPerBucket * i;
    //         bucketArray[indexOfBucket].add(inputArray[i]);
    //     }

    //     return null;
    // }
    
    // static int[] RadixSort(int[] inputArray) {
    //     int[] array = inputArray;
    //     int lengdenPåArray = array.length;     

    //     int maksTall = RadixSort_getMax(array, lengdenPåArray);

    //     for(int eksponent = 1; maksTall/eksponent > 0; eksponent *= 10) {

    //     }
        
        
    // }

    // static int[] RadixSort_sort(int[] inputArray, int strl, int eks) {
    //     int[] array = new int[strl];
    //     int teller;

        
    // }

    // static int[] RadixSort_getMax(int[] inputArray, int l) {
    //     int storesteTall = arr[0];
    //     for(int i = 0; i < l; i++) {
    //         if(inputArray[i] > storesteTall) {
    //             maks = inputArray[i];
    //         }
    //     }
    //     return max;
    // }

}

