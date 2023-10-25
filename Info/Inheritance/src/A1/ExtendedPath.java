package A1;

public class ExtendedPath extends BasicPath{
    public double lenght(){
        double ydist = 0.0;
        double xdist = 0.0;
        for (Point p:this.points)
        {
            ydist += p.getY();
            xdist += p.getX();
        }
        return Math.sqrt(Math.pow(ydist, 2) + Math.pow(xdist, 2));
    }
}
