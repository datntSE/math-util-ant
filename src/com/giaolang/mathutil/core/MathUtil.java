/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author datnt
 */
// Đây là class mô phỏng lại các hàm tiện ích / dùng chung cho mọi class khác.
// Mô phỏng lại class tiện ích java.Math của JDK
// Phàm cái gì là đồ dùng chung sẽ được thiết kế là static.
public class MathUtil {

    public static final double PI = 3.1415;

    // Hàm tiện ích tính n! = 1.2.3....n
    // Lưu ý/ quy ước.
    // - Không tính giai thừa số âm!1
    // 0! = 1! = 1;
    // Vì giai thừa tăng cực nhanh, nên 21! đã vượt quá 18 số 0
    // tràn kiểu long.
    // Ta không tính 21! trở lên
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0 - 20");
        
        if (n == 0 || n == 1) 
            return 1;
        

        // CẤM KHÔNG XÀI ELSE NỮA KHI HÀM ĐÃ CÓ RETURN PHÍA TRƯỚC;
        long product = 1; // accumunication variable;
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
    
    //TEST CASE: Là 1 tình huống kiểm thử chức năng app/ feature khi đó ta phải
    // - đưa vào data mẫu để test
    // - đưa ra giá trị kì vọng mà ta mong muốn app/ feature đó return.
    
    
    // Khái niệm TDD - Test Driven Development.
    // Là kĩ thuật lập trình/ áp dụng cho dân DEV để inscrease
    // Chất lượng/ giảm thiểu công sức tìm bug/ phát hiện bug sớm.
    // TDD yêu cầu dev khi viết code/ viết hàm/ class phải viết luôn.
    // Cách sử dụng hàm này/ viết luôn.
    // Các bộ kiểm thử/ viết luôn các test cases/ viết luôn các đoạn code
    // dùng trong thử hàm/ class để kiểm tra các tính đúng đắn của hàm/ class
    //viết code/ kèm luôn viết test cases
    // viết code(development) có ý thức(driven), viết luôn phần kiểm thử(test) hàm/code
    // SAU KHI CÓ được tên hàm(chỉ tên hàm), viết luôn các tình huống xài hàm
    // CHẤP nhận khi chạy hàm sai - DO CODE CHƯA XONG
    // SAU đó ta tối ưu/ chỉnh sửa code để đảm bảo code chạy đúng!!
    // Quá trình SAI - ĐÚNG - SAI - ĐÚNG. diễn ra liên tục (cycle).
}
