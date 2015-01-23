import javax.swing.*;
import java.awt.*;
import java.lang.*;
/**
 * Display10 performs the integer guessing process and determines the
 * boolean "High" or "Low". It also updates the scoreboard with a
 * new integer.
 * @author Cai Yeo
 * @author Caleb Shen
 * @version 1/20/2015
 * @since 6
 */
public class Display10 extends JPanel
{
    private JLabel label;
    private int last, next;
    /**
     * Display10() constructs the display panel.
     */
    public Display10()
    {
        setLayout(new GridLayout(1, 1));
        next = 5;
        label = new JLabel("5");
        label.setFont(new Font("Serif", Font.BOLD, 100));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.blue);
        add(label);
    }

    /**
     * stores the current number as last and generates and stores
     * a new random integer greater than 1 and less than 9, inclusive,
     * into next. It also prevents the new integer from being the same
     * as the previous.
     */
    private void pickNext()
    {
        last=next;
        next=(int)(Math.random()*9)+1;
        while (last==next)
        {
            next=(int)(Math.random()*9)+1;
        }
        label.setText(""+next);
    }

    /**
     * The guessHigh() method uses the pickNext() method
     * to generate new integer not equal to the current.
     *
     *@return boolean new integer greater than the last.
     */
    public boolean guessHigh()
    {
        pickNext();
        return next > last;
    }

    /**
     * The guessHigh() method uses the pickNext() method
     * to generate new integer not equal to the current.
     *
     *@return boolean new integer smaller than the last.
     */
    public boolean guessLow()
    {
        pickNext();
        return next < last;
    }
}