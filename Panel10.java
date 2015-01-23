import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Panel10 places fields and buttons in the JPanel.
 * It also waits for the user input and updates the scores and fields.
 * @author Cai Yeo
 * @author Caleb Shen
 * @version 1/20/2015
 * @since 6
 */
public class Panel10 extends JPanel
{
    private Display10 display;
    private Scoreboard10 scoreboard;
    /**
     * The Panel10() constructor creates and places the "High" and the "Low" buttons.
     */
    public Panel10()
    {
        setLayout(new BorderLayout());

        scoreboard = new Scoreboard10();
        add(scoreboard, BorderLayout.NORTH);

        display = new Display10();
        add(display, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        add(panel, BorderLayout.SOUTH);
        JButton button1 = new JButton("High");
        button1.addActionListener(new Listener1());
        panel.add(button1);
        JButton button2 = new JButton("Low");
        button2.addActionListener(new Listener2());
        panel.add(button2);
    }
    /**
     * Listener for "High" button.
     */
    private class Listener1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            scoreboard.update(display.guessHigh());
        }
    }
    /**
     * Listener for "Low" button.
     */
    private class Listener2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            scoreboard.update(display.guessLow());
        }
    }
}