package mvc;

class Digimon implements DigimonComponent {
    private String name;
    private int level;

    public Digimon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void showDetails() {
        System.out.println(name + " at level " + level);
    }
}

