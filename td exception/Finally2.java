import java.lang.Exception;

public class Finally2{

	public static void fina(int a) throws MonException {
		try {
			System.out.println(n);
			throw new MonException();
		}catch(MonException e){
			System.out.println("catch dans fina, a= " + a);
		}
		finally{
			System.out.println("dans finally de fina, a = " + a);
		}

	}


	public static void main(String[] args){
		int a=0;
		try{
			for(a=1;a<5;a++) fina(n);
		}catch (MonException e){
			System.out.println("catch dans main - a = " + a);
		}finally{
		System.out.println("dans finally de main - a = " + a);
		}
	}

}