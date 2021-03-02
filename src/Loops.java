
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		while(x<=100) {
			if (x%2==0) {
			System.out.println(x);}
			x++;
		}
		int i = 100;
		while(i<=100 && i>=0) {
			System.out.println(i);
			i=i-3;
		}
		
		
		for (int y=1; y<=100; y+=2) {
			System.out.println(y);
		}
		
		
		for(int j=0; j<=100; j++) {
			if(j%3==0 && j%5!=0) {
				System.out.println("Hello");
			}else 
				if(j%5==0 & j%3!=0) {
					System.out.println("World");
			}else
				if(j%5==0 && j%3==0) {
					System.out.println("HelloWorld");
				}
				else 
					System.out.println(j);
			
		}
		
		
		
	}

}
