package instance;
public class Main {

    public static void main(String[] args) {

        // 複数のインスタンスを生成
        InstanceSample sato1 = new InstanceSample("優輝");
        InstanceSample sato2 = new InstanceSample("志希");
        InstanceSample sato3 = new InstanceSample("優輝");

        System.out.println("--- incrementId() ---");
        System.out.println("sato1:");
        sato1.incrementId();
        System.out.println("sato2:");
        sato2.incrementId();
        System.out.println("sato3:");
        sato3.incrementId();
    }
}