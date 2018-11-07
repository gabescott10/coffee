import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class MorningRushTester
{
    public MorningRushTester()
    {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {

        class DrinkCoffee implements ActionListener
        {
            private int gulps;
            public DrinkCoffee(int inGulps)
            {
                gulps = inGulps;
            }
            public void actionPerformed(ActionEvent event)
            {
                if (gulps > 0)
                {
                    System.out.println(gulps);
                    --gulps;
                }
                else if (gulps == 0)
                {
                    System.out.println("Go to school");
                }
        }
    }
    
    DrinkCoffee dc = new DrinkCoffee(5);
    Timer t = new Timer(1000, dc);
    t.start();                           // 1:06:30 ish
    
    JOptionPane.showMessageDialog(null, "Make another?");
    System.exit(0);
    
    }

}
