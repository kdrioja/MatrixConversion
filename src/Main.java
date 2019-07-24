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
    //can one of you run it, i don't think its letting me  for some reason
    //are you getting an error bc im not even getting that
    // I think it might be a java compilation error.. LOL

    // OHHHHH i think i got it
    // It might be our int[][]
    //https://www.geeksforgeeks.org/multidimensional-arrays-in-java/
    //it should be ok ^

    // ok, truue
    //>:( why won't it run

    // I will come back to this as well Kenia. Let's tackle this!!
    // sounds good lol

/*
// Input:

// [
  // [123]
  // [456]
  // [789]
// ]

//rowIndex * numOfCols + colIndex

// Output: 123456789

//output[3] == 4
//1 * 3 + 0
output[6] == 7
2 * 3 + 0

create an output array of size numRows * numCols
iterate through 2D array and add element to 1D array using
index to next empty spot in 1D array
*/

    public static int[] convertTo1D(int[][] arr) {
        int[] output = new int[arr.length * arr[0].length];
        // need keyword int?? yes i think so
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
