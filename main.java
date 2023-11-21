import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
  public static void createAndShowGUI() {
    JFrame mframe = new JFrame("GUI");
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2,2));

    mframe.add(panel);


    mframe.setVisible(true);
    mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mframe.setSize(600, 600);
    mframe.setResizable(true);

    JPanel dpanel = new JPanel();
    dpanel.setLayout(new GridLayout(3,3));
    JPanel blank1 = new JPanel();
    dpanel.add(blank1);
    JButton forwardButton = new JButton("<html><center><body style=\"font-size: 50px\"<b>&#8593;</b></center></html>");
    dpanel.add(forwardButton);
    JPanel blank2 = new JPanel();
    dpanel.add(blank2);
    JButton leftButton = new JButton("<html><center><body style=\"font-size: 50px\"<b>&#8592;</b></center></html>");
    dpanel.add(leftButton);
    JPanel pspanel = new JPanel();
    pspanel.setLayout(new GridLayout(0,2));
    dpanel.add(pspanel);
    JButton playButton = new JButton("<html><center><body style=\"font-size: 20px\"<b>&#9654;</b></center></html>");
    pspanel.add(playButton);
    JButton stopButton = new JButton("<html><center><body style=\"font-size: 30px\"<b>&#9632;</b></center><html>");
    pspanel.add(stopButton);
    JButton rightButton = new JButton("<html><center><body style=\"font-size: 50px\"<b>&#8594;</b></center></html>");
    dpanel.add(rightButton);
    JPanel blank3 = new JPanel();
    dpanel.add(blank3);
    JButton backButton = new JButton("<html><center><body style=\"font-size: 50px\"<b>&#8595;</b></center></html>");
    dpanel.add(backButton);
    JPanel blank4 = new JPanel();
    dpanel.add(blank4);
    JTextArea logText = new JTextArea("Log");
    logText.setEditable(false);
    JTextArea videoplaceholder = new JTextArea("Video Placeholder");
    videoplaceholder.setEditable(false);
    JTextArea blankplaceholder = new JTextArea("Blank Placeholder");
    blankplaceholder.setEditable(false);

    panel.add(dpanel);
    panel.add(logText);
    panel.add(videoplaceholder);
    panel.add(blankplaceholder);
}

public static void main(String[] args) {
    createAndShowGUI();
  }
}
