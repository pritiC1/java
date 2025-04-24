
class StringOperation
{
    public String concatString(String s1,String s2)
    {
        return s1+" "+s2;
    }
    public String reverseString(String s1)
    {
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        return sb.toString();
    }
    public String deleteCharAtLocation(String s1,int location)
    {
        String s2=null;
        if(location>s1.length())
            System.out.println("String is smaller than entered location");
        else
        {
            StringBuffer sb=new StringBuffer(s1);
            s2=sb.deleteCharAt(location).toString();
        }
        return s2;

    }
    public String alternateCharacter(String s1)
    {
        int len=s1.length();
        String s2=s1.toLowerCase();
        String s3="";
        for(int i=0;i<len;i++)
        {
            if(i%2==0)
                s3=s3+s2.CharAt(i);
            else
            {
                char ch=s2.CharAt(i);
                String s4=Character.toString(ch);
                s3=s3+s4.toUpperCase();
            }

        }
        return s3;
    }
    
}