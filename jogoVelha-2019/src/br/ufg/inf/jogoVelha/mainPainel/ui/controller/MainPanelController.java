package br.ufg.inf.jogoVelha.mainPainel.ui.controller;

import br.ufg.inf.jogoVelha.jogodavelha.ui.controller.JogoDaVelhaController;
import br.ufg.inf.jogoVelha.mainPainel.ui.view.MainPainelListView;

import javax.swing.*;

public class MainPanelController {

    private MainPainelListView view;
    private JButton btnJDV;
    private JLabel mainLabel;

    public MainPanelController() {
        setActions();
    }

    private void setActions() {
        initComponents();
        initButtons();
        initListeners();
    }

    public void showMainPainel() {
        view.setVisible(true);
    }

    private void initComponents() {
        view = new MainPainelListView();

        mainLabel =     view.getMainLabel();
        btnJDV =        view.getBtnJDV();
    }

    private void initButtons() {
        // TODO: ESTILIZAR OS BOTÕES NA ENTRADA
    }

    private void initListeners() {
        btnJDV.addActionListener(actionEvent -> {
            new JogoDaVelhaController().showJogoDaVelha();
        });
    }

}
