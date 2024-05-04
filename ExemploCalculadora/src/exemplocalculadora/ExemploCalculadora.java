package exemplocalculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploCalculadora extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField text1, text2;
    JButton somar;
    
    public ExemploCalculadora(){
        
        super("Exemplo de Soma");
       Container tela = getContentPane();
       setLayout(null);
       
       rotulo1 = new JLabel("1º Número :");
       rotulo2 = new JLabel("2º Número :");
       
      text1 = new JTextField(5);
      text2 = new JTextField(5);
      
      exibir = new JLabel("");
      somar = new JButton("Somar");
      
      rotulo1.setBounds(50, 20, 100, 20); rotulo2.setBounds(50, 60, 100, 20);
       text1.setBounds(120, 20, 200, 20); text2.setBounds(120, 60, 200, 20);
        exibir.setBounds(50, 120, 200, 20); somar.setBounds(150, 100, 80, 20);
        
        somar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1,numero2,soma;
                        soma = 0;
                        numero1 =Integer.parseInt(text1.getText());
                        numero2 =Integer.parseInt(text2.getText());
                        soma = numero1 + numero2;
                        exibir.setVisible(true);
                        exibir.setText("A Soma é : "+soma);
                    }
                }
        );
        
        exibir.setVisible(false);
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(text1); tela.add(text2);
        tela.add(exibir); tela.add(somar);
        
        setSize(400,250);
        setVisible(true); 
    }

  
   
    
}
