import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      board b = new board();
      change c = new change();
      paint p = new paint();
      ArrayList<Integer> list = b.start();
      Integer sum1;
      Integer sum2;
      p.board(list);
      do {
        b.display();
        c.move_peices(list);
        sum1 = 0;
        sum2 = 0;
        List<Integer> player1_board = (list.subList(1,7));
        List<Integer> player2_board = (list.subList(8,14));
        for(int i = 0; i < player1_board.size(); i++)
          sum1 += player1_board.get(i);
        for(int i = 0; i < player1_board.size(); i++)
          sum2 += player2_board.get(i);
      }
      while (sum1 > 0 && sum2 > 0 );
      c.finish(list,sum1,sum2);
      b.display();
      if (list.get(0) > list.get(7)){
        System.out.println("player1 wins!");
      }
      if (list.get(7) > list.get(0)){
        System.out.println("player2 wins!");
      }
      else{
        System.out.println("draw");
      }
    }
}