public class Lista{
    private int list[];
    private int last = -1;
    
    public Lista(int size){
        list = new int[size];
    }
    
    public boolean isEmpty(){
    if(last ==  -1){
        return true;
    }
    else{
        return false;
    }
    
    }
    
    public boolean isFull(){
    if(last ==  list.length -1){
        return true;
    }
    else{
        return false;
    }
    }
    
    public int getSize(){
        return last + 1;
    }
    public int get(int index){
        if(isEmpty()){
            System.out.println("ERRO: LISTA VAZIA!");
        }
        if(index < 0 || index > last){
         System.out.println("ERRO: indice invalido!");
        }
        return list[index];
    }
    
    public boolean insert(int element){
        if(isFull()){
            return false;
        }
        last++;
        list[last] = element;
        return true;
    }
    
    public boolean insert(int element, int pos){
        if(isFull()||pos < 0 || pos > last +1){
            return false;
        }
        for(int i = last + 1; i>pos;i--){
            list[i] = list[i-1];
        }
        last++;
        list[pos] = element;
        return true;
    }
    
    
    public boolean remove(int index){
        
        if(isEmpty()){
        return false;
        }
        
        if(index < 0 || index > last){
            return false;
        }
        
        int numerofElementos = last - index;
        
        if(numerofElementos > 0){
            System.arraycopy(list,index + 1, list, index, numerofElementos);
        }
        
        last--;
        return true;
        }
        
        public void print(){
            for(int i= 0; i <= last; i++){
                System.out.println(list[i]);
            }
        }
    }
    