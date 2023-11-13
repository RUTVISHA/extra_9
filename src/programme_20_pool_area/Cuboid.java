package programme_20_pool_area;

import java.awt.*;

public class Cuboid extends Rectangle {
    double height;
    public Cuboid (double width ,double length,double height){
        super();
        this.height=height;
        if(this.height<0){
            this.height=0;
        }
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return (getArea() * getHeight());


    }
}
