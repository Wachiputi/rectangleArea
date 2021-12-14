class AreaRect{
    double length =1;
    double breadth = 1;

    AreaRect(){

    }
    public double getReturnArea(){
        double ar = length * breadth;
        return ar;
    }public void  setLength(double newLength){
        length = newLength;
    } public void setBreadth(double newBreadth){
        breadth = newBreadth;
    }
}