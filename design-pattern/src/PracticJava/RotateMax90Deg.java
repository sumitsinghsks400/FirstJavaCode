package PracticJava;


import java.util.Arrays;

public class RotateMax90Deg {

    private static RotateMax90Deg rotateMax90Deg;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        rotateMax90Deg = new RotateMax90Deg();
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr));
        rotateMax90Deg.rotateMatrix(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public boolean rotateMatrix(int [][]matrix) {
        if (matrix.length==0 || matrix.length !=matrix[0].length) {
            return false;
        }
        int n= matrix.length;
        for(int layer=0;layer<n/2;layer++) {
            int first=layer;
            int last=n-1-layer;
            for(int i= first;i<last;i++) {
                int offset=i-first;

                int top=matrix[first][i];
                matrix[first][i]= matrix[last-offset][first];
                matrix[last-offset][first]=matrix[last][last-offset];
                matrix[last][last-offset]=matrix[i][last];
                matrix[i][last]=top;
            }
        }
        return true;

    }

}