package control.GameModes;

import control.BattleClasses.Map;
import control.Menu;
import control.ShowGameResultMenu;
import model.Player;

public abstract class GameModes extends Menu {
    private Player planter;
    private Player zombiesLeader;
    private int turn = 0;
    private Map map;
    private boolean hasEnded = false;

    void generateMap() {

    }

    ;

    void checkState() {

    }

    ;

    void handleWin() {

    }

    ;

    void getHand() {

    }

    ;

    protected GameModes(Player planter, Player zombiesLeader, Map map) {
        super(ShowGameResultMenu.showGameResultMenu);
        this.planter = planter;
        this.zombiesLeader = zombiesLeader;
        this.map = map;
    }
}
