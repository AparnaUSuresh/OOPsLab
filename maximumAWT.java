import java.awt.*;
import java.awt.event.*;
class maximumAWT implements ActionListener
{
    TextField t1;
    TextField t2;
    TextField t3;
    TextField result;
    Label l1,l2,l3,l4;
    Frame f;
    maximumAWT()
    {
        f=new Frame();
        f.setSize(600,600);
        f.setLayout(null);
        f.setTitle("Maximum of three numbers");
        f.setVisible(true);
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        result=new TextField();
        l1=new Label("A:");
        l2=new Label("B:");
        l3=new Label("C:");
        l4=new Label("Maximum:");
        Button b=new Button("Find Maximum");
        l1.setBounds(50,50,80,30);
        t1.setBounds(200,50,80,30);
        l2.setBounds(50,200,80,30);
        t2.setBounds(200,200,80,30);
        l3.setBounds(50,300,80,30);
        t3.setBounds(200,300,80,30);
        l4.setBounds(50,400,80,30);
        result.setBounds(200,400,80,30);
        b.setBounds(350,500,80,30);
        result.setEnabled(false);
        b.addActionListener(this);
       f.addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent we){
               System.exit(0);
           }
       });
       f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(result);
        f.add(b);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=Integer.parseInt(t3.getText());
        int res=a;
        if(b>res)
            res=b;
        if(c>res)
            res=c;
        result.setText(Integer.toString(res));
    }
    public static void main(String[] args)
    {
        maximumAWT m=new maximumAWT();
    }
}