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
		static String [] daAn=new String[45];						//用来存放答案
		static String[] FArrey=new String[65];
		public static void main(String[] args)
		{
				String filePath = "D:\\ceshi";  //获取D：\\目录下的所有文件路径
				getFiles( filePath );
				String daAnPath="D:\\答案.txt";   	//正确答案所在目录
				/**
				 * 				filePath和daAnPath也需要根据实际情况修改
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
											lineTxt=lineTxt.replaceAll("\\s*", "");  //除去所有空格以及制表符
											lineTxt=lineTxt.substring(2);   				 //截取字符
											lineTxt=lineTxt.toUpperCase();	//全部转化为大写 	
											//System.out.println(lineTxt);
											if(daAn[counter].compareTo(lineTxt)==0)  {                       //和正确答案进行比较
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
								 *   这个substring 的参数需要根据目录深度进行改动
								 *   还可以自行添加一个数字截取掉   .txt     后缀
								 */
								read.close();
								return (filePath+"分数为："+sum);
						}
						else
						{
								//System.out.println("找不到指定的文件");
						}
				}catch(Exception e)
				{
						//System.out.println("读取文件出错");
						//e.printStackTrace();
				}
				return filePath+"没有分数....";
		}
		public static void readDaAn(String filePath)              //读取存放答案的TXT文件
		{
	        try {
	                String encoding="GBK";
	                File file=new File(filePath);
	                if(file.isFile() && file.exists()){ //判断文件是否存在
	                    InputStreamReader read = new InputStreamReader(
	                    new FileInputStream(file),encoding);//考虑到编码格式
	                    BufferedReader bufferedReader = new BufferedReader(read);
	                    String lineTxt = null;
	                    int counter=0;
	                    while((lineTxt = bufferedReader.readLine()) != null){
	                    	lineTxt=lineTxt.replaceAll("\\s*", "");  //除去所有空格以及制表符
							lineTxt=lineTxt.substring(2);   				 //截取字符
							daAn[counter]=lineTxt.toUpperCase();
							//System.out.println("答案预览"+daAn[counter]);
							counter++;
	                    }
	                    read.close();
	        }else{
	            //System.out.println("找不到指定的文件");
	        }
	        } catch (Exception e) {
	            //System.out.println("读取文件内容出错");
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
	    	//如果文件存在，则追加内容；如果文件不存在，则创建文件
	    	File f=new File("D:\\ChengJi.txt");  
	    	/**
	    	 *         上面的路径是最后数据保存的路径需要改动
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
