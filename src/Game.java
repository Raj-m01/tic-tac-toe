public class Game {

    static boolean win=false, draw=false;
    static boolean[] availableSlots = new boolean[9];

    Person p1 = new Person('x',false,"p1");
    Person p2 = new Person('0',false,"p2");
    Board board1 = new Board(1);
    public void playGame(){
        p1.turn=true;
        board1.printBoard();
        while(!win && !draw){

            if(p1.turn){
                System.out.println("P1's turn");
                System.out.println("Enter slot number");
                int slot = p1.makeMove(availableSlots);
                availableSlots[slot]=true;
                board1.placeSymbolOnBoard('x',slot);
                p1.turn=false;
                p2.turn=true;
            }else{
                System.out.println("P2's turn");
                System.out.println("Enter slot number");
                int slot = p2.makeMove(availableSlots);
                availableSlots[slot]=true;
                board1.placeSymbolOnBoard('0',slot);
                p1.turn=true;
                p2.turn=false;

            }
            board1.printBoard();
            String winner = board1.checkWinner();
            if(winner.equals("x")){
                win=true;
                System.out.println("Player1 wins");
                return;
            }else if(winner.equals("0")){
                win=true;
                System.out.println("Player2 wins");
                return;
            }

        }

    }


}
