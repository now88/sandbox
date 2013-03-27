
public class Test {

/*public static void geradezahlen()
{
	for(int i=2;i<369;i=i+2)
		if(i%16==0)
		System.out.println(i);
		else
		System.out.print(i+"\t");
}

public static void main(String[] args)
{
	Test einTest = new Test();
	einTest.geradezahlen();
}
*/
	
	public void secTag(int n)
	{
		int jahre = n/(365*24*60*60);
		int tage = n/(24*60*60)%(n/(365*24*60*60));
		int stunden = ((n/(60*60))%(n/(365*24*60*60)));
		int minuten = ((n/60)%(n/(365*24*60*60)));
		int sekunden = (n%(n/(365*24*60*60)));
		System.out.println(n+" Sec= "+jahre+"jahre "+tage+"tage "+stunden+"stunden "+minuten+"minuten "+sekunden+"sekunden ");
		System.out.println("noch eine ausgabe :-)");
	}
	public static void main(String[] args){
	Test einTest = new Test();
	einTest.secTag(500000000);
	}
}



