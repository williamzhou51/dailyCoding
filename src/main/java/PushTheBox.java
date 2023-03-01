import java.util.Arrays;

public class PushTheBox {
    public Character[][] pushBox(Character[][] board){
        if(board == null){
            return null;
        }

        Character gogo = '-';
        Character box = '#';
        Character block = '*';

        int row = board.length;
        int col = board[0].length;

        for(int i = 0; i < row -1; i++){
            for(int j = 0; j< col-1; j++){
                if(board[i][j] == box && board[i][j+1] == gogo) {
                    board[i][j] = gogo;
                    board[i][j+1] = box;
                }
                if(board[i][j] == box){
                    if(board[i][j+1] == block || j +1 == col -1){
                        if( board[i+1][j] == gogo){

                            board[i][j] = gogo;
                            board[i+1][j] = box;
                        }
                    }

                }
            }
        }
        return board;
    }

    public static void main(String[] args) {
        PushTheBox pushTheBox = new PushTheBox();
        Character[][] board = new Character[][]{
                {'-', '#', '-', '-', '-'},
                {'-', '-', '-', '-', '-'},
                {'#', '-', '#', '#', '-'},
                {'#', '-', '-', '-', '#'}
        };

        Character[][] res = pushTheBox.pushBox(board);

        for(int i = 0; i <res.length; i++ ){
            System.out.println(Arrays.toString(res[i]));
        }

    }
}
