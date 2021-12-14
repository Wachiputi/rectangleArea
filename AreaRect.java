class AreaRect{
    //variable declaration
    double length =1;
    double breadth = 1;
//constructor
    AreaRect(){

    }//getter and setter methods
    public double getReturnArea(){
        double ar = length * breadth;
        return ar;
    }public void  setLength(double newLength){
        length = newLength;
    } public void setBreadth(double newBreadth){
        breadth = newBreadth;
    }
}