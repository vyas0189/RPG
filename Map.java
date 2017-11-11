import java.util.Random;

public class Map {
    private final int SIZE = 9;
    public char[][] map = new char[SIZE][SIZE];
    private Player player;
    private Chicken chicken;
    Random rn = new Random();

    public Map(){
        initializeMap();
        int col = randomCol();
        int row = randomRow();
        new Chicken(row,col,'-');
    }

    private void initializeMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = '-';
            }
        }
        map[4][4]='P';
    }
    public int randomCol(){
        int col = rn.nextInt(9);
        return col;
    }
    public int randomRow(){
        int row = rn.nextInt(9);
        return row;
    }
    void mapUpdate(int row, int col, char data){
        map[row][col]=data;
    }
    void printMap(){
        for(int i=0; i < SIZE;i++){
            for(int j=0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
