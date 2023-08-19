import java.util.Scanner;
public class order 

{
  
     //for get name of product
     static Scanner in = new Scanner(System.in);
     //to get number and name and price  of product in the order
     private     static  String nam;
       static int no=0;
     protected   static String[]name_order= new String[100];
     protected static double sum =0;
     static  product orders[]= new product[100];
  

   
    public static void get_order()
    {
        System.out.println("Hello in  Wateen online_ShoppingStore");
        System.out.println("This is our product in our store :");
         System.out.println("Please enter the number of product you want  here  as we have 4 products :");
        no=in.nextInt();
        System.out.println("-----------------------------------------------------------------------------------");
 
        for(int i=0;i<product.n;i++)
        {
          
            System.out.println((i+1)+")- "+product.names[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------");
      
      
        for(int i=0;i<no;i++)
        {
            System.out.println("Please enter the name here :"+(i+1)+"-");
             nam= in.next();
             name_order[i]=nam;
           
          
          

        }
      
    }
    public static double get_sum()
    {
        for( int i=0;i<no;i++)
        {
            for(int j=0;j<product.n;j++)
            {
                if(name_order[i].equalsIgnoreCase(orders[j].get_name()))
                {
                
                    sum =sum+(orders[j].get_price());
              
                }
            }
        }
        return sum;
    }


    //searchfunction for helping in searching product by name 
    private   static boolean searchproduct( )
{
    System.out.println(" \n Hello in Search product by name service ");
    System.out.println("Please enter the name here :");
    String nam= in.next();
    for(int i=0;i<product.n;i++)
    {
        if(product.names[i].equals(nam))
        {
            System.out.println("Yes this product is found and it's data:\n");
            System.out.println("Product info: \n"+"1-"+orders[i].get_name()+"\n"+"2-"+ orders[i].get_dis()+"\n"+"3-"+orders[i].get_price());
            return true;
        }

        
    }
    return false;

}
 //searchfunction for finding product by name 
public  static void search_product( )
{
    if( order.searchproduct())
    {
     System.out.println(" You are welcome!");
    }
    else
    {
     NOTFOUND e= new NOTFOUND(" this product isnot Found ");
     throw e;
   
     
    
    }



}

}