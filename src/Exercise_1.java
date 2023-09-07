package src;
public class Exercise_1 {
    
    //1.Adapt binary search so that it works on arrays that are sorted in descending instead of ascending order.
    public static<V extends Comparable<? super V>> boolean binSearch(V[] array, V value){

        int lo = array.length - 1;
        int hi = 0;

        if(array.length == 0){
            return false;
        }

        return binSearch(array, value, lo, hi);
    }

    public static<V extends Comparable<? super V>> boolean binSearch(V[] array, V value, int lo, int hi){

        int mid = (hi+lo)/2;
        int compare = array[mid].compareTo(value);

        if(hi <= lo){
            if(compare == 0){
                return true;
            }
            else if(compare > 0){
                hi = mid + 1;
                return binSearch(array, value, lo, hi);
            }
            else{
                lo = mid -1;
                return binSearch(array, value, lo, hi);
            }
        }

        return false;
    }

    //The integer square root of a natural number n is the largest natural number m such that m2 ≤ n. For example, the integer square root of 105 is 10.
    //Design an algorithm to calculate the integer square root of n using binary search. You can use multiplication and comparison of integers.
    
    public static<V extends Comparable<? super V>> int squareRoot(int number){
        //Vi vet att värdet vi söker kan inte vara större än number/2
        int lo = 1;
        int hi = number/2;
        
        while(lo <= hi){
            int mid = (lo + hi)/2;
            int sqr = mid * mid;

            if(sqr == number){
                System.out.print(mid);
                return mid;
            }
            else if(sqr < number){
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }

        return -1;
    }
//Sort the sequence 4 6 8 2 9 5 1 by hand with: 1) Insertion sort 2) Quicksort (using the median-of-three pivot) 3) Mergesort

public static<V extends Comparable<? super V>> int[] insertionSort(Integer[] array_in){
    int n = array_in.length;
    int[] array_out = new int[n];
    int sorted = 0;
    int position = 0;

    while(sorted < n){
        int next = array_in[sorted];
        
        while(position <= sorted && array_out[position] < next){
            position += 1;
            array_out[position] = next;
            sorted += 1;
        }
    }
    return array_out;

}

    
    public static void main(String[] args){
        Integer[] randomIntList = {2, 4, 8, 3, 7, 9, 1, 0, 5, 6};
        insertionSort(randomIntList);
        //assert insertionSort(randomIntList) == {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
}
