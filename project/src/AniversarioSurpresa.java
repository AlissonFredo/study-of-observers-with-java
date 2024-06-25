public class AniversarioSurpresa {
    public static void main(String[] args) throws Exception {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.addChegadaAniversarianteObserver(namorada);

        porteiro.start();
    }
}
