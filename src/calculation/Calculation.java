/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fdacostamillos
 */
public class Calculation extends JFrame{
    public Calculation(){
        super("Calculadora");      
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        JTextField mostrar = new JTextField(30);
        panel1.add(mostrar);
        
        
        JPanel panel2 = new JPanel();
       
        GridLayout gl = new GridLayout(4,4);
        panel2.setLayout(gl);
       // gl.setHgap(5);
        //gl.setVgap(5);       
        for(int i = 1 ; i <=9 ; i++){
            panel2.add(new JButton(String.valueOf(i)));
            if (i==3){
                panel2.add(new JButton("+"));
            }
            else if (i==6){
            panel2.add(new JButton("-"));
            }
            else if (i==9){
                panel2.add(new JButton("*"));
            }
        }
        panel2.add(new JButton("C"));
        panel2.add(new JButton("0"));
        panel2.add(new JButton("/"));                
        panel2.add(new JButton("="));
        Container cp = getContentPane();
        cp.add(panel1,BorderLayout.NORTH);
        cp.add(panel2, BorderLayout.CENTER);
    }
    
    
    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.setVisible(true);
        
        //p.setSize(100,300);
        //p.setVisible(true);
       // f.add(p);
        //JTextField numaros = new JTextField(20);
        //numaros.setSize(50,150);
        //numaros.setVisible(true);
        //p.add(numaros);
    }
    
}
