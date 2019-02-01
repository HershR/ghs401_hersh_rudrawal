import javax.swing.JOptionPane; 
public class RightTriangle
    {
    private static int base;
    public static int height;
                            
    public RightTriangle(){ 
        this.base = 0;
        this.height=0;
                }
    public RightTriangle(int base, int height){
        this.base = base;
        this.height=height;
        }
    public static int getBase(){
        int output=base;
        return output;
            }
    public void setBase(int nbase){
        nbase=Integer.parseInt(JOptionPane.showInputDialog("New base: "));
        this.base=nbase;
            
        }
    public static double calcHypotenuse(){
        double hypotenuse;
        hypotenuse = Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
        return hypotenuse;
        }
    public double calcAlpha(){
        double angle = Math.atan((double)height/getBase());
        double deg = ((angle*180)/3.1415);
        return deg;
        }
    public double calcArea(){
        double area = (height*getBase()/2);
        return area;
        }
    public String toString(){
        String output;
        if(base==0 || height ==0){
            output="The base and/or height of this triangle is zero.\nThere are no stats available for this triangle.";
            
        }else{
            output ="The length of the base is: "+getBase()+"\nThe length of the height is: "+ height+"\nThe length of the hypotenuse is: "+calcHypotenuse()+"\nThe angle alpha in degrees is: " +calcAlpha()+"\nThe area of the triangle is: " +calcArea()+" meters squared";
        }
        return output;
    }
}
