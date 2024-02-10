package serialization;

import java.io.Serializable;
//User objelerinin serileştirilebilmesi için
//Serializable i implemente ederek bu objeler serileştirilebilir.

// Bu arayüz, nesnelerin bellekteki verilerine doğrudan erişmesini engeller
// ve nesnelerin serileştirilmiş haliyle taşınmasını sağlar.
// Bu sayede, nesnelerin durumunu kaydedebilir ve daha sonra geri yükleyebilirsiniz.
public class User implements Serializable {

    private int id;
    private String name;
    private  int age;

    //parametreli const

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //getter-setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
