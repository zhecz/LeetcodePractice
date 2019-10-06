public class Solution {
    public void rotate(int[][] matrix){
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return;
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int first=0, last=rows-1; first<last; first++, last--){
            int[]temp=matrix[first];
            matrix[first]=matrix[last];
            matrix[last]=temp;

        }

        for(int i=0;i<cols;i++){
            for(int j=i+1;j<rows;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
