import java.util.Arrays;
public class Ative1{
	public static void main (String[] args){
                // a)
		int v[] = new int[10];
                int x = 10; 
		for(int i = 0;i < v.length; i++ ){
			v[i] = x;
                        x--;
		}
		print(v);
                //b)
		x = 0;
                v = new int[11];
		for(int i = 0;i < v.length; i++){
			if(i >= 2)
                            x += 2;
                        else if(i == 1)
                            x = 1;
                        if(i == 0)    
                            v[i] =  x;
                        else
                            v[i] = v[i - 1] + x;
		}
		print(v);
                //c)
                x = 0;
                v = new int[10];
                for(int i = 0;i < v.length; i++){
			if(i == 5)
                            x = 10;
			else if(i < 5)
                            x++;
                        else
                            x += 10;
                        v[i] =  x;	
		}
		print(v);
        int w[] = {1,2000,100,1000, -4};
        System.out.println(indexMax(w));
        print(parseBoolean(w));
        System.out.println(contaPares(w));
        Baralho b = new Baralho();
        b.imprimebaralho();
        b.embaralha();
        b.imprimebaralho();
        Carta c = b.daCarta();
        System.out.println(c);
        System.out.println(b.temCarta());

	}
	    private static void print(int[] v){
		for(int i = 0;i < v.length; i++){
			System.out.printf("%d ",v[i]);		
		}
		System.out.println();
	}
        private static void print(boolean[] v){
		for(int i = 0;i < v.length; i++){
			System.out.print(v[i]+" ");		
		}
		System.out.println();
	}   
        //2.2
        public static int contaPares(int[] v){
            int c = 0;
            for(int i: v)
                if((i % 2) == 0)
                    c++;
            return c;
        }
        //2.3
        public static boolean[] parseBoolean(int[] v){
            int l = v.length;
            boolean[] bs = new  boolean[l];
            for(int i = 0;i < v.length;i++)
                bs[i] = v[i] > 0;
            return bs;
        }
        //2.4
        public static int indexMax(int[] v){
            int max = Integer.MIN_VALUE;
            for(int i: v)
                if(i > max)
                    max = i;
            return max;
        }
}
