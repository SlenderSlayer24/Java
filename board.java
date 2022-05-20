import java.util.ArrayList;
public class board {
  public ArrayList<Integer> list;
  public ArrayList<Integer> start() {
    list = new ArrayList<>();
      int player1 = 0;
      list.add(player1);
      int board1 = 4;
      list.add(board1);
      int board2 = 4;
      list.add(board2);
      int board3 = 4;
      list.add(board3);
      int board4 = 4;
      list.add(board4);
      int board5 = 4;
      list.add(board5);
      int board6 = 4;
      list.add(board6);
      int player2 = 0;
      list.add(player2);
      int board7 = 4;
      list.add(board7);
      int board8 = 4;
      list.add(board8);
      int board9 = 4;
      list.add(board9);
      int board10 = 4;
      list.add(board10);
      int board11 = 4;
      list.add(board11);
      int board12 = 4;
      list.add(board12);
      return list;
}
public void display() {
  //	subList(int fromIndex, int toIndex)
      System.out.println(list.subList(0,1));
      System.out.println(list.subList(1,7));
      System.out.println(list.subList(7,8));
      System.out.println(list.subList(8,14));
}
}