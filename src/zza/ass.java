package zza;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;





public class ass extends JFrame

{
	
	    
 JPanel mb1,mb2,mb3;
	   
    JButton an1,an2;

    JLabel bq1,bq2;

    JCheckBox fxk1,fxk2,fxk3,fxk4,fxk5,fxk6;

    JRadioButton dx1,dx2;

	

    
	
    public static void main(String[] args) 

    {

       ass lx=new ass();

    }

   

    public ass()

    {

       mb1=new JPanel(new GridLayout(5,1));

       mb2=new JPanel(new GridLayout(3,1));

       

      

      

        an1=new JButton(">");

       an2=new JButton(">>");

       fxk1=new JCheckBox("����");

       fxk2=new JCheckBox("����");

       fxk3=new JCheckBox("����");
       fxk4=new JCheckBox("�����");

       fxk5=new JCheckBox("��ѧ");

       fxk6=new JCheckBox("Ӣ��");

      
      
     
       this.setLayout(new GridLayout(1,2));

      

        mb1.add(fxk1); mb1.add(fxk2); mb1.add(fxk3);

        mb2.add(fxk5);  mb2.add(fxk6); mb2.add(fxk4); //����һ��һ����ӣ����ǰ�����ӽ���

       mb1.add(an1); mb1.add(an2);

      

         this.add(mb1);

        this.add(mb2);

        

        this.setTitle("�ܽ���");
       
        this.setSize(500,300);

        this.setLocation(200,180);

        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true); 
        
        an1.addActionListener(new MyActionListener());
		}
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
    }
}
  
}
	
	



 