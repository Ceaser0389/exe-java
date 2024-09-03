public class InterruptoresLampadas {

    public static void main(String[] args) {

        boolean lampada1 = false;
        boolean lampada2 = false;
        boolean lampada3 = false;

        lampada1 = true;
        esperar(5000);

        lampada1 = false;
        lampada2 = true;

        verificarLampadas(lampada1, lampada2, lampada3);

    }

    public static void verificarLampadas(boolean lampada1, boolean lampada2, boolean lampada3) {
        System.out.println("Verificando as lâmpadas...");

        if (lampada2) {
            System.out.println("Lâmpada 2 está acesa. Ela é controlada pelo segundo interruptor.");
        }
        if (!lampada1 && !lampada2 && !lampada3) {
            System.out.println("Todas as lâmpadas estão apagadas.");
        }
        System.out.println("Lâmpada 1 está quente. Ela é controlada pelo primeiro interruptor.");
        System.out.println("Lâmpada 3 está fria. Ela é controlada pelo terceiro interruptor.");
    }
    public static void esperar(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            System.out.println("Erro ao esperar: " + e.getMessage());
        }
    }
}
