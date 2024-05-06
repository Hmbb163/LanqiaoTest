package com.lanqiao.Demo;

import java.io.*;

import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class FileReader {
	
//用csv文件参数化
	public static  Object[][] readCsv(String fileDir, int rows, int cols) throws NumberFormatException, IOException {
        /*
         * Description: 逐行读取csv文件中的测试用例数据，以Object[][]的形式返回
         * @param fileDir: csv测试数据文件的保存路径
         * @param rows: csv文件中测试数据的总行数
         * @param cols: csv文件中测试数据的总列数
         */
        Object[][] testData = new Object[rows][cols];
        //指定csv文件的字符集格式
        String encoding = "utf-8";
        String line = "";
        int count = 0;
        String[] temp = new String[rows];
        InputStreamReader reader = new InputStreamReader(new FileInputStream(fileDir), encoding);
        BufferedReader br = new BufferedReader(reader);
        //将逐行读取的数据按分隔符拆分后保存在数组中
        while((line = br.readLine()) != null) {
            temp = line.split(",");
            for(int i = 0; i < temp.length; i++) {
                testData[count][i] = Integer.parseInt(temp[i]);
            }
            count++;
        }
        reader.close();
        return testData;
    }
	
	
//读取xls表格
	 public static  Object[][] readExcel(String fileDir, int sheetIndex, int rows, int cols) throws BiffException, IOException {
	        /*
	         * Description: 逐行读取.xls文件中的测试用例数据，以Object[][]的形式返回
	         * @param fileDir: excel测试数据文件的保存路径
	         * @param sheetIndex: excel文件sheet的index，第一个sheet的index为0
	         * @param rows: excel sheet中测试数据的总行数
	         * @param cols: excel sheet中测试数据的总列数
	         */
	        Object[][] testData = new Object[rows][cols];
	        File f = new File(fileDir);
	        //创建工作簿
	        Workbook workbook = Workbook.getWorkbook(f);
	        //获取工作表对象
	        Sheet sheet = workbook.getSheet(sheetIndex);
	        //逐行读取单元格中的数据并存入object数组中
	        for (int i = 0; i < sheet.getRows(); i++) {//行
	            for (int j = 0; j < sheet.getColumns(); j++) {//列
	                Cell cell = sheet.getCell(j, i);
	                testData[i][j] = Integer.parseInt(cell.getContents());
	            }
	        }
	        return testData;           
	    }
	 
	 
//读取txt文件
    public static Object[][] readTxt(String fileDir, int rows, int cols) throws IOException{
        /*
         * Description: 逐行读取txt文件中的测试用例数据，以 Object[][]的形式返回
         * @param fileDir: txt测试数据文件的存放路径
         * @param rows: txt文件中测试数据的总行数
         * @param cols: txt文件中测试数据的总列数
         */
        Object[][] testData = new Object[rows][cols];
        File file = new File(fileDir);
        String encoding = "GBK";
        String[] temp = new String[rows];
        int count = 0;
        if(file.exists() && file.isFile()) {
            //逐行读取txt文件中的数据
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file), encoding);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lineTxt = null;
            while((lineTxt = bufferedReader.readLine()) != null) {
                //将逐行读取的数据按分隔符拆分后保存在数组中
                temp = lineTxt.split(",");
                for(int i = 0; i < temp.length; i++) {
                    testData[count][i] = Integer.parseInt(temp[i]);
                }
                count++;
            }
            reader.close();
        }
        return testData;
        
    }
}