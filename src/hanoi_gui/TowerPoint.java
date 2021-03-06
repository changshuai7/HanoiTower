package hanoi_gui;

import java.awt.*;

public class TowerPoint {

    int x, y;
    boolean haveDisc;
    Disc disc = null;

    public boolean equals(TowerPoint p) {
        if (p.getX() == this.x && p.getY() == this.getY())
            return true;
        else
            return false;
    }

    public void putDisc(Component com, Container con) {
        disc = (Disc) com;
        con.setLayout(null);
        con.add(disc);
        int w = disc.getBounds().width;
        int h = disc.getBounds().height;
        disc.setBounds(x - w / 2, y - h / 2, w, h);
        haveDisc = true;
        disc.setPoint(this);
        con.validate();
    }

    public Disc getDiscOnPoint() {
        return disc;
    }

    public void removeDisc(Component com, Container con) {
        if (com != null)
            con.remove(com);
        con.validate();
    }

    public TowerPoint(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isHaveDisc() {
        return haveDisc;
    }

    public void setHaveDisc(boolean haveDisc) {
        this.haveDisc = haveDisc;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }

}
