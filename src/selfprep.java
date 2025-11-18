public class selfprep {
    public void main(String[] args){
    int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9};
    }
//    for(int i = 0; i < arr.length; i++) {
//        for (int j = 0; j < arr[i].length; j++) {
//            System.out.print(arr[i][j] + " ");
//        }
//        System.out.println();
//    }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Total Sum: " + sum);
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of Row " + i + ": " + rowSum);
        }
        System.out.println("\n");
        for (int j = 0; j < arr[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < arr.length; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Sum of Column " + j + ": " + colSum);
        }
        System.out.println("\n");
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Minimum element: " + min);

}
}
