import java.util.Scanner;
public class shoppingcarts  {
    static Scanner it= new Scanner(System.in);
    public static void show_order()
    {
         System.out.println(" here there are the products you bought:");
        for(int i=0;i<order.no;i++)
        {
           
            System.out.println((i+1)+")-"+order.name_order[i]);
     


        }
        System.out.println(" Do you want to delete any product? --please enter y for yes and n for no");
        char c = it.next().charAt(0);
        if(c=='y')
        {
            System.out.println(" of course enter number of products you want to delete ");
            int numb =it.nextInt();
            for(int i=1;i<=numb;i++)
            {
                System.out.println("Enter the name of That product ");
                  String name  = it.next();
             for(int j=0;j<product.n;j++)
            {
                if (name.equals(order.name_order[j]))
                {
                    System.out.println(" the number of that product is "+ (j+1)+" and it will be deleted ");
                    order.name_order[j]="";
                  
                
                }
              
              
         
         
    
    
            }
              

            }
              System.out.println(order.get_sum());
          
         
        }
        if(c=='n')
        {
            System.out.println(" okay and the price is "+order.get_sum());

        }

    }

    
}
