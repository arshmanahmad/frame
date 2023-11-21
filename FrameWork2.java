import java.awt.*;
import java.awt.event.*;

class AddNumbers extends Frame implements ActionListener {

    TextField txt1,txt2;
    Label label;
    Button btn1;
    int num1,num2;
    int result;

    AddNumbers(){
        super("Addition Calculator");
        setBounds(400, 400, 500, 500);
        setBackground(new Color(143,143,143));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setResizable(false);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        txt1 = new TextField(25);
        txt2 = new TextField(25);
        btn1 = new Button("Click to Add");
        label = new Label("0");

        add(txt1);add(btn1);add(txt2);
        add(label);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == btn1){
            num1 = Integer.parseInt(txt1.getText());
            num2 = Integer.parseInt(txt2.getText());
            result = num1 + num2; 

            label.setText(str.valueOf(result));
            
        }
        
    }
}


class FrameWork2{
    public static void main(String arg[]){
        new AddNumbers();
    }
}