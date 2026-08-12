class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0; // 1
        int right = rows * cols - 1; // 11

        while (left <= right) {

            int mid = left + (right - left) / 2; // 6
            int row = mid / cols; // 6 / 4 = 1
            int col = mid % cols; // 6 % 4 = 2

            int value = matrix[row][col];

            if (value == target) {
                return true;
            } 
            else if (value < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return false;
    }
}
