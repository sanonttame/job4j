package ru.job4j.condition;


public class Point {
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;
    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;
    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
