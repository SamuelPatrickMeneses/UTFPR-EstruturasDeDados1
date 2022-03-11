package Atividade00Arranjos.Ative1;
public class Ative1{
	public static void main (String[] args){
		int v[] = new int[10];
		for(int i = 10;i >= 1; i--){
			v[i] = i;		
		}
		print(v);
		int x = 1;
		for(int i = 0;i < v.length; i++){
			if(i == 3){
				x = 2;
			}
			v[i] = i + (i * x);		
		}
		print(v);
	}
	public static void print(int[] v){
		for(int i = 0;i < v.length; i++){
			System.out.printf("%d ",v[i]);		
		}
		System.out.println();
	}
}
