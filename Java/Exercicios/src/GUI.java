import javax.swing.JOptionPane;

public class GUI {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));

        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
        JOptionPane.showMessageDialog(null, "You're " + age + " years old.");
        JOptionPane.showMessageDialog(null, "You're " + height + " cm tall.");
    }
}
