public class Main {
    /**
     Convert a n x m 2D array into a (n * m) x 1 1D array.
     */
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] output = convertTo1D(arr);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }

/*
Input:
[
 [123]
 [456]
 [789]
]

rowIndex * numOfCols + colIndex

Output: 123456789

output[3] == 4
1 * 3 + 0
output[6] == 7
2 * 3 + 0

create an output array of size numRows * numCols
iterate through 2D array and add element to 1D array using
index to next empty spot in 1D array
*/

    public static int[] convertTo1D(int[][] arr) {
        int[] output = new int[arr.length * arr[0].length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                output[index] = arr[i][j];
                index++;
            }
        }
        return output;
    }
}