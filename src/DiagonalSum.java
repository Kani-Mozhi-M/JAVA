public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sumofdiagonal = diagonalsum(mat);
        System.out.println("sum of diagonal is " +sumofdiagonal);

    }
    public static int diagonalsum(int[][] mat){
        int sum =0;
        int n =mat.length; // 3 rows
        int i=0,j=0;

        while (i < n){
            sum += mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=n-1;
        while (j >= 0){
            if (i != j) {
                sum += mat[i][j];
            }
            i++;
            j--;
        }
        return sum;
    }
}
