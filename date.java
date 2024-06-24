
public class datevaliddate
{
    public static void main(String[] args)
    {
       String sdate;Scanner
        stringTokinizer st=new stringTokinizer(sdate,"/");
        int dd=integer.parsInt(st.nextToken());
        int mm=integer.parsInt(st.nextToken());
        int yy=integer.parsInt(st.nextToken());
        boolean valid=true;
        if(dd>31 || dd<1 ||m>12 ||m<1)
              valid=false;
        else{
            switch(ch)
            {
                case 1:case 6:case 9:case 11:
                       if(dd>30)
                          valid=false;
                        break;
                case 2:if((yy%4==0 && (yy%100!=0 || yy%400==0)))
                        {
                            if(dd>29)
                               valid=false;
                            else if(dd>28)
                                valid=false;
                        }

             }}
                        if(valid)
                        {
                            System.out.println("valid");

                        }
                        else
                        {
                            System.out.println("invalid");
                        }
             
            
        }
    }
