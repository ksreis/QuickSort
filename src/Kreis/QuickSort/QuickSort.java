package Kreis.QuickSort;

public class QuickSort {
	public QuickSort() {
		super();
	}
	    public void sort(int[] vetor, int inicio, int fim) {
	        if (inicio < fim) {
	            int pivoIndex = divide(vetor, inicio, fim);
	            sort(vetor, inicio, pivoIndex - 1);
	            sort(vetor, pivoIndex + 1, fim);
	        }
	    }
	    public int divide(int[] vetor, int inicio, int fim) {
	        int pivo = vetor[fim];
	        int i = inicio - 1;
	        for (int j = inicio; j < fim; j++) {
	            if (vetor[j] <= pivo) {
	                i++;
	                int temp = vetor[i];
	                vetor[i] = vetor[j];
	                vetor[j] = temp;
	            }
	        }
	        int temp = vetor[i + 1];
	        vetor[i + 1] = vetor[fim];
	        vetor[fim] = temp;
	        return i + 1;	    
	}
}

