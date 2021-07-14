public class hello {
    public static void main(String []args ){
    
        
    for(int j=1;j<10;j++)
    {    
        for (int i=0;i<10;i++)
        {
            if(j==1 || j==9)
                System.out.print("$");
            else if(i==0 || i==9)
                System.out.print("$");
            else 
                System.out.print("");    
        }
        System.out.println();
    }
}  

    
}
