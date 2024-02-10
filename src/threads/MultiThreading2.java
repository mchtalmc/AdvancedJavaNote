package threads;

public class MultiThreading2 {

    public volatile static int counter=0;

    public static void main(String[] args) {

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" çalışmaya başladı.");
                Counter.count();//1000
                System.out.println("burada başka kodlar var.");
            }
        });
        thread1.setName("Tom");
        thread1.start();


        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                //  thread1.join();---tüm işlemlerin bitmesini beklemeye gerek yok. Sirali olarak calisacak o yuzden
                //Thread 1'in bitmesini bekleyecektir zaten.
                System.out.println(Thread.currentThread().getName()+" çalışmaya başladı.");
                Counter.count();
                System.out.println("burada ortak dataya erişmeyen kodlar var.");
            }
        });
        thread2.setName("Jerry");
        thread2.start();

    }
}
class Counter{

    //Synchronized kullanarak bir blok veya metot tanımladığınızda,
    // Java bu bloğa yalnızca bir iş parçacığının aynı anda erişmesine izin verir.
    // Bu, diğer iş parçacıklarının aynı kaynağa erişmesini engeller ve böylece verinin tutarlılığını korur.
    public synchronized static void count(){
        for (int i=1;i<=1000;i++){
            MultiThreading2.counter++;
            System.out.println(Thread.currentThread().getName()+"--Counter : "+  MultiThreading2.counter);//beklenen değer 1000+1000=2000
        }
    }

}


