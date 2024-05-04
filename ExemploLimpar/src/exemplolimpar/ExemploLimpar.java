package exemplolimpar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploLimpar extends JFrame {
    
    JLabel rotulo1, rotulo2;
    JTextField text1, text2;
    JButton Limpar;
    
    public ExemploLimpar(){
        
        super("Exemplo da Função Limpar");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("1° Número");
         rotulo2 = new JLabel("2° Número");
        
        text1 = new JTextField(5);
         text2 = new JTextField(5);
         
         Limpar = new JButton("Limpar");
         
        rotulo1.setBounds(50, 20, 100, 20);
         rotulo2.setBounds(50, 60, 100, 20);
         
        text1.setBounds(120, 20, 200, 20);
         text2.setBounds(120, 60, 200, 20);
          Limpar.setBounds(150, 100, 80, 20);
          
          Limpar.addActionListener(
                  new ActionListener(){
                      public void actionPerformed(ActionEvent e){
                          
                          text1.setText(null); 
                          text2.setText(null);
                          text1.requestFocus();
                      }
                  }
          );
          
          tela.add(rotulo1);
           tela.add(rotulo2);
            tela.add(text1);
             tela.add(text2);
               tela.add(Limpar);
               
               setSize(400,250);
               setVisible(true);
    }
}
