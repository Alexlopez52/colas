public class QueueImpl<E> implements Queue<E> {

    public E[] datos;
    public int position=0;
    public int size;
    public QueueImpl(int l ) {
        this.size=l;
           datos= (E[]) new Object[size];
    }

    public void push (E e) throws ColaLlenaException
    {
        if(position<size) {
            datos[position] = e;
            this.position++;
        }
        else throw new ColaLlenaException();
    }
    public E pop() throws ColaVaciaException {
        if(position>0) {

            E cosa=datos[0];
            for (int i =0;i<position;i++)
            {
                datos[i]=datos[i+1];

            }
            datos[position]=null;
            position--;
            return cosa;
        }
        else throw new ColaVaciaException();
    }
    public  int size(){

        return position;
    }


}