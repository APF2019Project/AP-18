package control.Accessories;

import model.Zombie;

public class Baloon extends Accessory {
    public Baloon(Zombie zombie) {
        super(zombie);
    }

    @Override
    public Accessory clone(Zombie zombie) {
        return null;
    }
}
