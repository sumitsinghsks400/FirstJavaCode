package DesignPattern.CreationalPattern.ProtoTypeDesign;


import java.util.ArrayList;
import java.util.List;

interface  protype<T>{
    T clone();

}
class GamePices implements protype<GamePices> {
    private  String color;

    private  int position;

    public GamePices(String color, int position) {
        this.color = color;
        this.position = position;
    }

    @Override
    public String toString() {
        return "GamePice{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public GamePices clone() {
        return new GamePices(this.color,this.position);
    }
}

class GameBoards implements protype<GameBoards> {
    private List<GamePices> pieces = new ArrayList<>();

    public void addPiece(GamePices gamePice) {
        pieces.add(gamePice);
    }

    public List<GamePices> getPieces() {
        return pieces;
    }

    public  void showBoardState() {
        System.out.println("Current Board State ");

        for(GamePices pice: pieces ) {
            System.out.println(pice);
        }
    }

    @Override
    public GameBoards clone() { // copy the shell copy means entier object
        GameBoards gameBoards =new GameBoards();
        for(GamePices pices:pieces) {
            gameBoards.addPiece(pices.clone());
        }
        return gameBoards ;

    }
}
public class WithProtypeDesignPattern {
    public static void main(String[] args) {
        GameBoards  gameBoard = new  GameBoards();
        gameBoard.addPiece(new GamePices("RED",1));
        gameBoard.addPiece(new GamePices("GREEN",2));
        gameBoard.addPiece(new GamePices("blue",3));
        gameBoard.showBoardState();
        //CheckPoint  this state

        GameBoards  copieBoard =gameBoard.clone();

        System.out.println("Copied Board");
        copieBoard.showBoardState();
    }
}
