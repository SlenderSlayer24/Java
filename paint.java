import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
public class paint extends Component{
      public void board(ArrayList<Integer> list) {
          JFrame frame = new JFrame("Mancala");
          frame.add(new CustomPaintComponent());
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(900,500);
          frame.setVisible(true);
          frame.getContentPane().setBackground(new Color(245, 207, 110));
    }
    public ArrayList<Integer> list;
    public void make_pieces(ArrayList<Integer> list, Graphics g) {
      Graphics2D g2d = (Graphics2D)g;
      int i = 0;
      int w = 10;
      int h = 10;
      int change = 5;
      int change2 = 100;
      do{
        int i2 = 0;
        int pieces = list.get(i);
        if (i == 0){
          do{
            g2d.fillOval(10,20+change,w,h);
            i2++;
          }
          while (i2 < pieces);
        }
        if (i > 0){
          if (i < 7){
            do{
              int x = change2 * i-1;
              g2d.fillOval(x,10,w,h);
              i2++;
          }
          while (i2 < pieces);
        }
        i++;
      }
    }
    while (i < 14);
  }
      public class CustomPaintComponent extends Component {
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D)g;
            int x1 = 10;
            int x2 = 770;
            int x3 = 110;
            int x4 = 220;
            int x5 = 330;
            int x6 = 440;
            int x7 = 550;
            int x8 = 660;
            int y = 10;
            int y1 = 50;
            int y2 = 250;
            int w = 100;
            int h = 440;
            int sw = 100;
            int sh = 150;
            g2d.setColor(new Color(145, 107, 10));
            g2d.fillOval(x1, y, w, h);
            g2d.fillOval(x2, y, w, h);
            g2d.fillOval(x3, y1, sw, sh);
            g2d.fillOval(x4, y1, sw, sh);
            g2d.fillOval(x5, y1, sw, sh);
            g2d.fillOval(x6, y1, sw, sh);
            g2d.fillOval(x7, y1, sw, sh);
            g2d.fillOval(x8, y1, sw, sh);
            g2d.fillOval(x3, y2, sw, sh);
            g2d.fillOval(x4, y2, sw, sh);
            g2d.fillOval(x5, y2, sw, sh);
            g2d.fillOval(x6, y2, sw, sh);
            g2d.fillOval(x7, y2, sw, sh);
            g2d.fillOval(x8, y2, sw, sh);
        }
      }
    }