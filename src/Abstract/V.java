package Abstract;
public class V 
{
	public static void main(String[] args) 
	{
		int a=23,i,j;
		if(a<5)
		{      
		for(j=1;j<=a*2;j++)
		{
			int count=0;
			for(i=1;i<=j;i++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(" "+j);
			}
		}
    }
		else
		{
			if(a<10)
			{
			for(j=1;j<=a*3-3;j++)
			{
				int count=0;
				for(i=1;i<=j;i++)
				{
					if(j%i==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.print(" "+j);
				}
			}
	    }
			else
			{
				if(a<17)
				{
					for(j=1;j<=(a*4)-10;j++)
					{
						int count=0;
						for(i=1;i<=j;i++)
						{
							if(j%i==0)
							{
								count++;
							}
						}
						if(count==2)
						{
							System.out.print(" "+j);
						}
					}
			    }
				else
				{
					if(a<24)
					{
						for(j=1;j<=(a*4)-8;j++)
						{
							int count=0;
							for(i=1;i<=j;i++)
							{
								if(j%i==0)
								{
									count++;
								}
							}
							if(count==2)
							{
								System.out.print(" "+j);
							}
						}
				    }		
				}
			}
		}
	}				
 }
 		


