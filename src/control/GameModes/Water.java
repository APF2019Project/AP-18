package control.GameModes;

import control.BattleClasses.Map;
import model.PlayerTypes.Player;

import java.io.IOException;
import java.util.Scanner;

public class Water extends GameMode {


    @Override
    protected boolean allowsCommand(String command) {
        return false;
    }

    @Override
    public void handleCommand(String command, Scanner scanner) throws IOException {

    }

    @Override
    public void handleWin() {
        
    }

    @Override
    public void preProcess() {

    }

    public Water(Player planter, Player zombieLeader, Map map){
        super(planter, zombieLeader, map);
    }
}
