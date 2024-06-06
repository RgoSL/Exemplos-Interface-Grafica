package exemplocombocheckradio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploComboCheckRadio extends JFrame{
    JLabel rot1, rot2, rot3, text;
    JCheckBox negrito, italico, normal, negritoitalico;
    JRadioButton tam1, tam2, tam3, tam4;
    ButtonGroup Grupo;
    String Cor[] = {"Sem Cor", "Vermelho", "Azul", "Verde", "Amarelo", "Branco", "Preto"};
    JComboBox Lista;
    Integer Style, tamFont;
    
    public ExemploComboCheckRadio(){
        
        super("Exemplo Combo Check Radio BOX");
        Container tela = getContentPane();
        setLayout(null);
        
        rot1 = new JLabel("Cor");
         rot2 = new JLabel("Estilo");
          rot3 = new JLabel("Tamanho");
           text = new JLabel("Programa Feito em Java");
            Lista = new JComboBox(Cor);
        
        Lista.setMaximumRowCount(7);
         negrito = new JCheckBox("Negrito");
          italico = new JCheckBox("Italico");
           normal = new JCheckBox("Normal");
        
        negritoitalico = new JCheckBox("Negrito Itálico");
        
        tam1 = new JRadioButton("12");
         tam2 = new JRadioButton("14");
          tam2 = new JRadioButton("16");
           tam2 = new JRadioButton("18");
         
        Grupo.add(tam1);
         Grupo.add(tam2);
          Grupo.add(tam3);
           Grupo.add(tam4);
           
          rot1.setBounds(40,20,70,20);
           rot2.setBounds(200,20,70,20);
            rot3.setBounds(300,20,70,20);
             text.setBounds(100,200,300,20);
              Lista.setBounds(40,50,150,20);
              
         negrito.setBounds(200,50,100,20);
         italico.setBounds(200,70,100,20);
         normal.setBounds(200,90,100,20);
         negritoitalico.setBounds(200,100,150,20);
         
         tam1.setBounds(350, 50, 100, 20);
          tam2.setBounds(350, 70, 100, 20);
           tam3.setBounds(350, 90, 100, 20);
            tam4.setBounds(350, 110, 100, 20);
            
         tamFont = 12;
         Style = Font.PLAIN;
         // Coloca Cor na Fonte
         
         Lista.addActionListener(new ActionListener (){
        public void actionPerformed(ActionEvent e){
         if (Lista.getSelectedItem().toString() == "Sem Cor")
             text.setForeground(Color.black); 
        if (Lista.getSelectedItem().toString() == "Vermelho")
             text.setForeground(Color.red); 
        if (Lista.getSelectedItem().toString() == "Azul")
             text.setForeground(Color.blue); 
        if (Lista.getSelectedItem().toString() == "Verde")
             text.setForeground(Color.green); 
        if (Lista.getSelectedItem().toString() == "Amarelo")
             text.setForeground(Color.yellow); 
        if (Lista.getSelectedItem().toString() == "Branco")
             text.setForeground(Color.white); 
        if (Lista.getSelectedItem().toString() == "Preto")
             text.setForeground(Color.black);}});
         // Coloca a Fonte Tamanho 12
         tam1.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 
             }
         }
             
         }
         
        
        
    
        
    

