public class Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int st = 0;
        int end = n * m - 1;

        while(st <= end){
            int mid = (st + end) / 2;
            int row = mid / m , col = mid % m;

            if(arr[row][col] == target)
            return true;

            else if(arr[row][col] < target){
                st = mid + 1;
            }
            else
            end = mid - 1;
        }
        return false;
    }
}
