//Binsearch;
//Seqsearch;
public class Main {
    public static void main(String[] args) {
        System.out.println("Размер массива(N) | Практическая сложность последовательного поиска | Прак слож двоичного поиска");
        for(int i = 50; i <= 5000; i += 50){
            ArrayListBin listBin = new ArrayListBin(i);
            ArrayListSeq listSeq = new ArrayListSeq(i);
            System.out.printf("%5s|", i);
            listSeq.print();
            System.out.print("|");
            listBin.print();

        }

    }
}