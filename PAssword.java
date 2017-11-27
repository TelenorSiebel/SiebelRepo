
public class Sample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		
		{
		
		String password,pass=null;              // String that holds current input
        String s2;
        int length,hash;

		 // String usr = args[0];
		 // String srvr = args[2];
		 // String log_file = args[4];
		 // String sql_file = args[3];

	  // decryption code
        password="sandeepagowdakabbinamane";
        //s2=args[1];


        length=password.length();
           
		System.out.println("Length="+length);

        char decrypted[] = new char[length];
        char c;


        for(int i=0;i<length;i++)
        {

	System.out.println("Characters are="+password.charAt(i)+ " at "+ i);

        		if(i>=0 && i<5)
        		{
					decrypted[i] = (char)((int)password.charAt(i) - 3) ;
					//c=c+3;
				}

				if(i>=5 && i<9)
				{
					decrypted[i] = (char)((int)password.charAt(i) - 5) ;
					//c=c+5;
				}

				if(i>=9 && i<13)
				{
					decrypted[i] = (char)((int)password.charAt(i) + 2) ;
					//c=c-2;
				}

				if(i>=13 && i<17)
				{
					decrypted[i] = (char)((int)password.charAt(i) + 5) ;
					//c=c-5;
			    }

			    if(i>=17 && i<21)
			    {
					decrypted[i] = (char)((int)password.charAt(i) - 1) ;
					//c=c+1;
				}


        }


                   String password_actual=new String(decrypted);
				   
				   System.out.println("password_actual="+password_actual);

	}

	}
}
