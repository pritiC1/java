import java.util.*;
class TestMicroProcessor
{
    public static void main(String args[])
    {
        MicroProcessor[] mp=new MicroProcessor[5];
        mp[0]=new MicroProcessor("Intel","I1",300);
        mp[1]=new MicroProcessor("Apple","I2",400.30);
        mp[2]=new MicroProcessor("Samsung","I5",480.78);
        mp[3]=new MicroProcessor("Mediatek","I7",700.20);
        mp[4]=new MicroProcessor("Intel","I1",400);
        
        System.out.println("Before Sorting ");
        for(MicroProcessor micro:mp)
        {
            System.out.println("Company_name="+micro.company_name+"  "+"Microprocessor_name="+micro.M_name+"   "+"MicroProcessor_speed="+micro.speed);
        }
        Arrays.sort(mp,Comparator.comparing(s->s.speed));
        System.out.println("After Sorting");
        for(MicroProcessor micro:mp)
        {
            System.out.println(micro.company_name+" "+micro.M_name+" "+micro.speed); 
        }

    }
}