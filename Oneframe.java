package oneframe;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Danny-Votez
 */
// Creating simple graphical user interface (GUI) window and message it will have
public class Oneframe {
    public static  void main(String[] args){
        // Created window, and the name it will have in brackets
        JFrame frame = new JFrame("Morning Welcome Message");
        // Setting the frame icon with a specific image from file
        // If this is not set, the default java image is used
        frame.setIconImage(new ImageIcon("C:/users/danne/Desktop/icon.png").getImage());
        
        // Action that will take place if there is closing window        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("Good Morning, it is amazing "
                + "to see the world wide awake. "
                + "It is an amazing morning. Ciao!", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(550,200));
        // After creating the JLabel, it is important to add it to the JFrame
        // This is done using the below code
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        // Displaying the created window
        // The below code makes window to be at the center of the screen
        frame.setLocationRelativeTo(null);
        // The below sets the window's size
        // the pack() method looks at what the JFrame contains
        // And automatically sets the size of the window based on it
        // Hence, in this case, pack() ensures the window is large enough
        // to hold the JLabel
        frame.pack();
        // To show the created widow, the setVisible() method need be applied
        frame.setVisible(true);        
    }    
}
/* To compile and run the created program, use command line to to file location

Then, first complile the program using the statement below;

javac oneframe.java

Next, run the script using the statement below

java oneframe.java


*/
