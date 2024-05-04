package mascara;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mascara extends JFrame{
    JPasswordField caixa;
    JLabel rotulo;
    public Mascara(){
        super("Exemplo com JPasswordField");
        Container tela = getContentPane();
        setLayout(null);
        
        rotulo = new JLabel("Senha");
         caixa = new JPasswordField(10);
        
         rotulo.setBounds(50, 20, 100, 20);
          caixa.setBounds(50, 60, 100, 20);
          
        tela.add(rotulo);
        tela.add(caixa);
        setSize(400,250);
        setVisible(true);
    }
    
}
