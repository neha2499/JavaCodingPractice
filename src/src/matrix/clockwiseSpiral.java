package matrix;

public class clockwiseSpiral {


    public static void printSpiral(int[][] matrix) {
        int i;
        int a = matrix.length;
        int b = matrix[0].length;
        int k = 0;
        int l = 0;
        while (k < a && l < b) {
            for ( i = l; i<b ; i++){
                System.out.println(matrix[k][i]);
            }

            k++;

            for (i=k;i<a;i++){
                System.out.println(matrix[i][b-1]);
            }

            b--;
            for (i=b-1;i>=l;i--)
            {
                System.out.println(matrix[a-1][i]);
            }

            a--;
            for(i=a-1;i>=k;i--){
                System.out.println(matrix[i][l]);
            }

            l++;
        }

    }



    public static void main(String[] args) {
        int[][] matrix =      { { 1, 2 ,3}, { 3, 4,6 } , { 5, 6,7 }, { 7, 8 ,9}  };

        printSpiral(matrix);
    }
}







