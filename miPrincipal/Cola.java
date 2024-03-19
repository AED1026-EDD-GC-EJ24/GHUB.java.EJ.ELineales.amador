package miPrincipal;

public class Cola<T>{
private Nodo<T> cabeza;
private Nodo<T> cola; 
private int tamano;

public Cola(){
  cabeza= null;
  cola= null;
  tamano=0;
}
public int getTamano{
  return tamano;
}
public boolean esVacio(){
  return (cabeza==null);
}

public void encolar(T valor){
  Nodo<T> nuevo=new Nodo<T>();
  nuevo.setValor(valor);
  if(esVacio()){
    cabeza=nuevo;
    cola=nuevo;
  }else{
    cola.setSiguente(nuevo);
    cola=nuevo;
  }
  tamano++;
}
public void desencolar(){
if(!esVacio()){
  if(cabeza==cola){
    cabeza=null;
    cola=null;
  }else{
    cabeza=cabeza.getSiguente();
  }
  tamano--;
}
}
public T frente(){
  if(!esVacio()){
    return cabeza.getValor();
  }else{
    return null;
  }
}  
}
