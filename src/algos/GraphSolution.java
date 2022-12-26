package algos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Поиск кратчайшего пути в двумерном массиве по алгоритму волнового поиска с обходом препятствий (Алгоритм Ли)
 */

public class GraphSolution {
    public static void main(String[] args) {
        State[][] map = new State[][]{
                {State.START, State.WALL, State.EMPTY, State.EMPTY, State.EMPTY},
                {State.EMPTY, State.WALL, State.EMPTY, State.WALL, State.FINISH},
                {State.EMPTY, State.EMPTY, State.EMPTY, State.WALL, State.EMPTY},
                {State.EMPTY, State.WALL, State.EMPTY, State.WALL, State.EMPTY},
                {State.EMPTY, State.WALL, State.EMPTY, State.EMPTY, State.EMPTY},
                {State.EMPTY, State.EMPTY, State.EMPTY, State.EMPTY, State.EMPTY}
        };


        System.out.println(solution(map));
    }

    public static int solution(State[][] array) {
        int result = 0;

        final int[][] grid = new int[array.length][array[0].length];
        Queue<Position> queue = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == State.START) {
                    queue.offer(new Position(i, j));
                    grid[i][j] = 0;
                }
            }
        }
        printMap(array);
        boolean hidden = true;

        while (!queue.isEmpty() && hidden) {

            Position current = queue.poll();
            List<Position> neighbours = getNeighbours(current, array.length, array[0].length);

            for (Position neighbour : neighbours) {

                if (array[neighbour.row][neighbour.column] != State.WALL && grid[neighbour.row][neighbour.column] == 0) {
                    if (array[current.row][current.column] != State.START) {
                        array[current.row][current.column] = State.VISITED;
                    }
                    grid[neighbour.row][neighbour.column] = grid[current.row][current.column] + 1;
                    queue.offer(neighbour);
                }

                if (array[neighbour.row][neighbour.column] == State.FINISH) {
                    if (array[current.row][current.column] != State.START && array[current.row][current.column] != State.FINISH) {
                        array[current.row][current.column] = State.VISITED;
                    }
                    result = grid[current.row][current.column] + 1;
                    hidden = false;
                }
            }

        }

        printMap(grid);

        return result;
    }

    private static void printMap(int[][] array) {
        System.out.println("*****************************");

        for (int[] ints : array) {
            System.out.print("* ");

            for (int anInt : ints) {
                System.out.print("  " + anInt + "  ");
            }
            System.out.println(" *");
        }
        System.out.println("*****************************");
    }

    private static void printMap(State[][] array) {
        System.out.println("*****************************");
        for (State[] states : array) {
            System.out.print("* ");
            for (State state : states) {
                String visual;
                switch (state) {
                    case WALL:
                        visual = "|";
                        break;
                    case START:
                        visual = "S";
                        break;
                    case FINISH:
                        visual = "E";
                        break;
                    case ROAD:
                        visual = "#";
                        break;
                    default:
                        visual = " ";
                        break;
                }
                System.out.print("  " + visual + "  ");
            }
            System.out.println(" *");
        }
        System.out.println("*****************************");
    }


    private static List<Position> getNeighbours(Position position, int XSize, int YSize) {
        List<Position> positions = new ArrayList<>();

        Position posLeft = position.getLeftPosition();
        if (posLeft.row >= 0 && posLeft.row < XSize && posLeft.column >= 0 && posLeft.column < YSize)
            positions.add(posLeft);
        Position posRight = position.getRightPosition();
        if (posRight.row >= 0 && posRight.row < XSize && posRight.column >= 0 && posRight.column < YSize)
            positions.add(posRight);
        Position posUp = position.getUpPosition();
        if (posUp.row >= 0 && posUp.row < XSize && posUp.column >= 0 && posUp.column < YSize)
            positions.add(posUp);
        Position posDown = position.getBottomPosition();
        if (posDown.row >= 0 && posDown.row < XSize && posDown.column >= 0 && posDown.column < YSize)
            positions.add(posDown);

        return positions;
    }

    private static class Position {
        public int row;
        public int column;

        public Position(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public Position getLeftPosition() {
            return new Position(row, column - 1);
        }

        public Position getRightPosition() {
            return new Position(row, column + 1);
        }

        public Position getBottomPosition() {
            return new Position(row + 1, column);
        }

        public Position getUpPosition() {
            return new Position(row - 1, column);
        }
    }
}

enum State {
    EMPTY,
    START,
    FINISH,
    WALL,
    VISITED,
    ROAD
}