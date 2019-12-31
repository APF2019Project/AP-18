package control.Accessories;

import control.BattleClasses.Map;
import model.Zombie;

public class Bungee extends Accessory {
    public Bungee(Zombie zombie) {
        super(zombie);
    }
    @Override
    public void doAction(Map map) {
        if (zombie.getLocation().getPlant() != null){
            zombie.getLocation().killPlant();
        }
    }
}
