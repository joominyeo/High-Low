import javax.swing.JFrame;
/**
 * Lab10 Driver creates and initiates Panel10
 * @author Cai Yeo
 * @author Caleb Shen
 * @version 1/20/2015
 * @since 6
 */
public class Driver
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("High-Low");
        frame.setSize(500, 500);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Panel10());
        frame.setVisible(true);
    }
}