import javax.swing.JFrame;

public class GameBoard {

    public static void main(String arg[]){
        System.out.println("HELLO WORLD");
    }

    private static GameBoard GAMEBOARD_INSTANCE;
    JFrame board;

    private GameBoard(){
        this.board = new JFrame();
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static GameBoard getInstance(){
        if (GAMEBOARD_INSTANCE == null){
            GAMEBOARD_INSTANCE = new GameBoard();
        }
        return GAMEBOARD_INSTANCE;
    }



}
