import java.util.Arrays;

class multidimenstionalArrayDisplayAndEdit {
    public static void main(String[] args) {
        int[][] newArray = { { 2, 3, 4 }, { 5, 6, 7 } };
        // String storageContainer = Arrays.deepToString(newArray);
        System.out.println("this is initial data" + Arrays.deepToString(newArray));
        newArray[1][1] = 90;
        System.out.println("this is updated data" + Arrays.deepToString(newArray));
        System.out.println("now this is specified data which is been changed" + newArray[1][1]);
    }
}
