package exemplojlistmtpl;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ExemploJListMTPL extends JFrame{
    JList Lista;
    String Cidades[] = {"Rio de Janeiro" , "São Paulo" , "Minas Gerais" , "Espírito Santo" , "Bahia" , "Pernambuco" , "Rio Grande do Sul" , "Acre"};
    JButton Exibir;
    JLabel Rotulo;
    public ExemploJListMTPL(){
        
        super("Exemplo de Lista");
        Container tela = getContentPane();
        setLayout(null);
        Exibir = new JButton ("Exibir");
        Rotulo = new JLabel ("");
        Lista = new JList(Cidades);
        Lista.setVisibleRowCount(5);
        JScrollPane painelRolagem = new JScrollPane(Lista);
        Lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        painelRolagem.setBounds(40, 50, 150, 100);
        Exibir.setBounds(270, 50, 100, 30);
        Rotulo.setBounds(50, 150, 200, 30);
       
        Exibir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        Object Selecionados[] = Lista.getSelectedValues();
                        String Resultados = "Valores selecionados:\n";
                        for(int i= 0; i < Selecionados.length;i++)
                            Resultados += Selecionados[i].toString()+"\n";
                        JOptionPane.showMessageDialog(null, Resultados);
                        
                    }
                }
        );
        
        tela.add(Exibir);
        tela.add(painelRolagem);
        tela.add(Rotulo);
        setSize(400,250);
        setVisible(true);
        
    }
}