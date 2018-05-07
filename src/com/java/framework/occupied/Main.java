package com.java.framework.occupied;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    private static Cell[][] field = {
            { new Cell(0, 0), null, new Cell(2, 0), new Cell(3, 0), null, null,
                    null, new Cell(7, 0), new Cell(8, 0), null,
                    new Cell(10, 0) },
            { new Cell(0, 1), new Cell(1, 1), null, new Cell(3, 1), null,
                    new Cell(5, 1), new Cell(6, 1), new Cell(7, 1),
                    new Cell(8, 1), null, new Cell(10, 1) },
            { new Cell(0, 2), new Cell(1, 2), null, null, new Cell(4, 2),
                    new Cell(5, 2), new Cell(6, 2), null, null, new Cell(9, 2),
                    null },
            { new Cell(0, 3), new Cell(1, 3), null, new Cell(3, 3),
                    new Cell(4, 3), null, new Cell(6, 3), new Cell(7, 3),
                    new Cell(8, 3), null, null },
            { null, new Cell(1, 4), null, null, null, null, new Cell(6, 4),
                    null, new Cell(8, 4), null, new Cell(10, 4) },
            { new Cell(0, 5), null, null, null, new Cell(4, 5), new Cell(5, 5),
                    null, null, new Cell(8, 5), new Cell(9, 5),
                    new Cell(10, 5) },
            { new Cell(0, 6), null, null, null, new Cell(4, 6), new Cell(5, 6),
                    new Cell(6, 6), null, new Cell(8, 6), null,
                    new Cell(10, 6) },
            { null, null, null, null, null, null, null, new Cell(7, 7),
                    new Cell(8, 7), null, new Cell(10, 7) },
            { new Cell(0, 8), new Cell(1, 8), null, new Cell(3, 8), null, null,
                    null, null, new Cell(8, 8), null, null },
            { null, new Cell(1, 9), new Cell(2, 9), new Cell(3, 9),
                    new Cell(4, 9), new Cell(5, 9), null, new Cell(7, 9), null,
                    new Cell(9, 9), new Cell(10, 9) },
            { null, new Cell(1, 10), null, null, new Cell(4, 10),
                    new Cell(5, 10), null, new Cell(7, 10), null, null,
                    new Cell(10, 10) } };

    public static void main(String[] args) {
        List<Cell> allCells = new ArrayList<>();

        Arrays.asList(field)
                .forEach(line -> allCells.addAll(Arrays.asList(line)));

        System.out.println(allCells.stream().filter(Objects::nonNull).collect(Collectors.toSet()));

        System.out.println("----------------------------------------------------------------------------");

        System.out.println(Arrays.stream(field)
                .flatMap(line -> Arrays.asList(line)
                        .stream()
                        .filter(Objects::nonNull))
                .collect(Collectors.toSet()));
    }
}

class Cell {

    private int x;
    private int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Cell cell = (Cell) o;

        if (x != cell.x)
            return false;
        return y == cell.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "new Cell(" + "" + x + ", " + y + ')';
    }
}
