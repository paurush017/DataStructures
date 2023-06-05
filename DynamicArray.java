package DynamicArray;

public class DynamicArrayImpl {

    private int data[];
    private int nextIndex;

    public DynamicArrayImpl(){
        data = new int[5];
        nextIndex = 0;
    }

    public int size(){
        return this.nextIndex;
    }

    public void add(int element){
        if(nextIndex >= data.length){
            restructure();
        }
        data[nextIndex] = element;
        nextIndex++;
    }

    private void restructure(){
        int temp[] = data;
        data = new int[data.length*2];
        for (int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
//        int j = 0;
//        for (int a:temp) {
//            data[j]=a;
//            j++;
//        }
    }

    public void setElem(int elem){
        if (nextIndex>data.length){
            return;
        }
        else if (nextIndex<data.length){
            data[nextIndex]=elem;
        }
        else {
            add(elem);
        }
    }

    public int getElem(int index){
        if (index>=nextIndex){
            return -1;
        }
        else {
            return data[index];
        }
    }

    public boolean isEmpty(){
        if (size()==0){
            return true;
        }
        else
            return false;
    }

    public int delete(int index){
        if (index>=nextIndex){
            return -1;
        }

        int temp = data[nextIndex-1];
        data[nextIndex-1]=0;
        nextIndex--;
        return temp;
    }

}
