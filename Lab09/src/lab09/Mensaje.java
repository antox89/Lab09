

package lab09;


public class Mensaje {
    
    private String fuente, destino, texto;
    private boolean cifrado;

    public Mensaje() {
    }

    public Mensaje(String fuente, String destino, boolean cifrado, String texto) {
        this.fuente = fuente;
        this.destino = destino;
        this.cifrado = cifrado;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCifrado() {
        return cifrado;
    }

    public void setCifrado(boolean cifrado) {
        this.cifrado = cifrado;
    }
    
    

    @Override
    public String toString() {
        return texto;
    }
    
    

}
