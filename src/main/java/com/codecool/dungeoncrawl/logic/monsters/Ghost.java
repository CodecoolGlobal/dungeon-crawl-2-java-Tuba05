package com.codecool.dungeoncrawl.logic.monsters;

import com.codecool.dungeoncrawl.logic.Cell;

public class Ghost extends Monster{
    public Ghost(Cell cell) {
        super("Spider", 10, cell);
    }

    @Override
    public String getTileName() {
        return "spider";
    }
}
