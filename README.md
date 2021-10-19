### Simple GUI using Java swing and awt  toolkits
- Graphical User Interfaces (GUI) are key allowing users to interact with systems
- In this tutorial, we illustrate creating a window, with a display of a message
- The scripting is done in Apache-NetBeans IDE

- To start, java awt and swing are used
#### The Script is as below:
<pre>
<code>
package oneframe;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Danny-Votez
 */
// Creating a simple graphical user interface (GUI) window with a message
public class Oneframe {
    public static  void main(String[] args){
        // Created window, and the name it will have in brackets
        JFrame frame = new JFrame("Morning Welcome Message");
        
        // Action that will take place if there is closing window        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel textLabel = new JLabel("Good Morning, it is amazing "
                + "to see you are awake. Ciao! "
                + "I love doning this, and it is amazing", SwingConstants.CENTER);
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
</code>
</pre>
<hr>

### Compiling and Running Script
- To compile and run the created program, use command line to to file location
- Then, first complile the program using the statement below;

     <code>javac oneframe.java</code>

- Next, run the script using the statement below;

     <code>java oneframe.java</code>
<hr>

### Runtime Screen
- Below is the resulting screen, with the window and message display
![Message](https://user-images.githubusercontent.com/77758884/137915999-095fe41f-2e1a-40e9-9977-21299c50dc00.jpg)
