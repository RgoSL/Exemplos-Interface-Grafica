package exemplojmenu01;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ExemploJMenu01 extends JFrame{
    JMenuBar barra;
    JMenu opcoes;
    JMenuItem limpar, fonte, sair;

 public ExemploJMenu01() {
     super("Exemplo de Menus");
     Container  tela = getContentPane();
     tela.setLayout(null);
     
     barra = new JMenuBar();
     setJMenuBar(barra);
      opcoes = new JMenu("Opções");
       barra.add(opcoes);
        limpar = new JMenuItem("Limpar");
         fonte = new JMenuItem("Fonte");
          sair = new JMenuItem("Sair");
     
     limpar.setMnemonic(KeyEvent.VK_L);
       fonte.setMnemonic(KeyEvent.VK_F);
         sair.setMnemonic(KeyEvent.VK_S);
         
         opcoes.add(limpar);
         opcoes.add(fonte);
         opcoes.addSeparator();
         opcoes.add(sair);
         
         setSize(500,300);
         setLocationRelativeTo(null);
         setVisible(true);
 }
  
}