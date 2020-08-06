
public class MetodosOrdenar {
	
	public void insercion(int[] arr) {//ascendentemente
		for (int i=1; i<arr.length; i++)
			for (int j=i; (j>0) && (arr[j]<arr[j-1]);j--)
				swap(arr, j, j-1);
	}
		
	public void seleccion(int[] arr) {//ascendentemente
		for (int i=0; i<arr.length-1; i++) {
			int lowindex = i;
			for (int j=arr.length-1; j>i; j--)
				if (arr[j] < arr[lowindex])
					lowindex = j;
			swap(arr, i, lowindex);
		}
	}
	
	public void burbuja(int[] arr) {//ascendentemente
		for (int i=0; i<arr.length-1; i++)
			for (int j=arr.length-1; j>i; j--)
				if (arr[j] < arr[j-1])
					swap(arr, j, j-1);
	}
	
	public int[] asc(int[] arr) {//ascendentemente
		for (int i=0; i<arr.length-1; i++)
			for (int j=arr.length-1; j>i; j--)
				if (arr[j] < arr[j-1])
					swap(arr, j, j-1);
		return arr;
	}
	public int[] des(int[] arr) {//descendentemente
		for (int i=0; i<arr.length-1; i++)
			for (int j=arr.length-1; j>i; j--)
				if (arr[j]>arr[j-1])
					swap(arr, j, j-1);
		return arr;
	}
	
	public void quickSort(int [ ] arr, int inicio, int fin){  
	    if(inicio < fin){
	        int k= dividir(arr,inicio,fin); 
	        quickSort(arr,inicio,k); 
	        quickSort(arr,k+1,fin);  
	    } 
	}
	private int dividir(int [ ] arr, int inicio, int fin){  
	    int l = inicio - 1,r= fin +1; 
	    int pivote = arr[inicio]; 
	    while (l < r ){  
	        do{  
	            l++;  
	        }while (arr[l] < pivote); 
	        do{  
	           r--;
	        }while (arr[r] > pivote);
	        swap(arr,l,r);
	    }    
	    swap(arr,l,r); 
	    return r;  
	}
	public void swap(int[] arr,int j,int k){//cambia
		int aux = arr[j];
        arr[j] = arr[k];
        arr[k] = aux;
	}
}