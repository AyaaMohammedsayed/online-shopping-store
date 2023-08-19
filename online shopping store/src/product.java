
public class product {

    //dataitems of product
 private String name, discription;
 private double price;
 //for helping searching product 
 public  static int n=0;
 protected  static String[]names= new String[100];
 //constructor for intialize 
 public product(String name, String dis,double price)
 {
    this.name=name;
    this.price=price;
    this.discription=dis;
    names[n]=name;
    n++;
 }
 public String get_name()
 {
    return this.name;
 }
 public String get_dis()
 {
   return this.discription;
 }
 public double get_price()
 {
    return this.price;
 }
 public String toString()
{
    return("This is the data of product:\n"+"-The name is : "+this.get_name()+
    "\n-The Discription: "+this.get_dis()+"\nThe price is : "+this.get_price());
}




}
