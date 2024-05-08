package exemplocalculadora;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.Container;
import javax.swing.JTextField;
import java.awt.event.*;

public class ExemploCalculadora extends JFrame{
    JLabel rotulo1,rotulo2,exibir;
    JTextField text1, text2;
    ImageIcon Icone, Icone2, Icone3, Icone4;
    JButton somar, dividir, subtrair, multiplicar;
    
    public ExemploCalculadora(){
        
        super("Exemplo de Calculadora");
       Container tela = getContentPane();
       setLayout(null);
       
       rotulo1 = new JLabel("1º Número :");
        rotulo2 = new JLabel("2º Número :");
       
      text1 = new JTextField(5);
       text2 = new JTextField(5);

      Icone = new ImageIcon("mais.png ");
       Icone2 = new ImageIcon("menos.png");
        Icone3 = new ImageIcon("vezes.png ");
         Icone4 = new ImageIcon("div.png");
       
      exibir = new JLabel("");
       somar = new JButton("Somar" , Icone);
        subtrair = new JButton("Subtrair" , Icone2);
         multiplicar = new JButton("Multiplicar" , Icone3);
          dividir = new JButton("Dividir" , Icone4);
      
      rotulo1.setBounds(50, 20, 100, 20); rotulo2.setBounds(50, 60, 100, 20);
       text1.setBounds(120, 20, 200, 20); text2.setBounds(120, 60, 200, 20);
        exibir.setBounds(50, 170, 200, 20); 
         somar.setBounds(90, 100, 100, 20); 
          subtrair.setBounds(200, 100, 100, 20);
           multiplicar.setBounds(90, 140, 120, 20);
            dividir.setBounds(220, 140, 100, 20);
          
        
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

        subtrair.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1,numero2,sub;
                        sub = 0;
                        numero1 =Integer.parseInt(text1.getText());
                        numero2 =Integer.parseInt(text2.getText());
                        sub = numero1 - numero2;
        exibir.setVisible(true);
        exibir.setText("A Subtração é : "+sub);
                    }
                }
        );

        multiplicar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1,numero2,mul;
                        mul = 0;
                        numero1 =Integer.parseInt(text1.getText());
                        numero2 =Integer.parseInt(text2.getText());
                        mul = numero1 * numero2;

        exibir.setVisible(true);
        exibir.setText("A Multiplicaçâo é : "+mul);
                    }
                }
        );

        dividir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        int numero1,numero2,div;
                        div = 0;
                        numero1 =Integer.parseInt(text1.getText());
                        numero2 =Integer.parseInt(text2.getText());
                        div = numero1 / numero2;

         exibir.setVisible(true);
         exibir.setText("A Divisão é : "+div);
                    }
                }
        );

        exibir.setVisible(false);
        
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(text1); tela.add(text2);
        tela.add(exibir); tela.add(somar);
        tela.add(subtrair);
        tela.add(dividir);
        tela.add(multiplicar);
        
        setSize(400, 250);
        setVisible(true); 
    }   
}
