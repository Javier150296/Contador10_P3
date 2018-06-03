/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author JavierLeon
 */
public class Principal extends JFrame{
    private JButton btnComenzar;
    private JButton btnReiniciar;
    private JButton btnSalir;
    private PanelNumeros pnlNumbers;
    
    public Principal() throws HeadlessException {
        super();
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        super.setSize(500, 500);
        
        btnComenzar = new JButton("Comenzar");
        btnComenzar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        btnSalir =  new JButton("Salir");
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        JPanel pnlBtns = new JPanel();
        pnlBtns.add(btnComenzar);
        pnlBtns.add(btnReiniciar);
        pnlBtns.add(btnSalir);
        
        super.add(pnlBtns,BorderLayout.SOUTH);
        super.setVisible(true);
    }
    
}
