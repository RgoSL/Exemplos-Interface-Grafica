package exemplojtable;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
        
public class ExemploJTable extends JFrame {
    //Variáveis Para Uso da JTable
    private JTable Table;
    private final String Colunas [] = {"Nome : ", "Idade : ", "Sexo : " };
    private final String Dados [] [] = {
        {"Charles", "19","Masculino"},
        {"Galileu", "454","Masculino"},
        {"Hawking", "76","Masculino"},
        {"Newton", "375","Masculino"},
        {"Kepler", "447","Masculino"},
        {"Einsten", "139","Masculino"},
        {"Copernicus", "545","Masculino"}};
    
    public ExemploJTable(){
    setLayout(new FlowLayout()); //Tipo de Layout
    setSize(new Dimension(600, 200)); //Tamanho do Formulário
    setLocationRelativeTo(null); //Centralizado
    setTitle("Exemplo JTable"); //Título
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setando a Ação Padrão de Fechamento do Formulário,
                                                      //Neste Caso Irá Fechar o Programa
// Instanciando a JTable
Table = new JTable(Dados, Colunas);
Table.setPreferredScrollableViewportSize(new Dimension(500,100)); //Barra de Rolagem
Table.setFillsViewportHeight(true);

// Adicionando a Tabela em Uma Barra de Rolagem, Ficará Envolta, Pela Mesma
JScrollPane scrollPane = new JScrollPane(Table);

// Adicionando ao JFrame "Formulário" a JTable "Tabela"
    add(scrollPane);
new ExemploJTable().setVisible(true);

} /* Construtor da Classe,
     Antes de Executar o Método Main(),
    Irá Construir o JFrame e a JTable */
    
    }
    

 
    

