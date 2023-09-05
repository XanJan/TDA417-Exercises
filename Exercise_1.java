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
    
    
    public static void main(String[] args){
        Integer[] decendIntList = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        assert binSearch(decendIntList, 15) == false;
        assert binSearch(decendIntList, 8) == true;
    }
}
