import java.io.*;
class point2D{
    int x,y;
    point2D(){
        x=0;
        y=0;
    }
    point2D(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class point3D extends point2D{
    int z;
    point3D(){
        super();
        z=0;
    }
    point3D(int x,int y,int z){
        super(x,y);
        this.z=z;
    }
}
class superDemo4{
    public static void main(String args[]){
        point3D ob=new point3D();
    }
}
