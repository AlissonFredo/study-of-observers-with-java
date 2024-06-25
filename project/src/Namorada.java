public class Namorada implements ChegadaAniversarianteObserver {

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Meu namorado chegou...");
        System.out.println("Rápido apaguem as luzes...");
        System.out.println("Rápido façam silencio...");
        System.out.println("Surpresa!!!");
    }
}
