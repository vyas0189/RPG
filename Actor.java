public abstract class Actor {
    
        private int currRow,currCol;
        private char data;
    
         Actor(int currRow, int currCol, char data) {
            this.currRow = currRow;
            this.currCol = currCol;
            this.data = data;
        }
    
        public Actor() {
    
        }
    
    
        public int getCurrRow() {
            return currRow;
        }
    
        public void setCurrRow(int currRow) {
            this.currRow = currRow;
        }
    
        public int getCurrCol(int i) {
            return currCol;
        }
    
        public void setCurrCol(int currCol) {
            this.currCol = currCol;
        }
    
        public char getData() {
            return data;
        }
    
        public void setData(char data) {
            this.data = data;
        }
    
        abstract boolean checkBorder(int row,int col);
         abstract void move(int row,int col,char data);
    
    }
    