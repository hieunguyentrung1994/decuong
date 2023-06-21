import java.util.ArrayList;
import java.util.List;

public class Lists {
    /*

    Định nghĩa:
    - List là một giao diện (interface) trong Java mô tả các hoạt động liên quan đến danh sách.
     Các lớp cụ thể như ArrayList, LinkedList, Vector và Stack thực hiện giao diện này.
     List cung cấp một cách để lưu trữ và truy xuất dữ liệu theo thứ tự.
    Tính chất:
    1. Thứ tự: Phần tử trong List được lưu trữ theo thứ tự.
    2. Chứa phần tử trùng lặp: Một List có thể chứa các phần tử có giá trị trùng lặp.
    3. Đa dạng kiểu dữ liệu: List có thể chứa các phần tử có cùng hoặc khác kiểu dữ liệu.
    4. Các phần tử nằm cạnh nhau: Các phần tử trong List được lưu trữ liên tiếp trong bộ nhớ.
    các câu lênh thường dùng
    + add(element): Thêm một phần tử vào cuối danh sách.
    + add(index, element): Thêm một phần tử vào vị trí chỉ mục được chỉ định.
    + get(index): Truy cập phần tử ở vị trí chỉ mục được chỉ định.
    + set(index, element): Thay đổi giá trị của phần tử ở vị trí chỉ mục được chỉ định.
    + remove(index): Xóa phần tử ở vị trí chỉ mục được chỉ định.
    + size(): Trả về số lượng phần tử trong List.
    + isEmpty(): Kiểm tra xem List có trống hay không.

    */
    public static void main(String[] args) {


        // Khởi tạo một List kiểu Integer
        List<Integer> list = new ArrayList<>();

        // Thêm phần tử vào danh sách
        list.add(5);
        list.add(10);
        list.add(15);

        // Truy cập phần tử theo chỉ mục
        int element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // Xóa phần tử theo chỉ mục
        list.remove(0);

        // Sử dụng vòng lặp for-each để duyệt danh sách
        System.out.println("Elements in the list:");
        for (int num : list) {
            System.out.println(num);
        }

        // Kiểm tra số lượng phần tử trong danh sách
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // Kiểm tra xem danh sách có trống hay không
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
}
}