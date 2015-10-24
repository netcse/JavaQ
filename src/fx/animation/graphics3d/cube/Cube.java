package fx.animation.graphics3d.cube;

/**
 * Created by Microsoft on 10/6/2015.
 */


import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;

public class Cube extends Box {

    final Rotate rx = new Rotate(0, Rotate.X_AXIS);
    final Rotate ry = new Rotate(0, Rotate.Y_AXIS);
    final Rotate rz = new Rotate(0, Rotate.Z_AXIS);

    public Cube(double size, Color color) {
        super(size, size, size);
        setMaterial(new PhongMaterial(color));
        getTransforms().addAll(rz, ry, rx);
    }
}