class Decorator{
    public static void main(String args[]) throws Exception{
        Shape circle=new Circle();
        Shape redCircle=new RedShapeDecorator(new Circle());
        Shape rectangle=new Rectangle();
        Shape redRectangle=new RedShapeDecorator(new Rectangle());
        circle.draw();
        System.out.println("Circle with normal border");
        redCircle.draw();
        System.out.println("Circle with Red border");
        rectangle.draw();
        System.out.println("Rectangle with normal border");
        redRectangle.draw();
        System.out.println("Rectangle with red border");
    }
}
interface Shape{
    void draw();
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Shape::Rectangle");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println("Shape::Square");
    }
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Shape::Circle");
    }
}

abstract class ShapeDecorator implements Shape{
    protected Shape decoratorShape;
    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape=decoratorShape;
    }
    public void draw(){
        decoratorShape.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape){
        super(decoratorShape);
    }
    public void draw(){
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }
    private void setRedBorder(Shape decoratorShape){
        System.out.println("Border color:: Red");
    }
}

