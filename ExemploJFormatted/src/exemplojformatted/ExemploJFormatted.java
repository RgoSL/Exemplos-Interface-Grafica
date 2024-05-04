package exemplojformatted;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
        
public class ExemploJFormatted extends JFrame{
    
    JLabel rotulocep, rotulotel, rotulocpf, rotulodata;
    JFormattedTextField cep, tel, cpf, data;
    MaskFormatter mascaracep, mascaratel, mascaracpf, mascaradata;
    
public ExemploJFormatted(){
    super("Exemplo com JFormattedTextField");
    Container tela = getContentPane();
    setLayout(null);
    
    rotulocep = new JLabel("CEP :");
     rotulotel = new JLabel("Telefone :");
      rotulocpf = new JLabel("CPF :");
       rotulodata = new JLabel("Data :");    
       
    rotulocep.setBounds(50, 40, 100, 20);
     rotulotel.setBounds(50, 80, 100, 20);
      rotulocpf.setBounds(50, 120, 100, 20);
       rotulodata.setBounds(50, 160, 100, 20);
      
 try{
     mascaracep = new MaskFormatter("#####-###"); 
      mascaratel = new MaskFormatter("#####-###"); 
       mascaracpf = new MaskFormatter("#####-###"); 
        mascaradata = new MaskFormatter("#####-###"); 
        
     mascaracep.setPlaceholderCharacter('_');
       mascaratel.setPlaceholderCharacter('_');
        mascaracpf.setPlaceholderCharacter('_');
         mascaradata.setPlaceholderCharacter('_'); 
 }
 catch(ParseException excp){}

 cep = new JFormattedTextField(mascaracep); 
  cep = new JFormattedTextField(mascaratel); 
   cep = new JFormattedTextField(mascaracpf); 
    cep = new JFormattedTextField(mascaradata); 
}


    
}
