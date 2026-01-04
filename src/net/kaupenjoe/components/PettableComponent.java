package net.kaupenjoe.components;

public class PettableComponent implements Component {
    public String pettingAction;
    public PettableComponent(String pettingAction) {
        this.pettingAction = pettingAction;
    }
}
