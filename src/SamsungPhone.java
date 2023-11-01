class SamsungPhone extends Phone {
    public SamsungPhone(String model, long number, int weight) {
        super(model, number, weight);
    }
    @Override public void receiveCall() {
        System.out.println("Вам звонит: Андрей");
    }
}