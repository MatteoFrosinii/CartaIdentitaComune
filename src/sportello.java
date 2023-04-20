public class sportello {
    private boolean stampanteOccupata = false;

    public boolean IsStampanteOccupato(){
        return this.stampanteOccupata;
    }

    public synchronized void compilaCarta(){
        System.out.println(Thread.currentThread().getName() + " ha preso il modulo");
    }

    public synchronized void richiediCarta(){
        try {   
            while(stampanteOccupata){
                wait();
            }
            stampanteOccupata = true;
            try {
                Thread.sleep(3000);    
            } catch (Exception e) {}
            System.out.println(Thread.currentThread().getName() + " ha ottenuto la sua carta di identità nuova!!!");
            stampanteOccupata = false;
            notifyAll(); 
        } catch (InterruptedException e) {}
    }
}
