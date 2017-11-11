import java.util.Scanner;
public class RPG {
    public static void main(String[] args) {
        Map map = new Map();
        Actor pl = new Player();
        Actor ch = new Chicken();
        map.printMap();
        System.out.println("up: w | down: s | left: a | right: d | quit: q");
        System.out.print("your move: ");
        char moves;
        Scanner input = new Scanner(System.in);
        moves = input.next().charAt(0);
        while (moves != 'q'){

            switch (moves){
                case 'w':
                    pl.setData('w');
                    break;
                case 'a':
                    pl.setData('a');
                    break;
                case 's':
                    pl.setData('s');
                    break;
                case 'd':
                    pl.setData('d');
                    break;
                default:
                    System.out.println("Not a correct input");
            }

            map.printMap();
            System.out.println("up: w | down: s | left: a | right: d | quit: q");
            System.out.print("your move: ");
            moves = input.next().charAt(0);

        }
    }
}
