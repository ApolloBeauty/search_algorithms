import java.util.Random;
class ArrayList {

    private Object[] list;
    private int capacity = 0;
    private int compare = 1;
    private int serchElement = 0;

    public ArrayList() {
        Random r = new Random();
        capacity = r.nextInt(20);
        list = new Object[capacity];
        randomArray(capacity);
    }

    public void randomArray(int size) {
        for(int i = 0; i < size; i++) {
            Random rnd = new Random();
            int nr = rnd.nextInt(100);
            insert(i, nr);
        }
        Random serR = new Random();
        int s = serR.nextInt(capacity);
        serchElement = (int) list[s];
    }

    public void insert(int index, Object element) {
        list[index] = element;
    }

    public void print() {
        System.out.print("Элементы списка:");
        for(int i = 0; i < capacity; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public void search() {
        System.out.println("| Элемент массива: " + serchElement);
        for(int i = 0; i < capacity; i++) {
            if((int) list[i] != serchElement) {
                compare++;
            } else {
                System.out.println("Кол-во сравнений: " + compare);
                break;
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.print();
        list.search();
    }
}