//Problem - 1, on Rectangle
public class Rectangle1 {
private float length, width;
public Rectangle1() {
length = 1.0f;
width = 1.0f;
}
public Rectangle1(float length, float width) {
this.length = length;
this.width = width;
}
public float getLength() {
return length;
}
public void setLength(float length) {
this.length = length;
}
public float getWidth() {
return width;
}
public void setWidth(float width) {
this.width = width;
}
public float getArea() {
return (width * length);
}
public float getPerimeter() {
return 2 * (length + width);
}
public String toString() {
return "Rectangle[length = " + length + ",width = " + width + "]";
}
}