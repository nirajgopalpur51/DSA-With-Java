package Array;
import java.util.*;
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        ArrayList<Integer> list = new ArrayList<>();

        while(startRow <= endRow && startCol <= endCol){
            // top
            for(int j=startCol; j<=endCol; j++){
                list.add(matrix[startCol][j]);
            }
            // right
            for(int j=startRow+1; j<=endRow; j++){
                list.add(matrix[j][endCol]);
            }
            // bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow==endRow) break;
                list.add(matrix[endRow][j]);
            }
            // left
            for(int j=endRow-1; j>=startRow+1; j--){
                if(startCol==endCol) break;
                list.add(matrix[j][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return list;
    }
}
