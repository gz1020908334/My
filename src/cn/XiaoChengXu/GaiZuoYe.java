package cn.XiaoChengXu;
/*import java.io.BufferedInputStream;
import java.io.BufferedReader;
import 	java.io.File;
import	java.io.FileInputStream;
import	java.io.InputStreamReader;
import	java.io.Reader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;*/
import java.io.*;
/*
 *    		@author GZ
 *    		
 */
public class GaiZuoYe {
		static String [] daAn=new String[45];						//������Ŵ�
		static String[] FArrey=new String[65];
		public static void main(String[] args)
		{
				String filePath = "D:\\ceshi";  //��ȡD��\\Ŀ¼�µ������ļ�·��
				getFiles( filePath );
				String daAnPath="D:\\��.txt";   	//��ȷ������Ŀ¼
				/**
				 * 				filePath��daAnPathҲ��Ҫ����ʵ������޸�
				 */
				readDaAn(daAnPath);
				for(int i=0;FArrey[i]!=null;i++)
				{
					String fPath=FArrey[i];
					method1(readTxtFile(fPath));
				}
		}
		public static String readTxtFile(String filePath)
		{
				
				try
				{
						String encoding="GBK";
						File file=new File(filePath);
						if(file.isFile()&&file.exists())
						{
								InputStreamReader read=new InputStreamReader(
										new FileInputStream(file),encoding);
								BufferedReader bufferedReader =new BufferedReader(read);
								String lineTxt=null;
								int  counter=0;
								int sum=0;
								while((lineTxt =bufferedReader.readLine())!=null)
								{
											lineTxt=lineTxt.replaceAll("\\s*", "");  //��ȥ���пո��Լ��Ʊ��
											lineTxt=lineTxt.substring(2);   				 //��ȡ�ַ�
											lineTxt=lineTxt.toUpperCase();	//ȫ��ת��Ϊ��д 	
											//System.out.println(lineTxt);
											if(daAn[counter].compareTo(lineTxt)==0)  {                       //����ȷ�𰸽��бȽ�
												if(counter<9)
												{
													if(daAn[counter].length()==1)
													{
																sum+=1;
													}
													else
													{
															sum+=2;
													}
												}
												else
												{
													if((daAn[counter].length()-1)==1)
													{
																sum+=1;
													}
													else
													{
															sum+=2;
													}
												}
											}
											counter++;
								}
								filePath="1"+filePath.substring(9); 
								/***
								 *   ���substring �Ĳ�����Ҫ����Ŀ¼��Ƚ��иĶ�
								 *   �������������һ�����ֽ�ȡ��   .txt     ��׺
								 */
								read.close();
								return (filePath+"����Ϊ��"+sum);
						}
						else
						{
								//System.out.println("�Ҳ���ָ�����ļ�");
						}
				}catch(Exception e)
				{
						//System.out.println("��ȡ�ļ�����");
						//e.printStackTrace();
				}
				return filePath+"û�з���....";
		}
		public static void readDaAn(String filePath)              //��ȡ��Ŵ𰸵�TXT�ļ�
		{
	        try {
	                String encoding="GBK";
	                File file=new File(filePath);
	                if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
	                    InputStreamReader read = new InputStreamReader(
	                    new FileInputStream(file),encoding);//���ǵ������ʽ
	                    BufferedReader bufferedReader = new BufferedReader(read);
	                    String lineTxt = null;
	                    int counter=0;
	                    while((lineTxt = bufferedReader.readLine()) != null){
	                    	lineTxt=lineTxt.replaceAll("\\s*", "");  //��ȥ���пո��Լ��Ʊ��
							lineTxt=lineTxt.substring(2);   				 //��ȡ�ַ�
							daAn[counter]=lineTxt.toUpperCase();
							//System.out.println("��Ԥ��"+daAn[counter]);
							counter++;
	                    }
	                    read.close();
	        }else{
	            //System.out.println("�Ҳ���ָ�����ļ�");
	        }
	        } catch (Exception e) {
	            //System.out.println("��ȡ�ļ����ݳ���");
	            //e.printStackTrace();
	        }
	     
	    }
	    static void getFiles( String filePath )
	    {
	        File root = new File( filePath );
	        File[] files = root.listFiles();
	        int counter=0;
	        for ( File file : files )
	        {
	        			FArrey[counter++]=file.getAbsolutePath();
	        }
	    }
	    public static void method1(String s) {
	    	FileWriter fw = null;
	    	try {
	    	//����ļ����ڣ���׷�����ݣ�����ļ������ڣ��򴴽��ļ�
	    	File f=new File("D:\\ChengJi.txt");  
	    	/**
	    	 *         �����·����������ݱ����·����Ҫ�Ķ�
	    	 */
	    	fw = new FileWriter(f, true);
	    	} catch (IOException e) {
	    	e.printStackTrace();
	    	}
	    	PrintWriter pw = new PrintWriter(fw);
	    	pw.println(s);
	    	pw.flush();
	    	try {
	    	fw.flush();
	    	pw.close();
	    	fw.close();
	    	} catch (IOException e) {
	    	e.printStackTrace();
	    		}
	    	}
}
