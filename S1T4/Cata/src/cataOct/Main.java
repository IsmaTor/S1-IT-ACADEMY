package cataOct;

public class Main {
	
	//redondear resultado sin el método Math
	
	public static double red(double num) {
		double resultat = num + ( 1 + (num % 10));
		return resultat;
	}

	public static void main(String[] args) {
		
		System.out.println(ceil2(5.0));
        System.out.println(ceil2(5.45));
        System.out.println(ceil2(-5.5));
        System.out.println(ceil2(5.65));

    }

	//solución Christian
    public static double ceil(double numRedondeo) {

        if(numRedondeo < 0){
            numRedondeo = (int)numRedondeo;
        }else if(numRedondeo == 0) {
            numRedondeo = 0;
        }if(numRedondeo > ((int)numRedondeo)){
            numRedondeo += 1;
        }
        return (int)numRedondeo;
    }

    //Solución Jose
    public static double ceil2(double numRedondear) {
        int a = (int) numRedondear;

        if(numRedondear > a) {
            a++;
        }

        return a;
    }

		
		
		
		
		
		// TODO Auto-generated method stub

	}


