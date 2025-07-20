package Stack;

public class ArrayListByUsingArray {
    private int[] data;
    private int size;
    private int capacity;

    public ArrayListByUsingArray(){
        data=new int[capacity];
        capacity=10;
        size=0;
    }
    public void add(int num){
        ensureCapacity();
        data[size]=num;
        size++;
    }
    public int get(int index){
        if (index<0 || index>=size){
            throw new ArrayIndexOutOfBoundsException("Index is more than size");
        }
        return data[index];
    }
    public int size(){
        return size;
    }
    public void ensureCapacity(){
        if(size==capacity){
            capacity=capacity*2;
        }
        int[] newData=new int[capacity];
        for (int i = 0; i < size; i++) {
            newData[i]=data[i];
        }
        data=newData;
    }
    public void printList(){
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayListByUsingArray
                list = new ArrayListByUsingArray();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));

        System.out.print("All elements: ");
        list.printList();
    }
}
