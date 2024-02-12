package threads;
/*
Çok çekirdekli işletim sistemlerinde her çekirdeğin kendi
cache yapısı olur. Sık kullanılan değişken değerlerinin kopyası
cache e alınarak işlem yapılır, aralıklarla main memorydeki değer güncellenir.

Multithreading bir yapıda her thread farklı çekirdeklerde çalışabilir. Oratk bir değişkenin
kullanımı söz konusu olduğunda, değişkenin değeri cachede tutulursa, güncel değerinden diğer threadin
haberi olmayabilir, bu da uygulamamızın sonsuz döngüye girmesine bile sebep olabilir.

VOLATILE: Değişkenin değerinin main memoryde saklanmasını ve okunmasını sağlar, garanti eder.
Threadlerin değişkene erişimini sıraya koymak için yeterli değildir, synchronized kullanılmalıdır.

*/

public class Volatile1 {

    public volatile static int flag=0;//flag değişkeninin değerinin main memoryden okunmasını/yazılmasını garanti ediyoruz.

    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag==0){
                    System.out.println("Threadlerle çalışmak harika:)");
                }
            }
        });
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                flag=1;
                System.out.println("Flag değeri 1 olarak değiştirildi.");
            }
        });
        thread2.start();



    }












}
