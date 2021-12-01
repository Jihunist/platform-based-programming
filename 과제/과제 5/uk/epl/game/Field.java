package uk.epl.game;

import uk.epl.player.*;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Player> players = new ArrayList<>();

    public void add(Player newPlayer) {
        players.add(newPlayer);
    }

    public void moveUp(int jerseyNumber) {
        for (Player player : players) {
            if (player.getJerseyNumber() == jerseyNumber) {
                player.moveUp();
                break;
            }
        }
    }

    public void moveDown(int jerseyNumber) {
        for (Player player : players) {
            if (player.getJerseyNumber() == jerseyNumber) {
                player.moveDown();
                break;
            }
        }
    }

    public void moveLeft(int jerseyNumber) {
        for (Player player : players) {
            if (player.getJerseyNumber() == jerseyNumber) {
                player.moveLeft();
                break;
            }
        }
    }

    public void moveRight(int jerseyNumber) {
        for (Player player : players) {
            if (player.getJerseyNumber() == jerseyNumber) {
                player.moveRight();
                break;
            }
        }
    }

    public void start() {
        int index = 1;
        for (Player player : players) {
            player.setPosition(34, index*25);
            index += 1;
        }
    }

    public void info() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void stop() {
        return;
    }
}
