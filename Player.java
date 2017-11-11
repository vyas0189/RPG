public class Player extends Actor {
    private Map map;
    Player(){
        super(4,4,'p');
        this.setCurrRow(4);
        this.getCurrCol(4);
        this.setData('-');
    }

    @Override
    boolean checkBorder(int row, int col) {
        return false;
    }

    @Override
    void move(int row, int col, char data) {
        switch (data){
            case 'w':
                map.mapUpdate(row-1,col,'P');
                break;
            case 'a':
                map.mapUpdate(row,col-1,'P');
                break;
            case 's':
                map.mapUpdate(row+1,col,'P');
                break;
            case 'd':
                    map.mapUpdate(row,col+1,'P');
                break;
            default:
                System.out.println("Not a correct input");
        }
    }
}
