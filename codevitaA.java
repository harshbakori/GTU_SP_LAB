import java.util.*;
class compniy
{
    double radious,efficiency;
    int CPW;

   // compniy()
    //{
       // radious = 25;
       // efficiency = 0.56;
       // CPW = 40000;
    //}

    public double warea()
    {
        double wl=2*radious*radious; 
        return wl;
    }

    public double geneli(double den,double wspeed)
    {
        double e = 0.5*den*warea()*wspeed*wspeed*wspeed*efficiency;
        return e;
    }
}

class codevitaA
{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        double den=1.23;
        int lan;
        double wspeed;
        int budget;
        compniy A = new compniy();
        compniy B = new compniy();

        A.radious=Sc.nextDouble();
        A.CPW=Sc.nextInt();
        A.efficiency=Sc.nextDouble();
        B.radious=Sc.nextDouble();
        B.CPW=Sc.nextInt();
        B.efficiency=Sc.nextDouble();
        budget=Sc.nextInt();
        lan=Sc.nextInt();
        wspeed=Sc.nextDouble();

        /*System.out.println("area is = "+A.warea());
        System.out.println(A.geneli(den,wspeed));
        System.out.println("area is = "+B.warea());
        System.out.println(B.geneli(den,wspeed));*/

        double aarea=A.warea();
        double barea=B.warea();
        int na=1,nb=1;
        double sum=0;
        
        while(budget>((na*A.CPW)+(nb*B.CPW)))
        {
            if(A.geneli(den, wspeed)>B.geneli(den, wspeed))
            {
                while(sum>lan)
                {
                    sum+=aarea;
                    na++;
                }
                if((sum+barea)<lan){nb++;}
            }
            else if(A.geneli(den, wspeed)<B.geneli(den, wspeed))
            {
                while(sum>lan)
                {
                    sum+=barea;
                    nb++;
                }
                if((sum+aarea)<lan){na++;}
            }                
        }
        double main_power=(na*A.geneli(den, wspeed))+(nb*B.geneli(den, wspeed));
        System.out.println(main_power);//total power
        System.out.println(na);//total number of windmill of A compniy
        System.out.println(nb);//total number of windmill of B compniy
        Sc.close();
        }    
}