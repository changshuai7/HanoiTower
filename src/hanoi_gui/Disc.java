package hanoi_gui;

import javax.swing.*;
import java.awt.*;

public class Disc extends JButton {
    private static final long serialVersionUID = 1L;

    int number;
    TowerPoint point;

    Disc() {
        setBackground(Color.cyan);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TowerPoint getPoint() {
        return point;
    }

    public void setPoint(TowerPoint point) {
        this.point = point;
    }

}
