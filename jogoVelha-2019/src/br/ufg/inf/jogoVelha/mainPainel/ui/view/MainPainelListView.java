package br.ufg.inf.jogoVelha.mainPainel.ui.view;

import javax.swing.*;
import java.util.ArrayList;

public class MainPainelListView extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 560;

    private JPanel mainPanel;
    private JLabel mainLabel;
    private JButton btnJDV;

    public MainPainelListView() {
        setSize(WIDTH, HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
    }

    public JButton getBtnJDV() {
        return btnJDV;
    }


    public JLabel getMainLabel() {
        return mainLabel;
    }

}
