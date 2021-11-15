import java.util.*;

public class LinkedStack implements IStackable{
    LinkedList<Integer> linkedlist;

    public LinkedStack(){
        this.linkedlist = new LinkedList<Integer>();
    }

    public int size(){
        //retorna a qtd de elementos
        //size
        return linkedlist.size();

    }
    public void push(int v){
        //insere um inteiro
        //addFirt
        linkedlist.addFirst(v);

    }
    public int pop(){
        //retira um inteiro
        //RemoveFirst
        return linkedlist.removeFirst();
    }

}