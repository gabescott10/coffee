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
        JFrame frame = 
        JButton button = new JButton("Add Coffee");
        
        final int initialGulps = 5;

        class DrinkCoffee implements ActionListener
        {
            private int gulps;
            public DrinkCoffee(int inGulps)
            {
                gulps = inGulps;
            }
            
            public int gulps()
            {
                
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
    
        DrinkCoffee dc = new DrinkCoffee(5);
        Timer t = new Timer(1000, dc);
        t.start();                           // 1:06:30 ish
    
        JOptionPane.showMessageDialog(null, "Just about to go to school");
        System.out.println("Just about to go to school");
        System.exit(0);
    
    }

}
