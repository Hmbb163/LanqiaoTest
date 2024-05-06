package com.lanqiao.Demo;


public class Triangle {
    
    //定义三条边
    protected long lborderA = 0;
    protected long lborderB = 0;
    protected long lborderC = 0;

    //构造方法
    public Triangle(long lborderA, long lborderB, long lborderC) {
        this.lborderA = lborderA;
        this.lborderB = lborderB;
        this.lborderC = lborderC;
    }

    //判断三条边是否能组成三角形，如果能则返回true，不能则返回false
    public boolean isTriangle(Triangle triangle) {
        boolean isTrue = false;
        //判断边界是否大于0，出界则返回false
        if (triangle.lborderA > 0 && triangle.lborderB > 0 &&  triangle.lborderC > 0) {
            //判断两边之和是否大于第三边
            if ((triangle.lborderA < (triangle.lborderB + triangle.lborderC))
                    && (triangle.lborderB < (triangle.lborderA + triangle.lborderC))
                    && (triangle.lborderC < (triangle.lborderA + triangle.lborderB)))
                isTrue = true;
        }
        return isTrue;
    }

    //判断三角形的类型
    public String isType(Triangle triangle) {
        String strType = "";
        //判断是否是三角形
        if (this.isTriangle(triangle)) {
            // 判断三角形的类型
            if (triangle.lborderA == triangle.lborderB && triangle.lborderB == triangle.lborderC) {
                strType = "等边三角形";
            } else if ((triangle.lborderA != triangle.lborderB)
                    && (triangle.lborderB != triangle.lborderC)
                    && (triangle.lborderA != triangle.lborderC)) {
                strType = "不等边三角形";
            } else {
                strType = "等腰三角形";
            }
        }
        return strType;
    }

}