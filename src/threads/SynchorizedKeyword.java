package threads;

public class SynchorizedKeyword {
    public static void main(String[] args) {
        Brackets obje1= new Brackets();

        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<=9 ; i++){
                    obje1.generateBrackets();
                    System.out.println("------THREAD1-----");
                }
            }
        });
        t1.start();

        Thread t2= new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Thread 1 Isini bitirdi simdi Thread2 calismaya baslayacaktir.");
                for (int i=0; i<=9 ; i++){

                    obje1.generateBrackets();
                }
            }
        });
        t2.start();
    }






    static class Brackets {
        //synchronized ile metoda ulaşan threadin objeyi monitör(kilitlemek) etmesini sağladık
        //Thread 1 Isini bitirmeden Thread2 calismaya baslamiyor.
        public synchronized void generateBrackets() {
            for (int i = 1; i <= 10; i++) {
                if (i <= 5) {
                    System.out.print("[ ");
                } else {
                    System.out.print("] ");
                }
            }
            System.out.println();

        }
    }
}
