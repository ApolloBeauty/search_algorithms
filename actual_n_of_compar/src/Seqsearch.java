import java.util.Random;

class ArrayListSeq {

    private int[] list;
    private int capacity = 0;
    private int compare = 1;
    private int serchElement = 0;

    public ArrayListSeq(int capa) {
        Random r = new Random();
        capacity = capa;
        list = new int[capacity];
        randomArray(capacity);
    }

    public void randomArray(int size) {
        for(int i = 0; i < size; i++) {
            Random rnd = new Random();
            int nr = rnd.nextInt(9999) + 1;
            insert(i, nr);
        }
        Random serR = new Random();
        int s = serR.nextInt(capacity);
        serchElement = list[s];
    }

    public void insert(int index, int element) {
        list[index] = element;
    }

    public void print() {
        search();
        System.out.printf("%5s", compare);
    }

    public void search() {
        for(int i = 0; i < capacity; i++) {
            if(list[i] != serchElement) {
                compare++;
            } else {
                break;
            }
        }
    }
}