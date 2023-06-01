package patterns.creational.prototype;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor
public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle(Rectangle target) {
        super(target);

        if (target != null) {

            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
