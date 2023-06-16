package mvc;

import java.util.ArrayList;
import java.util.List;

class DigimonComposite implements DigimonComponent {
    private List<DigimonComponent> digimons = new ArrayList<>();

    public void addDigimon(DigimonComponent digimon) {
        digimons.add(digimon);
    }

    @Override
    public void showDetails() {
        for (DigimonComponent digimon : digimons) {
            digimon.showDetails();
        }
    }
}

