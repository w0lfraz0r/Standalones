
package texteditor;

import javax.swing.JFrame;

/**
 *
 * @author Vaibhav
 */
public class TextEditor {

    public static void main(String[] args) {
        textEditorGui obj = new textEditorGui();
        obj.setBounds(0,0,500,500);
        obj.setTitle("Notepad");
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
