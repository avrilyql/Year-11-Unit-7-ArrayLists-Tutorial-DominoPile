public class Domino{
    //p
    private int top;
    private int bottom;

    //c
    public Domino();
    public Domino(int top, int bottom) {
        this.top=top;
        this.bottom=bottom;
    }

    //b
    public int getTop(){
        return this.top;
    }

    public int getBottom(){
        return this.bottom;
    }

    public void setTop(int top){
        this.top=top;
    }

    public void setBottom(int bottom){
        this.bottom=bottom;
    }

    public String toString(){
        return top + "/" + bottom;
    }

    public void flip(){
        int bottom = this.bottom();
        this.bottom = this.top;
        this.top = bottom;
    }

    public void settle(){
        if (this.bottom<this.top) {
            flip();
        }
    }

    public int compareTo(Domino other) {
        int thisSmallest;
        int otherSmallest;
        int thisLargest;
        int otherLargest;
        if (this.bottom > this.top) {
            thisSmallest = this.top;
            thisLargest = this.bottom;
        } else {
            thisSmallest = this.bottom;
            thisLargest = this.top;
        }

        if (other.bottom > other.top) {
            otherSmallest = other.top;
            otherLargest = other.bottom;
        } else {
            otherSmallest = other.bottom;
            otherLargest = other.top;
        }

        if (thisSmallest < otherSmallest) {
            return -1;
        } else if (thisSmallest > otherSmallest) {
            1
        } else {
            if (thisLargest < thisSmallest) {
                return -1;
            } else if (thisLargest > thisSmallest) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int compareToWeight(Domino other){
        if (this.top+this.bottom<other.top+other.bottom){
            return -1;
        }

        else if (this.top+this.bottom>other.top+other.bottom){
            return 1;
        }

        else {
            return 0;
        }
    }

    public boolean canConnect(Domino other){
        if (this.top==other.top || this.top==other.bottom || this.bottom==other.top || this.bottom == other.bottom){
            return true;
        }
        return false;
    }
}