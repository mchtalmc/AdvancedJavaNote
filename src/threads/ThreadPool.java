package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Threadler oldukça maliyetli yapılardır.
CPU, memoryde kaynak ayrılır.
Bu sebeple aynı anda aktif olarak kullanmak istediğimiz threadlerin sayısını sınırlandırabiliriz.
Thread havuzu maliyeti azaltır, CPU ya aşırı yüklenmeyi önler.
Yeni bir thread oluşturmak yerine belirtilen sayıdaki threadin bir kere başlatılarak
tekrar tekrar kullanılmasını sağlar.
*/
public class ThreadPool {

    public static void main(String[] args) {

        ExecutorService service =Executors.newFixedThreadPool(3);
        //Executors.newFixedThreadPool(3) çağrısı, 3 adet sabit boyutlu bir thread havuzu (thread pool) oluşturur.
        // Thread havuzları, belirli bir sayıda iş parçacığını (thread) yönetir ve bu iş parçacıklarını kullanarak görevleri gerçekleştirir.
        // Sabit boyutlu bir thread havuzu, belirli bir sayıda iş parçacığı oluşturur ve bu sayıyı aşmayan görevleri sırayla işler.

        ThreadCreator thread1=new ThreadCreator("A");
        ThreadCreator thread2=new ThreadCreator("B");
        ThreadCreator thread3=new ThreadCreator("C");
        ThreadCreator thread4=new ThreadCreator("D");
        ThreadCreator thread5=new ThreadCreator("E");
        ThreadCreator thread6=new ThreadCreator("F");
        //threadleri başlatma
//        thread1.start();--Thread-0
//        thread2.start();--Thread-1
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();

        service.execute(thread1);
        service.execute(thread2);
        service.execute(thread3);
        service.execute(thread4);
        service.execute(thread5);
        service.execute(thread6);
        //Bu çağrı, ExecutorService tarafından yönetilen thread havuzundaki bir iş parçacığına thread1'i yürütmesi için verir.
        // Eğer boş bir iş parçacığı varsa, thread1 hemen çalıştırılır.
        // Aksi halde, thread1 işlem sırasını bekler ve bir iş parçacığı boşaldığında çalıştırılır.

        service.shutdown();
        //Thread havuzunun kapatılması, ExecutorService tarafından kabul edilen yeni görevlerin alınmasını durdurur
        // ve var olan görevlerin tamamlanmasını bekler. Ancak, bekleyen görevler hala tamamlanacaktır.
        // ****Kapatma işlemi tamamlandıktan sonra, thread havuzu tamamen durdurulur ve artık kullanılamaz hale gelir.

    }


}
class ThreadCreator extends Thread{

    private String name;

    public ThreadCreator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        System.out.println(threadName+" çalışmaya başladı.");
        System.out.println(threadName+" "+name+" işi yapıyor.");
        //thread bir süre çalışıyor.
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName+" işini bitirdi.");

    }
}
