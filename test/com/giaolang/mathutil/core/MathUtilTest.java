/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author datnt
 */
public class MathUtilTest {
    //Ta đi test ngoại lệ, tức là so sánh, đo lường xem ngoại lệ
    // có xuất hiện hay không thay vì đưa data cà chớn, n < 0 || n > 20
    // thay vì so sánh expected với actual 
    // TA SẼ ĐI SO SÁNH/ ƯỚC LƯỢNG XEM EXCEPTION CÓ XUẤT HIỆN NHƯ MONG MUỐN HAY KHÔNG
    // NẾU NHƯ KÌ VỌNG THÌ HÀM CHẠY NGON, SURE THIẾT KẾ ĐÚNG,
    // NẾU NGOẠI LỆ XUẤT HIỆN NHƯ KÌ VỌNG -> MÀU XANH, THẤY MÀU ĐỎ EXCEPTION MỪNG
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongAgrumentThrowsException() {
        //Test case #3: đưa data sai, n âm, n quá lớn.
        // Hàm được thiết kế để viết ngoại lệ
        // Nếu thấy ngoại lệ như kì vọng -> Pass test -> Màu xanh
        System.out.println("*Hope to see the Exceptional Illegal Argument Exception");
        MathUtil.getFactorial(25);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        // Test case #2: n = 3; hy vọng hàm trả về là 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));

        // Test case #3: n = 4; hy vọng hàm trả về là 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        // Test case #4: n = 5; hy vọng hàm trả về là 120
        Assert.assertEquals(120, MathUtil.getFactorial(5));

    }
    
    @Test
    // Tên hàm của test script phải nói lên ý nghĩa của việc kiểm thử,
    // tình huống này là ta test hàm với đúng tham số từ n = 2...20!!!
    public void testFactorialGivenRightArgumentReturnsWell() {
        // test case #1: n = 0 hy vọng trả về là 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);

        // Test case #2: n = 1; hy vọng hàm trả về là 1
        Assert.assertEquals(1, MathUtil.getFactorial(1));

        // Test case #3: n = 2; hy vọng hàm trả về là 2
        Assert.assertEquals(2, MathUtil.getFactorial(2));

    }

//    @Test ra lệnh cho framework JUnit đã add/import 
    // tự động generate ra cái hàm public static void main()
    // biến hàm tryJUnitComparation() thành hàm main();
    // và gửi main() này cho JVM chạy - Java Virtual Machine
    // @Test thì tương đương với main()
    // Nếu không có thì no runable method() error
    @Test
    public void tryJUnitComparation() {
        // Hàm này thử nghiệm việc so sánh expected vs actual
        // coi sai đúng ra màu như thế nào !!!
        // ta đang xài hàm của junit nhưng không xài bừa bãi mà phải theo quy tắc.
        // quy tắc định trước nằm ở @ - Annotation  

        Assert.assertEquals(2, 2);
    }



}
// CLASS NÀY DEV SẼ VIẾT NHỮNG CÂU LỆNH DÙNG ĐỂ TEST HÀM NÀY.
// CỦA CODE CHÍNH, TEST CÁC HÀM CỦA CLASS MATHUTIL 
// Trong class này sẽ có những lời gọi hàm getFactorial()
// có những lệnh để so sánh giữa expected và actual
// Giống như test bên main() những test đúng thì ra XANH - sai thì ra ĐỎ
// Nên không cần nhìn cái dòng output. Chỉ nhìn vào màu sắc
// Để có thể có được việc này ta phải sử dụng cái UNIT TESTING FRAMEWORK
//      JUnit, TestNG(Java)
//      xUnit, MSTest, NUnit(C#)
//      PHPUnit (PHP)

//      VIỆC VIẾT CODE ĐỂ TEST GỌI LÀ UNIT TESTING
//      ĐOẠN CODE TRONG CLASS NÀY CHỈ DÙNG JUNIT/UNIT TESTING FRAMEWORK ĐỂ KIỂM THỬ 
// HÀM CỦA CODE CHÍNH 
//      ĐOẠN CODE NÀY GỌI LÀ: TEST SCRIPT;
//      CODE DÙNG ĐỂ TEST CODE(chính) gọi là test script
//      Là các đoạn code được viết ra để test các code chính (dao, dto, controller, api)
//      Muốn test thì cần phải phát thảo các test case. Test script sẽ sử dụng các test case.

