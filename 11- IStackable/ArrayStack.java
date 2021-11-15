import java.util.*;  

public class ArrayStack implements IStackable{
    ArrayList<Integer> arraylist;
    public ArrayStack(){
        this.arraylist = new ArrayList<Integer>();
    }

    public int size(){
        //retorna a qtd de elementos
        //size
        return arraylist.size(); 

    }
    public void push(int v){
        //insere um inteiro
        //add
        arraylist.add(v);

    }
    public int pop(){
        //retira um inteiro
        //remove
        return arraylist.remove(arraylist.size()-1);//n-1
    }

}