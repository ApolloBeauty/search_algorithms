import java.util.Random;

class ArrayListBin {

    private int[] list;
    private int capacity = 0;
    private int compare = 1;
    private int serchElement = 0;

    public ArrayListBin(int capa) {
        Random r = new Random();
        capacity = capa;
        list = new int[capacity];
        randomArray(capacity);
    }

    public void randomArray(int size) {
        for (int i = 0; i < size; i++) {
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
        sort();
        search();
        System.out.printf("%5s\n", compare);
    }

    public void search() {
        int left = 0, right = capacity - 1;

        while (left <= right) {
            compare++;
            int avg = (left + right) / 2;

            if (serchElement == list[avg]) {
                compare++;
                break;
            }

            if (serchElement < list[avg]) {
                compare++;
                right = avg - 1;
            } else {
                compare++;
                left = avg + 1;
            }

        }
    }

    public void sort() {
        for (int i = 0; i < capacity; i++) {
            for (int j = 0; j < capacity - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
