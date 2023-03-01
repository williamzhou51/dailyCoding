public class ShortestPathinMatrix {
    public int[][] shortestPath(int[][] grid) {
        if(grid == null){
            return null;
        }

        int row = grid.length;
        int col = grid[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 0){
                    if(i-1 >=0 && grid[i-1][j] == 1){
                        grid[i][j] = 2;
                    }else if(i+1 < row && grid[i+1][j] == 1){
                        grid[i][j] = 3;
                    }else if(j-1 >=0 && grid[i][j-1] == 1){
                        grid[i][j] = 4;
                    }else if(j+1 < col && grid[i][j+1]==1){
                        grid[i][j] = 5;
                    }else{ grid[i][j] = 2; }
                }
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        ShortestPathinMatrix shortestPathinMatrix = new ShortestPathinMatrix();
        int[][] grid = new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 0}
        };
        for(int i =0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                System.out.println(shortestPathinMatrix.shortestPath(grid)[i][j]);
            }

        }
    }

}
