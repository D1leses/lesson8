class ApplePhone extends Phone {
    public ApplePhone(String model, long number, int weight) {
        super(model, number, weight);
    }
    @Override
    public void receiveCall() {
        System.out.println("Вам звонит: Антон");
    }
}
