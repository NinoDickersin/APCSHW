import javax.swing.*;
import java.awt.*;
public class CtoF extends JFrame implements ActionListener{
    private Container pane;

    private JButton b;
    private JLabel l;
    private JTextField t;
    private JCheckBox c;
    public Window2() {
	this.setTitle("Celsius-Fahrenheit Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	l = new JButton("Convert");
	b = new JLabel("",null,JLabel.CENTER);
	t = new JTextField(12);
	c = new JCheckBox("Overclock!!!");
	pane.add(l);
	pane.add(b);
	pane.add(t);
	pane.add(c);
    }
    public void actionPerformed(ActionEvent e){
	if("Convert".equals(e.getActionCommand()){
		String s = t.getText();
		int i = Integer.parseInt(s);
		i = i*(9/5) + 32;
	}
    }
    l.addActionListener(this);
    l.setActionCommand();

    public static void main(String[] args) {
        Window2 g = new Window2();
        g.setVisible(true);
    }
}

