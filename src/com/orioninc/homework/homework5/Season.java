package com.orioninc.homework.homework5;

public enum Season {
    WINTER(Game.SNOWBALLS_THROWING),
    SPRING(Game.SHIPS_STARTING),
    SUMMER(Game.BERRIES_PICKING),
    AUTUMN(Game.DEPTH_MEASURE);

    Game game;

    Season(Game game) {
        this.game = game;
    }

    Game getGame() {
        return this.game;
    }
}
