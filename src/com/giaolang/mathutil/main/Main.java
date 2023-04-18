/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtil;

/**
 *
 * @author datnt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        tryTDDFrist();
        testFactorialGivenWrongAgrumentThrowsException();
    }

    public static void testFactorialGivenWrongAgrumentThrowsException() {
        //Test case #3: đưa data sai, n âm, n quá lớn.
        // Hàm được thiết kế để viết ngoại lệ
        // Nếu thấy ngoại lệ như kì vọng -> Pass test -> Màu xanh
      
        System.out.println("This messange come from the main() method : ");
        System.out.println("This jar file is built based based ANT co-operating with JUNIT");
        tryTDDFrist();
    }

    //Hàm này được viết ra để áp dụng những kỉ thuật viết code.
    // Gọi thử dùng thử hàm chính bên core/bên MathUtil
    // Xem nó sai đúng ra sao ở ngay mức khởi đầu viết code.
    public static void tryTDDFrist() {
        //Test case 1
        // - input: n = 1;
        // - Gọi hàm getFactorial(1) => result = 1;
        long expected = 1;
        long actual = MathUtil.getFactorial(1);

        System.out.println("Test 1! | Status: "
                + "Expected: " + expected
                + " Actual : " + actual);

        //so sanh expected vs actual có giống nhau không
        // Giống hàm đúng với case đang test
        //Test case 2
        // - input: n = 2;
        // - Gọi hàm getFactorial(2) => result = 2;
        System.out.println("Test 1! | Status: "
                + "Expected: 2"
                + " Actual : " + MathUtil.getFactorial(2));

    }

}
