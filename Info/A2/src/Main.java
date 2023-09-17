class Main2 {
    public static void main(String[] args) {
        A5();
    }

    static void test() {
        int[] x = {4, 5, 6};
        int[] y = x;
        System.out.println(sum(y, x));
        System.out.println(x == y); // x = ?
        //
    }

    static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int sum(int arr[], int arr2[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        return sum;
    }

    static void A4() {
        String peopleData[][] = {{"John", "Doe", "Jane", "Smith"}, {"23", "34", "45", "36"}};
        System.out.println(caclculateAverageAge(peopleData));
    }

    static double caclculateAverageAge(String data[][]) {

        double average = 0;
        int x = 0;
        for (int i = 0; i < 4; i++) {
            x = Integer.parseInt(data[1][i].replace(",", ""));
            average = average + x;
        }

        return average / 4;
    }

    static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            sum += matrix[row][row] + matrix[row][matrix.length - row-1];
        }
        sum-=matrix[matrix.length/2][matrix.length/2];

        return sum;
    }

    static void A5() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Die Summe der Diagonalelemente ist: " + diagonalSum(matrix));
    }
}
