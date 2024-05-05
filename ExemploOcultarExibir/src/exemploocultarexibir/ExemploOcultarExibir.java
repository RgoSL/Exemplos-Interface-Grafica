package exemploocultarexibir;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ExemploOcultarExibir extends JFrame {
    
    JLabel rotulo1 , rotulo2 ; 
    JButton Ocultar , Exibir ;
    
    public ExemploOcultarExibir(){
        
        super("Exemplo de Ocultar e Exibir Componente");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel("Rótulo 1"); rotulo2 = new JLabel("Rótulo 2");
        Ocultar = new JButton("Ocultar"); Exibir = new JButton("Exibir");
        
        rotulo1.setBounds(50, 20, 100, 20); rotulo2.setBounds(50, 60, 100, 20);
        Ocultar.setBounds(100, 100, 80, 20); Exibir.setBounds(250, 100, 80, 20);
        
        Ocultar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo1.setVisible(false);
                        rotulo2.setVisible(false);
                    }
                }
        );
        
         Exibir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo1.setVisible(true);
                        rotulo2.setVisible(true);
                    }
                }
        );
        
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(Exibir); tela.add(Ocultar);
        setSize(400,250);
        setVisible(true);
        
    }

  
  
}
