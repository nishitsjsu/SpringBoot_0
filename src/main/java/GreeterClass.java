public class GreeterClass implements  Greeter{
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGreeting() {
        return name;
    }
}
