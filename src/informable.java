public interface informable {
    default void info() {
        System.out.println(getText());
    }
    String getText();
}
