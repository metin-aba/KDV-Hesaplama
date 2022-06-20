import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
        double doubkdvliTutar,kdvsizTutar;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen tutar giriniz :");
		double tutar = scanner.nextDouble();
		
		if (tutar<=1000) {
			
			 double kdvOran=0.18;
			 
			 System.out.println("KDV siz tutar :" +tutar);
			 System.out.println("KDV li tutar :" + (tutar +(tutar*kdvOran)));
			 System.out.println("KDV oraný :" +((tutar*kdvOran+ tutar)-tutar));
		}
		else {
			
			double kdvOran=0.08;
			 
			 System.out.println("KDV siz tutar :" +tutar);
			 System.out.println("KDV li tutar :" + (tutar +(tutar*kdvOran)));
			 System.out.println("KDV oraný :" +((tutar*kdvOran+ tutar)-tutar));
			
		}
	}

}
