package miPrincipal;
public class Nodo<T>{
    private T valor;
    Nodo<T> siguente;
    public Nodo(){
        valor=null;
        siguente=null;    
    }
public T getValor(){
    return valor;
}
public void setValor(T valor){
    this.valor=valor;
}
public Nodo<T> getSiguente(){
    return siguente;
}

public void setSiguente(Nodo<T> siguente){
        this.siguente=siguente;
    }
}
