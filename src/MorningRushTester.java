import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JOptionPane;

public class MorningRushTester
{
    public class MorningRushTester()
    {
        // TODO Auto-generated constructor stub
        private static final int DELAY = 1000;
        
        public MorningRushTester()
        {
            
        }
    }

    public static void main(String[] args)
    {
      //  JFrame frame = new Jframe;
      //  JButton button = new JButton("Add Coffee");
        
        final int initialGulps = 15;
        
        

        class DrinkCoffee implements ActionListener
        {
            private int gulps;
            public DrinkCoffee(int inGulps)
            {
                gulps = inGulps;
            }
            
            public int gulps()
            {
                return gulps;
            }
            @Override
            public void actionPerformed(ActionEvent event)
            {
                if (gulps > 0)
                {
                    System.out.println(gulps);
                }
                else if (gulps == 0)
                {
                    System.out.println("Go to school");
                    JOptionPane.showMessageDialog(null, "Make another?");
                    gulps = initialGulps;
                }
                --gulps;
        }
    }
    
        DrinkCoffee dc = new DrinkCoffee(initialGulps);
        Timer t = new Timer(DELAY, dc);
        t.start();                           // 1:06:30 ish
    
        JOptionPane.showMessageDialog(null, "Just about to go to school");
        System.out.println("Just about to go to school");
        System.exit(0);
    
    }

}
