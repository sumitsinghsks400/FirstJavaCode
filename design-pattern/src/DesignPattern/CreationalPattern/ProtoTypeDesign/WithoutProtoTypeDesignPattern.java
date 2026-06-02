package DesignPattern.CreationalPattern.ProtoTypeDesign;

import java.util.ArrayList;
import java.util.List;

class GamePice {
    private  String color;

    private  int position;

    public GamePice(String color, int position) {
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
}

class GameBoard {
    private List<GamePice> pieces = new ArrayList<>();

    public void addPiece(GamePice gamePice) {
        pieces.add(gamePice);
    }

    public List<GamePice> getPieces() {
        return pieces;
    }

    public  void showBoardState() {
        System.out.println("Current Board State ");

        for(GamePice pice: pieces ) {
            System.out.println(pice);
        }
    }
}

public class WithoutProtoTypeDesignPattern {
    public static void main(String[] args) {

        GameBoard  gameBoard = new  GameBoard();
        gameBoard.addPiece(new GamePice("RED",1));
        gameBoard.addPiece(new GamePice("GREEN",2));
        gameBoard.addPiece(new GamePice("blue",3));
        gameBoard.showBoardState();
 //CheckPoint  this state

        GameBoard  copieBoard =new GameBoard();

        for (GamePice pice : gameBoard.getPieces()) {
            copieBoard.addPiece( new GamePice(pice.getColor(),pice.getPosition()));
        }

        System.out.println("Copied Board");
        copieBoard.showBoardState();






    }
}
