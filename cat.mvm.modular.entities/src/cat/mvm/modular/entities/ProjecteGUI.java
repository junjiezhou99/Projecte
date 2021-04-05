package cat.mvm.modular.entities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ProjecteGUI extends JFrame { //Atributos, total 6 JLabel, 6 JTextField y un JButton

    private JLabel jlbCodi;
    private JLabel jlbName;
    private JLabel jlbFamily;
    private JLabel jlbType;
    private JLabel jlbPrice;
    private JLabel jlbAmount;
    private JTextField jtfCodi;
    private JTextField jtfName;
    //private JTextField jtfFamily;
    private JComboBox jtfFamily;
    private JTextField jtfType;
    private JTextField jtfPrice;
    private JTextField jtfAmount;
    private JButton jbtCalcul;

    public ProjecteGUI() { //Configuración básica de la ventana GUI------------------------------
        this.setSize(500, 500); //Mida de la ventana
        this.setResizable(false); //Quitar la opcion de modificar el size de la ventana
        this.setTitle("Projecte"); //Título de la ventana
        this.setVisible(true); //Visibilidad on
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar el programa al cerrar la app

        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize(); //Coger la dimension de la pantalla
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        this.setSize(screenWidth/2, screenHeight/2);
        this.setLocation(screenWidth/4, screenHeight/4);
        initComponents(); //Método que contiene el diseño de la interfaz gráfica
    }

    private void initComponents(){ //Método que contiene el diseño de la interfaz gráfica
        jlbCodi = new JLabel();
        jlbName = new JLabel();
        jlbFamily = new JLabel();
        jlbType = new JLabel();
        jlbPrice = new JLabel();
        jlbAmount = new JLabel();
        jtfCodi = new JTextField();
        jtfName = new JTextField();
        //jtfFamily = new JTextField();
        jtfFamily = new JComboBox();
        jtfType = new JTextField();
        jtfPrice = new JTextField();
        jtfAmount = new JTextField();
        jbtCalcul = new JButton();

        getContentPane().setLayout(null);

        jlbCodi.setText("Codi: "); //-----------------------------Codi (0-999)---------------------------
        getContentPane().add(jlbCodi);
        jlbCodi.setBounds(22,30,116,14);

        jtfCodi.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfCodi);
        jtfCodi.setBounds(100,30,130,20);
        jtfCodi.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfDadafocusGained(e);
            }
        });

        jlbName.setText("Nom: "); //------------------------------Nom (String)----------------------------
        getContentPane().add(jlbName);
        jlbName.setBounds(22,70,116,14);

        jtfName.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfName);
        jtfName.setBounds(100,70,130,20);
        jtfName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfDadafocusGained(e);
            }
        });

        jlbFamily.setText("Familia: "); //------------------------Familia (1,2,3)--------------------------
        getContentPane().add(jlbFamily);
        jlbFamily.setBounds(22,110,116,14);

        //jtfFamily.setHorizontalAlignment(JTextField.RIGHT);
        jtfFamily.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Cosmetica", "Perfumeria", "Maquillatge"}));
        getContentPane().add(jtfFamily);
        jtfFamily.setBounds(100,110,130,20);

        jlbType.setText("Tipus: "); //-----------------------------Tipus (String)---------------------------
        getContentPane().add(jlbType);
        jlbType.setBounds(22,150,116,14);

        jtfType.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfType);
        jtfType.setBounds(100,150,130,20);
        jtfType.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfDadafocusGained(e);
            }
        });

        jlbPrice.setText("Preu: "); //------------------------------Preu (decimal)---------------------------
        getContentPane().add(jlbPrice);
        jlbPrice.setBounds(22,190,116,14);

        jtfPrice.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfPrice);
        jtfPrice.setBounds(100,190,130,20);
        jtfPrice.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfDadafocusGained(e);
            }
        });

        jlbAmount.setText("Quantitat: "); //------------------------Quantitat (0=<X)--------------------------
        getContentPane().add(jlbAmount);
        jlbAmount.setBounds(22,230,116,14);

        jtfAmount.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfAmount);
        jtfAmount.setBounds(100,230,130,20);
        jtfAmount.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                jtfDadafocusGained(e);
            }
        });

        jbtCalcul.setText("Test"); //--------------------------------Botó--------------------------------------
        getContentPane().add(jbtCalcul);
        jbtCalcul.setBounds(160,270,70,20);
        jbtCalcul.addActionListener(e -> jbtCalculActionPerformed(e));
    }

    private void jtfDadafocusGained(FocusEvent evt){ //Método que selecciona todos los datos de la casilla
        JTextField objEnfocado = (JTextField)evt.getSource();
        objEnfocado.selectAll();
    }

    private void jbtCalculActionPerformed(ActionEvent evt){ //Método del botón

    }
}
