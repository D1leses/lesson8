abstract class Phone implements Callable, informable{
    private String model;
    private long number;
    private int weight;
    public Phone(String model, long number, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public String getModel() {
        return model;
    }
    public long getNumber() {
        return number;
    }
    public int getWeight() {
        return weight;
    }
    public String getText(){
        return"Модель телефона: " + model + "\tНомер: " + number + "\tВес: " + weight;
    }
}