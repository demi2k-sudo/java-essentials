public class BinarySearch2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        //finding the row where the element lies 
        int start = 0;
        int end = m-1;
        int mid;

        while(start<=end){
            mid = start + (end-start)/2;
            
            if(matrix[mid][n-1]==target) return true;

            else if(matrix[mid][n-1]>target){
                end = mid-1;
            }
            
            else if(matrix[mid][n-1]<target){
                start = mid+1;
            }
        }
        int col = (start==m)?start-1:start;

        //finding the column where the answer lies
        start = 0;
        end = n-1;
        while(start<=end){
            mid = start + (end-start)/2;
            
            if(matrix[col][mid]==target) return true;

            else if(matrix[col][mid]>target){
                end = mid-1;
            }
            
            else if(matrix[col][mid]<target){
                start = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        System.out.println(searchMatrix(a, 0));
        System.out.println(searchMatrix(a, 10));
    }
}
