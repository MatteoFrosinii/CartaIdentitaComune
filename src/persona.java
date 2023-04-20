public class persona extends Thread{
    private sportello Sportello;

    public persona (String nome, sportello sportello){
        super(nome);
        this.Sportello = sportello;
    }

    @Override
    public void run() {
        long tempoDiCompilazione = (int) (Math.random() * 5000) + 1;
        Sportello.compilaCarta();
        try {
            Thread.sleep(tempoDiCompilazione);    
        } catch (InterruptedException e) {}
        Sportello.richiediCarta();
    }
}
