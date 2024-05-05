package exemplodesabilitarhabilitar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploDesabilitarHabilitar extends JFrame {
    
    JLabel rotulo1 , rotulo2;
    JButton Habilitar , Desabilitar;
    
    public ExemploDesabilitarHabilitar(){
        
        super("Exemplo de Desabilitar e Habilitar Componente");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo1 = new JLabel ("Rótulo 1"); rotulo2 = new JLabel ("Rótulo 2");
        Habilitar = new JButton ("Habilitar"); Desabilitar = new JButton ("Desabilitar"); 
        
        rotulo1.setBounds(50, 20, 100, 20); rotulo2.setBounds(50, 60, 100, 20);
        Habilitar.setBounds(80, 100, 100, 20); Desabilitar.setBounds(250, 100, 100, 20);
        
        Desabilitar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo1.setEnabled(false);
                        rotulo2.setEnabled(false);
                        
                    }
                    
                }
        );
        
        Habilitar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo1.setEnabled(true);
                        rotulo2.setEnabled(true);
                    }
                }
        );
       
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(Habilitar); tela.add(Desabilitar);
        setSize(400,250);
        setVisible(true);
        
    }
    

  
    
}
