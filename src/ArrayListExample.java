import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class ArrayListExample{
    
    public static void main(String args[]) throws IOException
    {
        
        int size,a,pos;
        
        Scanner in= new Scanner(System.in);
    System.out.print("Enter the size of the Array List");
    size=in.nextInt();
    
    ArrayList<Integer> myarray=new ArrayList<>(size);
    
    for(int i=1;i<=size;i++)
    {   
        System.out.print("Enter the Element");
      a=in.nextInt();
        myarray.add(a);
    }
    
    System.out.println("Your entered ArrayList is: "+myarray);
    
    System.out.println("Enter the position you want to delete");
   
    pos=in.nextInt();
            
    myarray.remove(pos);
            
    System.out.println("Your entered ArrayList after remove operation is: "+myarray);
    
    System.out.println("Printing the Element one by one: ");
    
    for(int j=0;j<myarray.size();j++)
       System.out.println(myarray.get(j)+" ");
    }
}