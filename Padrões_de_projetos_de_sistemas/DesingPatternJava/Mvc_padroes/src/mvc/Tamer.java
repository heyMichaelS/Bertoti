package mvc;

class Tamer implements Observer {
    private String name;

    public Tamer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
