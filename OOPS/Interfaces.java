package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Rook r = new Rook();
        r.moves();
    }
    
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("down, up, left, rigt, diagonal (in all direction) ");
    }
}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right ");
    }
}

class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal--(all 4 diagonal) ");
    }
}