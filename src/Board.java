import java.util.Arrays;

public class Board {

    private char[] board;
    int id;

    public Board(int id) {
        this.id = id;
        this.board = new char[9];
        for(int i=0;i<=8;i++){
            char c = (char)(i+'0');
            board[i]=c;
        }
    }


    public void placeSymbolOnBoard(char symbol, int slot){
        board[slot] = symbol;
    }

    public void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                + board[1] + " | " + board[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                + board[4] + " | " + board[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                + board[7] + " | " + board[8]
                + " |");
        System.out.println("|---|---|---|");
    }

    public String checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = ""+board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = ""+board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = ""+board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = ""+board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = ""+board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = ""+board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = ""+board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = ""+board[2] + board[4] + board[6];
                    break;
            }
            //For X winner
//            System.out.println("line is "+line);
            if (line.equals("xxx")) {
                return "x";
            }else if (line.equals("000")) {
                return "0";
            }
        }

//        for (int a = 0; a < 9; a++) {
//            if (Arrays.asList(board).contains(
//                    String.valueOf(a + 1))) {
//                break;
//            }
//            else if (a == 8) {
//                return "draw";
//            }
//        }

        return "";
    }

}
