import java.util.Scanner;
import java.util.ArrayList;
public class change{
  public ArrayList<Integer> list;
  public void move_peices(ArrayList<Integer> list) {
    int place;
    do{
    Scanner Pick = new Scanner(System.in);
    System.out.println("Enter a number on the board"); 
    place = Pick.nextInt();
    if (list.get(place) == 0){
      System.out.println("That space is empty");
    }
    if (place <= 0){
      System.out.println("That space is off the board");
    }
    if (place > 12){
      System.out.println("That space is off the board");
    }
    }
    while (list.get(place) == 0 && place <= 0 && place > 12);
    int new_place;
    if (place >= 7){
      place++;
    }
    int i = 0;
    int x = list.get(place);
    do {
      i++;
      new_place = place+i;
      if (new_place >= list.size()){
        new_place = new_place - list.size();
      }
        int y = list.get(new_place);
        y = y + 1;
        list.set(new_place, y);
      }
      while (i < x);
      steal(list, new_place);
      list.set(place, 0);
  }
  public void finish(ArrayList<Integer> list, Integer sum1, Integer sum2){
    Integer player1_score;
      Integer player2_score;
      player1_score = list.get(0);
      player2_score = list.get(7);
      list.set(0,player1_score + sum1);
      list.set(7,player2_score + sum2);
      list.set(1,0);
      list.set(2,0);
      list.set(3,0);
      list.set(4,0);
      list.set(5,0);
      list.set(6,0);
      list.set(8,0);
      list.set(9,0);
      list.set(10,0);
      list.set(11,0);
      list.set(12,0);
      list.set(13,0);
  }
  public void steal(ArrayList<Integer> list, Integer place){
    int victim;
    int steal;
    if (place > 7){
      victim = place - 7;
    }
    if (place < 7){
      victim = place + 7;
    }
    else{
      return;
    }
    if (list.get(place) == 1){
      steal = list.get(place) + list.get(victim);
      if (place < 7){
        list.set(7,steal);
      }
      else{
        list.set(0,steal);
      }
      list.set(place,0);
      list.set(victim,0);
    }
  }
}
