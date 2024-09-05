package OOPS;

public class Interfaces {
    public static void main(String args[]){
        Queen q1 = new Queen();
        q1.moves();

    }
    
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void  moves(){
    System.out.print(" It moves up,down,right,left diagonallly in all 4 directions");
    }
}

class Rook implements ChessPlayer{
    public void  moves(){
    System.out.print("it moves up,down,right,left");
    }
}

class King implements ChessPlayer{
    public void  moves(){
    System.out.print("it moves up,down,right,left only 1 step at a time ");
    }
}

