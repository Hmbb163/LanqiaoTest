package com.lanqiao.Demo;


public class Triangle {
    
    //����������
    protected long lborderA = 0;
    protected long lborderB = 0;
    protected long lborderC = 0;

    //���췽��
    public Triangle(long lborderA, long lborderB, long lborderC) {
        this.lborderA = lborderA;
        this.lborderB = lborderB;
        this.lborderC = lborderC;
    }

    //�ж��������Ƿ�����������Σ�������򷵻�true�������򷵻�false
    public boolean isTriangle(Triangle triangle) {
        boolean isTrue = false;
        //�жϱ߽��Ƿ����0�������򷵻�false
        if (triangle.lborderA > 0 && triangle.lborderB > 0 &&  triangle.lborderC > 0) {
            //�ж�����֮���Ƿ���ڵ�����
            if ((triangle.lborderA < (triangle.lborderB + triangle.lborderC))
                    && (triangle.lborderB < (triangle.lborderA + triangle.lborderC))
                    && (triangle.lborderC < (triangle.lborderA + triangle.lborderB)))
                isTrue = true;
        }
        return isTrue;
    }

    //�ж������ε�����
    public String isType(Triangle triangle) {
        String strType = "";
        //�ж��Ƿ���������
        if (this.isTriangle(triangle)) {
            // �ж������ε�����
            if (triangle.lborderA == triangle.lborderB && triangle.lborderB == triangle.lborderC) {
                strType = "�ȱ�������";
            } else if ((triangle.lborderA != triangle.lborderB)
                    && (triangle.lborderB != triangle.lborderC)
                    && (triangle.lborderA != triangle.lborderC)) {
                strType = "���ȱ�������";
            } else {
                strType = "����������";
            }
        }
        return strType;
    }

}