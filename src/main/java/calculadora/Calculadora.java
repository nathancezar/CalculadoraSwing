package calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {
        
    public static void main(String args[]) {
        
        JFrame janela = new JFrame("Calculadora");
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        JPanel painel = new JPanel();
        
        JButton botaoSomar = new JButton("+");
        JButton botaoSubtrair = new JButton("-");
        JButton botaoDividir = new JButton("/");
        JButton botaoMultiplicar = new JButton("*");
        JButton botaoLimpar = new JButton("Clear");
        JButton botaoPorcentagem = new JButton("%");
        
        painel.add(botaoSomar);
        //painel.add(botaoSubtrair);
        painel.add(botaoMultiplicar);
        //painel.add(botaoLimpar);
        painel.add(botaoPorcentagem);
        //painel.add(botaoDividir);
        
        janela.add(painel);
        janela.setVisible(true);
    }
}