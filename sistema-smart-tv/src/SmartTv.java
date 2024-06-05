public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 28;


    public void aumentarcanal(){
        canal++;
    }
    public void diminuircanal(){
        canal--;
    }

    public void mudarcanal(int novoCanal){
        canal=novoCanal;
    }

    public void aumentar(){
        volume++;
    }
    public void diminuir(){
        volume--;
    }

    public void ligar (){
        ligada=true;
    }
    public void desligar (){
        ligada=false;
    }


}
