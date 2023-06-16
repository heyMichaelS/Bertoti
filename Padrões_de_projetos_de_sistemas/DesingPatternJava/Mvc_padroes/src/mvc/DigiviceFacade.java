package mvc;

class DigiviceFacade {
    private DigimonComposite digimons;

    public DigiviceFacade(DigimonComposite digimons) {
        this.digimons = digimons;
    }

    public void showAllDigimons() {
        digimons.showDetails();
    }
}
