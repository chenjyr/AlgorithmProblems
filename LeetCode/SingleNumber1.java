/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */

public int singleNumber(int[] A) {
    
    int result = 0;
    
    for (int i = 0; i < A.length; i ++) {
        result ^= A[i];
    }

    return result;
}
