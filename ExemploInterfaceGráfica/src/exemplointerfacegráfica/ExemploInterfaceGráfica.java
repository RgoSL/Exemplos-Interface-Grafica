package exemplointerfacegráfica;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.*;

public class ExemploInterfaceGráfica extends JFrame {
    
     JLabel rotulo1 , rotulo2 , rotulo3 , rotulo4 , rotulo5 , rotulo6 , rotulo7;
     JTextField texto1 , texto2 , texto3 , texto4 , texto5 , texto6 , texto7;
     ImageIcon Icone;
     JButton botao1, botao2;
      
    public ExemploInterfaceGráfica(){
        super("Exemplo Inicial de Interface");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel (" Nome :");
         rotulo2 = new JLabel (" CPF :");
          rotulo3  = new JLabel (" RG :");
           rotulo4 = new JLabel ("ENDEREÇO :");
            rotulo5 = new JLabel ("Celular :");
             rotulo6 = new JLabel ("ESTADO :");
              rotulo7 = new JLabel ("CEP :");
                
        texto1 = new JTextField(50);
         texto2 = new JTextField(3);
          texto3 = new JTextField(10);
           texto4 = new JTextField(35);
            texto5 = new JTextField(35);
             texto6 = new JTextField(35);
              texto7 = new JTextField(10);
              
               Icone = new ImageIcon("abrir.png");

               botao1 = new JButton("Botão" , Icone);
               botao2 = new JButton("Botão 2" , Icone);
               
        rotulo1.setBounds(50,20,80,20);
         rotulo2.setBounds(50,60,80,20);
          rotulo3.setBounds(50,100,80,20);
           rotulo4.setBounds(40,140,80,20);
            rotulo5.setBounds(40,180,80,20);
             rotulo6.setBounds(40,220,80,20);
              rotulo7.setBounds(50,260,80,20);
                  
        texto1.setBounds(110,20,200,20);
         texto2.setBounds(110,60,60,20);
          texto3.setBounds(110,100,80,20);
           texto4.setBounds(110,140,80,20);
            texto5.setBounds(110,180,80,20);
             texto6.setBounds(110,220,80,20);
              texto7.setBounds(110,260,80,20);
                  
        botao1.setBounds(150, 290, 100, 30);
        botao2.setBounds(300,290,100, 30);
               
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
            
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        
        tela.add(botao1);
        tela.add(botao2);
        
        setSize(600,400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    

}
