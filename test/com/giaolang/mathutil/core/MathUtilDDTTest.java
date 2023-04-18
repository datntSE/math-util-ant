/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.giaolang.mathutil.core;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author datnt
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    // Phải phân tích value của expected và atual để chuẩn bị data
    // Chuẩn bị data, mảng 2 chiều vì nó có n đưa vào và expected[2]
    // mảng 2 chiều [7][2]
    @Parameterized.Parameters
    public static Object[][] initData() {
        int c[][] = {{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}
        };
        return new Integer[][]{{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}
        };
    } // Xài WAPPER CLASS nếu chơi với số, ví dụ Integer(int) Long(long);
    // Sau khi có bộ data qua mảng 2 chiều, JUNIT sẽ tự loop để lôi ra cặp value
    // (1, 0) (1, 1) (2, 2) (6, 3)....
    // Nhưng nhồi = cách nào, gán value vào biến nào ?
    // Gán vào biến - GỌI LÀ THAM SỐ HÓA PARAMATERIZED
    // TA SẼ MAP 2 cột với 2 biến: Cột 0 - Expected
    //                             Cột 1 - N đưa vào hàm GetF()
    
    @Parameterized.Parameter(value = 0)
    public long expected;
    @Parameterized.Parameter(value = 1)
    public int n;
    
    // TEST thôi
    @Test
    public void testFactorialGivenRightAgurmentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
} 

// Trong test script sẽ có những tình huống xài app, đưa data cụ thể vào
// chờ xem hàm xử lý kết quả có như kì vọng hay không ?
// Một test script sẽ chứa nhiều TEST CASE
//  Mỗi TEST CASE tương ứng với 1 tình huống xài hàm.
// Phân tích test script cũ 
// Trong test script cũ xuất hiện bad smell, sự trùng lặp về câu lệnh.

// Nếu ta tách được data toàn bộ data trong các câu lệnh ở trên ra 1 chỗ riêng 
// biệt như hàng và cột ở trên, sau đó.
// ta chỉ việc pick, lấy tỉa data này nạp dần vào các lệnh gọi hàm thì ta sẽ được:
// - Code gọn gàn hơn không bị trùng lặp,
// - Nhìn tổng quan biết có bao nhiêu test case và liệu rằng chúng ta đã đủ hay chưa ? 
// Kĩ thuật viết TEST SCRIPT (Câu lệnh test) mà tách biệt data ra khỏi lệnh so sánh
// được gọi bằng những tên sau:
// - PARAMATERIZED - THAM SỐ HÓA, BIẾN DATA RA 1 CHỖ, ĐẶT CHO CHÚNG CÁI TÊN BIẾN,
// ĐỂ 1 HỒI NHỒI CHÚNG LẠI BÊN TRONG LỆNH SO SÁNH.
// - DDT - DATA DRIVEN TESTING VIẾT CODE KIỂM THỬ THEO STYLE TÁCH DATA 
// JUNIT FW HỖ TRỢ SẴN TA TÁCH DATA, DUYỆT VÒNG FOR TRÊN DATA NHỒI VÀO HÀM TƯƠNG ỨNG.
// ĐỂ CHƠI VỚI DDT TA CẦN:
// - Tách data ra 1 chỗ - MẢNG
// - MAP cái data này vào các biến tương ứng.
// - Nhồi các biến tương ứng này vào câu lệnh so sánh/ gọi hàm.
