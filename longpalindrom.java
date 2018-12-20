import java.util.Scanner;
class longpalindrom
{
    public static void main(String[] args) 
    {
        int flage=0;
        StringBuffer s=new StringBuffer();
        StringBuffer b=new StringBuffer();
        StringBuffer c=new StringBuffer();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the string");
        s.append(Sc.nextLine());
        System.out.println(s.length());
        b.append("0");
        for(int i=0;i<s.length();i++)
        {
            System.out.println(s.charAt(i));
            if(b.length()!=0)
            {
            for(int j=0;j<b.length();j++)
            {
               // System.out.println(s.charAt(i));
                if(s.charAt(i)!=b.charAt(j))
                {
                    flage=1; 
                  //  break;
                }
                else
                {
                    c.append(s.charAt(i));
                    break;
                }
            }
            if(flage==1)
            {
                b.append(s.charAt(i));  
            }
            flage=0;
               // b.append(s.charAt(0));   
        }
        else{System.out.println("zero");}
        }
        System.out.println("real string = "+ s);
        System.out.println("b string = "+ b);
        System.out.println("c string = "+ c);
        Sc.close();
        System.out.print(c);
        System.out.print(c.reverse());
    }
}