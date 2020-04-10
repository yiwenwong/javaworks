package Cuboid;

public class Cuboid extends Rectangle{
    private int height;

    public Cuboid(int length,int width,int height){
        super(length,width);
        this.height=height;
    }

    public int vol(){

        return super.length*super.width*height;
    }
}
