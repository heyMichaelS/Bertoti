package mvc;

class DigiworldSingleton extends Digiworld {
    private static DigiworldSingleton instance;

    private DigiworldSingleton() {}

    public static DigiworldSingleton getInstance() {
        if (instance == null) {
            instance = new DigiworldSingleton();
        }
        return instance;
    }
}
