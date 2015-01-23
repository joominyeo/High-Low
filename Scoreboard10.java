import javax.swing.*;
import java.awt.*;
/**
 * Scoreboard10 updates Panel10  and keep track of the number of times run.
 * @author Cai Yeo
 * @author Caleb Shen
 * @version 1/20/2015
 * @since 6
 */
public class Scoreboard10 extends JPanel
{
    private JLabel label1, label2, label3;
    private int total, run,  max;
    /**
     * Scoreboard10() places stat labels on the upper part of the panel.
     */
    public Scoreboard10()
    {
        setLayout(new GridLayout(1, 5));
        total = max = 0;

        add(new JLabel("Run: ", SwingConstants.RIGHT));
        label1 = new JLabel("0");
        label1.setHorizontalAlignment(SwingConstants.LEFT);
        add(label1);
        label2 = new JLabel("---");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
        add(label2);
        add(new JLabel("Max: ", SwingConstants.RIGHT));
        label3 = new JLabel("0");
        label3.setHorizontalAlignment(SwingConstants.LEFT);
        add(label3);
    }

    /**
     * Updates the stat panel on the upper part of the panel.
     * The update is dependant on the result of the correct guess.
     * 
     * @param arg a boolean value that determines if the guess is correct and
     *            allows to update.
     */
    public void update(boolean arg) //arg is true means player guessed correct
    {
        if(arg)
        {
            label2.setText("Yes");
            run+=1;
            label1.setText(""+run);
            label3.setText(""+max);
        }
        else{
            label2.setText("--No--");
            if(run>max){
                max=run;
                label3.setText(""+max);
            }
            run=0;
            label1.setText(""+run);
        }
    }
}