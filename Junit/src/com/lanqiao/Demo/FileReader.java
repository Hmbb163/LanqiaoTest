package com.lanqiao.Demo;

import java.io.*;

import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class FileReader {
	
//��csv�ļ�������
	public static  Object[][] readCsv(String fileDir, int rows, int cols) throws NumberFormatException, IOException {
        /*
         * Description: ���ж�ȡcsv�ļ��еĲ����������ݣ���Object[][]����ʽ����
         * @param fileDir: csv���������ļ��ı���·��
         * @param rows: csv�ļ��в������ݵ�������
         * @param cols: csv�ļ��в������ݵ�������
         */
        Object[][] testData = new Object[rows][cols];
        //ָ��csv�ļ����ַ�����ʽ
        String encoding = "utf-8";
        String line = "";
        int count = 0;
        String[] temp = new String[rows];
        InputStreamReader reader = new InputStreamReader(new FileInputStream(fileDir), encoding);
        BufferedReader br = new BufferedReader(reader);
        //�����ж�ȡ�����ݰ��ָ�����ֺ󱣴���������
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
	
	
//��ȡxls���
	 public static  Object[][] readExcel(String fileDir, int sheetIndex, int rows, int cols) throws BiffException, IOException {
	        /*
	         * Description: ���ж�ȡ.xls�ļ��еĲ����������ݣ���Object[][]����ʽ����
	         * @param fileDir: excel���������ļ��ı���·��
	         * @param sheetIndex: excel�ļ�sheet��index����һ��sheet��indexΪ0
	         * @param rows: excel sheet�в������ݵ�������
	         * @param cols: excel sheet�в������ݵ�������
	         */
	        Object[][] testData = new Object[rows][cols];
	        File f = new File(fileDir);
	        //����������
	        Workbook workbook = Workbook.getWorkbook(f);
	        //��ȡ���������
	        Sheet sheet = workbook.getSheet(sheetIndex);
	        //���ж�ȡ��Ԫ���е����ݲ�����object������
	        for (int i = 0; i < sheet.getRows(); i++) {//��
	            for (int j = 0; j < sheet.getColumns(); j++) {//��
	                Cell cell = sheet.getCell(j, i);
	                testData[i][j] = Integer.parseInt(cell.getContents());
	            }
	        }
	        return testData;           
	    }
	 
	 
//��ȡtxt�ļ�
    public static Object[][] readTxt(String fileDir, int rows, int cols) throws IOException{
        /*
         * Description: ���ж�ȡtxt�ļ��еĲ����������ݣ��� Object[][]����ʽ����
         * @param fileDir: txt���������ļ��Ĵ��·��
         * @param rows: txt�ļ��в������ݵ�������
         * @param cols: txt�ļ��в������ݵ�������
         */
        Object[][] testData = new Object[rows][cols];
        File file = new File(fileDir);
        String encoding = "GBK";
        String[] temp = new String[rows];
        int count = 0;
        if(file.exists() && file.isFile()) {
            //���ж�ȡtxt�ļ��е�����
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file), encoding);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String lineTxt = null;
            while((lineTxt = bufferedReader.readLine()) != null) {
                //�����ж�ȡ�����ݰ��ָ�����ֺ󱣴���������
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