public class Main {
    public static void main(String[] args) {
        Phone samsung = new SamsungPhone("Galaxy S23 Plus", 9993453456L, 300);
        Phone xiaomi = new XiaomiPhone("Not 30Pro", 799456756123L, 239);
        Phone apple = new ApplePhone("iPhone 15 Ultra", 109945645567L, 345);

        samsung.receiveCall();
        samsung.info();

        xiaomi.receiveCall();
        xiaomi.info();

        apple.receiveCall();
        apple.info();
    }
