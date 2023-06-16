package mvc;

class BattleContext {
    private BattleStrategy strategy;

    public BattleContext(BattleStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(BattleStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}

