package miPrincipal;
public class Pila<T>{
private Nodo<T> cabeza;
private int tamano;

public Pila(){
  cabeza =null;
  tamano=0;
}
  public int getTamano(){
    return tamano;
  }
  public boolean esVacio(){
    return (cabeza==null);
  }
  public void apilar(T valor){
  Nodo<T> nuevo=new Nodo<T>();
    nuevo.setValor(valor);
    if(esVacio()){
      cabeza=nuevo;
    }
    else{
      nuevo.setSiguente(cabeza);
      cabeza=nuevo;
    }
    
  }

  
}
