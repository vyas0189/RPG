

public class Chicken extends Actor {
    
    
        Chicken(int currRow, int currCol, char data) {
            super(currRow, currCol, data);
        }
        Chicken(){
            super();
        }
    
        @Override
        boolean checkBorder(int row, int col) {
            return false;
        }
    
        @Override
        void move(int row, int col, char data) {
    
        }
    
    }
    