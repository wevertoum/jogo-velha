package br.ufg.inf.jogoVelha;

import br.ufg.inf.jogoVelha.mainPainel.ui.controller.MainPanelController;

public class Runner {

    private static StuffPrinter o = new StuffPrinter("o", 100000000);
    private static StuffPrinter p = new StuffPrinter(".", 100000000);
    private static StuffPrinter x = new StuffPrinter("x", 100000000);
    private static int count = 0;

    private synchronized static void incrementCount() {
        if (count % 93 == 1 && count != 0) {
            System.out.println();
        }
        count++;
    }

    public static void main(String[] args) {
        new MainPanelController().showMainPainel();
    }

    private static class StuffPrinter extends Thread {
        private final String STUFF;
        private final int LIMIT;

        private StuffPrinter(final String STUFF, final int LIMIT) {
            this.STUFF = STUFF;
            this.LIMIT = LIMIT;
        }

        @Override
        public void run() {
            for (int i = 0; i < LIMIT; i++) {
                System.out.print(this.STUFF);
                incrementCount();
            }
        }

    }

}
