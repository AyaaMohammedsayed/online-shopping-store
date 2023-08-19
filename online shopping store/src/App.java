

public class App {
    public static void main(String[] args) throws Exception {


      //online shopping
     
        product order_s[]= {new product("Phone", " iphone", 500),
        new product("Blouse", " blue blouse", 700),new product("Pens", " red pens", 50), 
        new product("Notes", " 40*80 notes", 90)};

        for (int i=0;i<product.n;i++) {
          
          order.orders[i]=order_s[i];
         
          
        }

      
      order.get_order();
      shoppingcarts.show_order();
    
     //for searching book
       try
     {
     
      order.search_product();
     }
     catch(NOTFOUND e)
     {
      System.out.println(" enter invalid name of product ");
      System.out.println(e);
      order.search_product();
     }
    



     
       
        //to try service of class product
       
         

      System.out.println("Product info: \n"+"1-"+order_s[0].get_name()+"\n"+"2-"+ order_s[0].get_dis()+"\n"+"3-"+order_s[0].get_price());
      System.out.println("-----------------------------------------------------------------------------------");
      System.out.println(order_s[0]);
      System.out.println("-----------------------------------------------------------------------------------");
      


















     
    
    }
}
