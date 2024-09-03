public class EncontreProx {
    public static void main(String[] args) {

        int[] seqA = {1, 3, 5, 7};
        System.out.println("a) Próximo elemento: " + (seqA[seqA.length - 1] + 2));

        int[] seqB = {2, 4, 8, 16, 32, 64};
        System.out.println("b) Próximo elemento: " + (seqB[seqB.length - 1] * 2));

        int[] seqC = {0, 1, 4, 9, 16, 25, 36};
        int nextC = (seqC.length) * (seqC.length);
        System.out.println("c) Próximo elemento: " + nextC);

        int[] seqD = {4, 16, 36, 64};
        int nextD = ((seqD.length + 1) * 2) * ((seqD.length + 1) * 2);
        System.out.println("d) Próximo elemento: " + nextD);

        int[] seqE = {1, 1, 2, 3, 5, 8};
        int nextE = seqE[seqE.length - 1] + seqE[seqE.length - 2]; // Fibonacci
        System.out.println("e) Próximo elemento: " + nextE);

        int[] seqF = {2, 10, 12, 16, 17, 18, 19};
        int nextF = 20; // Próximo número par após 19
        System.out.println("f) Próximo elemento: " + nextF);
    }
}
