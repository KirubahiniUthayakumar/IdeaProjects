class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("square")) {
            return new Square(4); // Assuming a side length of 4
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle(4); // Assuming a radius of 4
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle(5); // Assuming a base of 5
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle(7, 4); // Assuming a width of 7 and height of 4
        } else {
            return null;
        }
    }
}
