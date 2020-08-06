import java.io.*;
public class Tarea {
	public static void main(String[] args)throws IOException{
		
		FileWriter excel=new FileWriter("excel.txt",false);
				
		int[]arr,aux;
		long time1,time2;
		long timeins,timeinsoras=0,timeinsordes=0;
		long timesel,timeseloras=0,timeselordes=0;
		long timebur,timeburoras=0,timeburordes=0;
		long timeqs,timeqsoras=0,timeqsordes=0;
		MetodosOrdenar or=new MetodosOrdenar();
		int i,z,datos=500;
		excel.write(" , , Insercion , , , Seleccion , , , Burbuja , , , QuickSort \r");
		excel.write("Largo , Desorden , Ascendente , Descendente, Desorden , Ascendente , Descendente, Desorden , Ascendente , Descendente, Desorden , Ascendente , Descendente \r");
		
		while(datos<=20000){//aumenta el largo del arreglo
			z=1;
			timeins=0;timesel=0;timebur=0;timeqs=0;
			while(z<=20){//ordena cada arreglo
				arr=new int[datos];
				i=0;
				while(i<arr.length){//ingresa enteros al arreglo
					arr[i]=(int)(Math.random()*1000);
					i++;
				}
				aux=(int [])arr.clone();
				//arreglo desordenado
				
				//Insercion
						time1=System.currentTimeMillis();
						or.insercion(arr);
						time2=System.currentTimeMillis();
						timeins=timeins+(time2-time1);
						arr=(int [])aux.clone();
				//Seleccion
						time1=System.currentTimeMillis();
						or.seleccion(arr);
						time2=System.currentTimeMillis();
						timesel=timesel+(time2-time1);
						arr=(int [])aux.clone();
				//Burbuja
						time1=System.currentTimeMillis();
						or.burbuja(arr);
						time2=System.currentTimeMillis();
						timebur=timebur+(time2-time1);
						arr=(int [])aux.clone();
				//QuickSort
						time1=System.currentTimeMillis();
						or.quickSort(arr,0,arr.length-1);
						time2=System.currentTimeMillis();
						timeqs=timeqs+(time2-time1);
						arr=(int [])aux.clone();
					
				if(z==1){
					arr=or.asc(arr);
					aux=(int [])arr.clone();
					//arreglo ya ordenado ascendentemente
					
					//Insercion
							time1=System.currentTimeMillis();
							or.insercion(arr);
							time2=System.currentTimeMillis();
							timeinsoras=(time2-time1);
							arr=(int [])aux.clone();
					//Seleccion
							time1=System.currentTimeMillis();
							or.seleccion(arr);
							time2=System.currentTimeMillis();
							timeseloras=(time2-time1);
							arr=(int [])aux.clone();
					//Burbuja
							time1=System.currentTimeMillis();
							or.burbuja(arr);
							time2=System.currentTimeMillis();
							timeburoras=(time2-time1);
							arr=(int [])aux.clone();
					//QuickSort
							time1=System.currentTimeMillis();
							or.quickSort(arr,0,arr.length-1);
							time2=System.currentTimeMillis();
							timeqsoras=(time2-time1);
							arr=(int [])aux.clone();
								
					arr=or.des(arr);
					aux=(int [])arr.clone();
					//ordena el arreglo ya ordenado descendentemente
					
					//Insercion
							time1=System.currentTimeMillis();
							or.insercion(arr);
							time2=System.currentTimeMillis();
							timeinsordes=(time2-time1);
							arr=(int [])aux.clone();
					//Seleccion
							time1=System.currentTimeMillis();
							or.seleccion(arr);
							time2=System.currentTimeMillis();
							timeselordes=(time2-time1);
							arr=(int [])aux.clone();
					//Burbuja
							time1=System.currentTimeMillis();
							or.burbuja(arr);
							time2=System.currentTimeMillis();
							timeburordes=(time2-time1);
							arr=(int [])aux.clone();
					//QuickSort
							time1=System.currentTimeMillis();
							or.quickSort(arr,0,arr.length-1);
							time2=System.currentTimeMillis();
							timeqsordes=(time2-time1);
							arr=(int [])aux.clone();
				}
				z++;
			}//ordena cada arreglo
			timeins=timeins/20;timesel=timesel/20;timebur=timebur/20;timeqs=timeqs/20;
			excel.write(datos+" , "+timeins+" , "+timeinsoras+" , "+timeinsordes+" , "+timesel+" , "+timeseloras+" , "+timeselordes+" , "+timebur+" , "+timeburoras+" , "+timeburordes+" , "+timeqs+" , "+timeqsoras+" , "+timeqsordes+" \r");
			datos=datos+500;
		}//aumenta el largo del arreglo
		excel.close();
	}
}
