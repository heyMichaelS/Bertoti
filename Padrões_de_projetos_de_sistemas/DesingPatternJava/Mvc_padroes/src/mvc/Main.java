package mvc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 // Composite Pattern Example
        Digimon agumon = new Digimon("Agumon", 5);
        Digimon gabumon = new Digimon("Gabumon", 4);

        DigimonComposite rookieDigimons = new DigimonComposite();
        rookieDigimons.addDigimon(agumon);
        rookieDigimons.addDigimon(gabumon);

        // Facade Pattern Example
        DigiviceFacade digivice = new DigiviceFacade(rookieDigimons);
        digivice.showAllDigimons();

        // Observer Pattern Example
        Tamer tai = new Tamer("Tai");
        Tamer matt = new Tamer("Matt");

        DigiworldSingleton digiworld = DigiworldSingleton.getInstance();
        digiworld.addObserver(tai);
        digiworld.addObserver(matt);

        digiworld.notifyAllObservers("A wild Kuwagamon appeared!");

        // Strategy Pattern Example
        BattleContext battleContext = new BattleContext(new AttackStrategy());
        battleContext.executeStrategy();

        battleContext.setStrategy(new DefendStrategy());
        battleContext.executeStrategy();
    }
		

	

}
