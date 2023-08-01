import java.util.Scanner;

public class Person implements Player{

//    int id;
    boolean isBot;
    char symbol;
    String name;
    boolean turn;

    public Person(char symbol, boolean isBot, String name){
//        this.id=id;
        this.symbol=symbol;
        this.isBot = isBot;
        this.name=name;
        this.turn=false;
    }

    @Override
    public int makeMove(boolean[] availableSlots) {
        Scanner sc = new Scanner(System.in);
        System.out.println(this.name+" Enter slot");
        int inputSlot = sc.nextInt();
        while(availableSlots[inputSlot]){
            System.out.println("That Slot already occupied");
            System.out.println(this.name+" Enter slot");
            inputSlot = sc.nextInt();
        }
        return inputSlot;
    }

}
