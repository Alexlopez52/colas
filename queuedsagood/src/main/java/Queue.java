public interface Queue<E> {
    void push(E e) throws ColaLlenaException; //anuncia que esta llena
    E pop() throws ColaVaciaException; // anuncia que esta vacia
    int size();  //anuncia el tamaño?


}
