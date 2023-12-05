package A1;

public class Pair<x,y> {
    private final x first;
    private final y second;

    public Pair (x first, y second) {
        this.first = first;
        this.second = second;
    }

    public Pair<y,x> flip(){
        return new Pair<y,x>(this.second, this.first);
    }

    public x getFirst() {
        return first;
    }

    public y getSecond() {
        return second;
    }




}
