
package groupgithub;

public class Nolan{

    public Nolan()
    {

    }

    public boolean isValid(String card)
    {
        int arr[] = new int[16];
	int sum = 0;
        if (card.length() == 16)
	{
            for (int a = 0; a < 16; a++)
	    {
	        arr[a] = Integer.parseInt(card.substring(a,a+1));
                if (a % 2 == 0)
		    arr[a] *= 2;
		sum+= (arr[a]%10)+(arr[a]/10);
            }
	    if (sum % 10 == 0)
	        return true;
	} else {
	    System.out.println("Wrong length");
	}
        return false;
    }


}

