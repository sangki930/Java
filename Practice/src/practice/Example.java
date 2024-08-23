package practice;

public class Example {
    private volatile static Example instance;
    private Example() {

    }

    Example(Example example) {
        this.instance = example;
    }
}
