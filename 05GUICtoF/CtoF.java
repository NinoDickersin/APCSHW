import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class CtoF extends JFrame implements ActionListener{
    private Container pane;
    private Container buttons;
    private Container textyStuff;
    private JButton b;
    private JLabel l;
    private JTextField text;
    private JCheckBox box;
    public void CtoF() {
	this.setTitle("Celsius-Fahrenheit Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	
	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,1));

	b = new JButton("Convert");
	l = new JLabel("Number",null,JLabel.CENTER);
	text = new JTextField(40);
	box = new JCheckBox("Fahrenheit to Celsius");

	b.setActionCommand("convert");
	b.addActionListener(this);

	buttons = new Container();
	buttons.setLayout(new FlowLayout());
	buttons.add(b);
	buttons.add(box);

	textyStuff = new Container();
	textyStuff.setLayout(new FlowLayout());
	textyStuff.add(l);
	textyStuff.add(text);

	pane.add(textyStuff);
	pane.add(buttons);
    }
    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if(action.equals("convert")){
	    String s = text.getText();
	    int i = Integer.parseInt(s);
	    if(box.isSelected()){
		i = (i - 32) * (5/9);
	    }else{
		i = i*(9/5) + 32;
	    }
	    s = ""+i;
	    text.setText(s);
	}
    }

    public static void main(String[] args) {
        CtoF g = new CtoF();
        g.setVisible(true);
    }
}

