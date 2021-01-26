class Main
{
    public static void main(String[] args)
    {
        String s = "1abc23iu89";
        String temp = "0";
        int i,sum,result;
        sum = 0;
        result = 0;
   
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                temp = temp + ch;
            }
            else
            {
                sum = sum+Integer.parseInt(temp);
                temp ="0";
            }
        }
        result = sum+Integer.parseInt(temp);
        System.out.println(result);      //Result shoud be 113(1+23+89)
        
    }
    
}
