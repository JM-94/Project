package Order;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
 // 하루매출 정리
public class Save {
  public void Order(){
    try{
    	
  	  	SimpleDateFormat format1 = new SimpleDateFormat( "yy-MM-dd HH시 mm분 ss초");
  	  	SimpleDateFormat format2 = new SimpleDateFormat( "yy-MM-dd");
  	  	Calendar time = Calendar.getInstance();
  	  	String format_time1 = format1.format(time.getTime());
  	  	String format_time2 = format2.format(time.getTime());
  	  	
//  	String path = "D:\\java\\"+format2+""; //폴더 경로
  	  	File Folder = new File("D:\\No Brand\\");
  		if (!Folder.exists()) {
  			try{
  			    Folder.mkdir(); //폴더 생성합니다.
  		        } 
  		        catch(Exception e){
  			    e.getStackTrace();
  			}        
  	         }
  		File Folder1 = new File("D:\\No Brand\\"+format_time2);
  		System.out.println("D:\\No Brand\\"+format_time2+"");
  		// 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
  		if (!Folder1.exists()) {
  			try{
  			    Folder1.mkdir(); //폴더 생성합니다.
  		        } 
  		        catch(Exception e){
  			    e.getStackTrace();
  			}        
  	         }
    	FileWriter fw = new FileWriter("D:\\No Brand\\"+format_time2+"\\"+format_time1+".txt"); // 절대주소 경로 가능
    	BufferedWriter bw = new BufferedWriter(fw);
    	int hapap = 0;
  		
    	bw.write((format_time1+"\t\t\t")+("주문서"));
    	bw.newLine(); // 줄바꿈
    	bw.write("=====================================");
      	bw.newLine();
      	bw.write(String.format("%10s %20s %20s","메뉴","수량","합계"));
      	bw.newLine();
      for(int i = 0; i < Main.menu.length; i++){
    	  if(Main.mount[i] != 0){
    		  bw.write(String.format("%10s %20d %20d",Main.menu[i],Main.mount[i],Main.mount[i]*Main.price[i]));
    		  bw.newLine();
    		  hapap = hapap+(Main.mount[i]*Main.price[i]);
    	  }
      }
      	bw.write("=====================================");
      	bw.newLine();
      	bw.write("\t\t\t\t합 계 : "+hapap);
      	bw.close();
    }
    catch (IOException e)
    {
      System.err.println(e); // 에러가 있다면 메시지 출력
    }
  }
  public void End(){
	  
  }
}
