package patterns.creational.prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    @DisplayName("Test circle prototype")
    void test_circle() {
        Circle circleOrigin = new Circle();
        circleOrigin.radius = 15;
        circleOrigin.x = 10;
        circleOrigin.y = 20;
        circleOrigin.color = "red";

        Circle circleCopy = (Circle) circleOrigin.clone();

        assertEquals(circleOrigin.radius, circleCopy.radius);
        assertEquals(circleOrigin.x, circleCopy.x);
        assertEquals(circleOrigin.y, circleCopy.y);
        assertEquals(circleOrigin.color, circleCopy.color);
        assertEquals(circleOrigin, circleCopy);
    }

    @Test
    @DisplayName("Test rectangle prototype")
    void test_rectangle() {
        Rectangle rectangleOrigin = new Rectangle();
        rectangleOrigin.width = 15;
        rectangleOrigin.height = 20;
        rectangleOrigin.x = 10;
        rectangleOrigin.y = 20;
        rectangleOrigin.color = "blue";

        Rectangle rectangleCopy = (Rectangle) rectangleOrigin.clone();

        assertEquals(rectangleOrigin.width, rectangleCopy.width);
        assertEquals(rectangleOrigin.height, rectangleCopy.height);
        assertEquals(rectangleOrigin.x, rectangleCopy.x);
        assertEquals(rectangleOrigin.y, rectangleCopy.y);
        assertEquals(rectangleOrigin.color, rectangleCopy.color);
        assertEquals(rectangleOrigin, rectangleCopy);
    }

}