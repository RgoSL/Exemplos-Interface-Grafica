package exemplojradiobutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ExemploJRadioButton extends JFrame{
    
    JRadioButton primeira, segunda, terceira, quarta, quinta;
    JLabel rot, rot2;
    JButton Exibir;
    ButtonGroup Gp;
    
    public ExemploJRadioButton(){
        
        super("Exemplo de um JRadioButton");
        Container tela = getContentPane();
        tela.setLayout(null);
        
        rot = new JLabel ("Escolha uma cidade: ");
        rot.setBounds(50, 20, 200, 20);
        
        rot2 = new JLabel("");
        rot2.setBounds(150, 240, 400, 20);
        
        Exibir = new JButton("Exibir");
        Exibir.setBounds(200, 200 ,120 ,20 );
        
        primeira = new JRadioButton("Rio de Janeiro");
         segunda = new JRadioButton("São Paulo");
          terceira = new JRadioButton("Minas Gerais");
           quarta = new JRadioButton("Amazonas");
            quinta = new JRadioButton("Rio Grande do Sul");
        
        primeira.setBounds(50, 80, 120, 20);
         segunda.setBounds(50, 80, 120, 20);
          terceira.setBounds(50, 110, 120, 20);
           quarta.setBounds(50, 140, 120, 20);
            quinta.setBounds(50, 170, 200, 20);
            
        primeira.setMnemonic(KeyEvent.VK_J);
         segunda.setMnemonic(KeyEvent.VK_C);
          terceira.setMnemonic(KeyEvent.VK_D);
           quarta.setMnemonic(KeyEvent.VK_V);
            quinta.setMnemonic(KeyEvent.VK_P);
            
            Gp = new ButtonGroup();
            Gp.add(primeira);
            Gp.add(segunda);
            Gp.add(terceira);
            Gp.add(quarta);
            Gp.add(quinta);
            
            Exibir.addActionListener(
                    new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            
                            if(primeira.isSelected() == true)
                                rot2.setText("A cidade escolhida foi: "+primeira.getText());
                            
                            if(segunda.isSelected() == true)
                                rot2.setText("A cidade escolhida foi: "+segunda.getText());
                            
                             if(terceira.isSelected() == true)
                                rot2.setText("A cidade escolhida foi: "+terceira.getText());
                             
                              if(quarta.isSelected() == true)
                                rot2.setText("A cidade escolhida foi: "+quarta.getText());
                              
                               if(quinta.isSelected() == true)
                                rot2.setText("A cidade escolhida foi: "+quinta.getText());
                        }
                    }
            );
            
            tela.add(rot);
            tela.add(primeira);
            tela.add(segunda);
            tela.add(terceira);
            tela.add(quarta);
            tela.add(quinta);
            tela.add(Exibir);
            tela.add(rot2);
           
            setSize(500, 300);
            setLocationRelativeTo(null);
            setVisible(true);
        
    }  
    
}
