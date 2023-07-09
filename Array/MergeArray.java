public class MergeArray{
    public static void main(String[] args){
        int[] a1 = {4, 2, 7, 1, 9};
        int[] a2 = {5, 8, 3, 6};

        int[] mergedArray = merge(a1, a2);

        System.out.println("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] merge(int[] a1, int[] a2) {
        int length1 = a1.length;
        int length2 = a2.length;
        int[] mergedArray = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            mergedArray[i] = a1[i];
        }
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }

        return mergedArray;
    }
}
