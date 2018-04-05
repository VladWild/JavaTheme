package com.java.aaaaaabbbbbbbbbbdddddddddddeeeeeeee;

import com.badlogic.gdx.math.GridPoint2;
import com.vladwild.chest.with.gems.gameplay.Direction;
import com.vladwild.chest.with.gems.gameplay.StaticObjectField;
import com.vladwild.chest.with.gems.methods.tasks.Function;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Chest extends Labyrinth {
    private Set<GridPoint2> chestSet = new HashSet<>();

    public Chest(StaticObjectField field) {
        super(field);
        chestSet.add(chest);
    }

    @Override
    public void save(List<?> list) {
        List<Direction> directions = new ArrayList<>((List<Direction>) list);

        human = new GridPoint2(START_HUMAN);        //присваиваем стартовые координаты человека

        directions.forEach(direction -> {
            walk(direction);
            if (human.equals(chestSet)) ways.add(directions);
        });
    }
}
