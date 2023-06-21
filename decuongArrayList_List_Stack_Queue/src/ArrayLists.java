

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {


/*
    ArrayList là một lớp cung cấp một mảng động có thể mở rộng và thu hẹp kích thước dựa trên nhu cầu.
     Với ArrayList, không cần khai báo kích thước ban đầu và nó tự động tăng kích thước khi cần thiết.
 Định nghĩa:
    - ArrayList là một cấu trúc dữ liệu tương tự mảng mà có thể thay đổi kích thước.
    -  Nó cung cấp các phương thức để thêm, xóa, truy cập và tìm kiếm phần tử trong danh sách.
 Tính chất:
    1 Lưu trữ dữ liệu liên tiếp: Các phần tử trong ArrayList được lưu trữ liên tiếp trong bộ nhớ.
    2 Động kích thước: ArrayList có thể thay đổi kích thước động theo nhu cầu.
       Khi thêm phần tử mới vào ArrayList và không còn đủ dung lượng, nó sẽ tự động tăng kích thước của mình.
    3 Chứa các phần tử trùng lặp: Một ArrayList có thể chứa các phần tử có giá trị trùng lặp.
    4 Hỗ trợ truy cập ngẫu nhiên: ArrayList cho phép truy cập phần tử dựa trên chỉ mục, cho phép truy cập ngẫu nhiên và
       tìm kiếm phần tử.
 các câu lênh thường dùng
    + add(element): Thêm một phần tử vào cuối danh sách.
    + add(index, element): Thêm một phần tử vào vị trí chỉ mục được chỉ định.
    + get(index): Truy cập phần tử ở vị trí chỉ mục được chỉ định.
    + set(index, element): Thay đổi giá trị của phần tử ở vị trí chỉ mục được chỉ định.
    + remove(index): Xóa phần tử ở vị trí chỉ mục được chỉ định.
    + size(): Trả về số lượng phần tử trong ArrayList.
    + isEmpty(): Kiểm tra xem ArrayList có trống hay không.
    + contains(element): Kiểm tra xem ArrayList có chứa phần tử được chỉ định hay không.
    + indexOf(element): Trả về chỉ mục đầu tiên của phần tử được chỉ định trong ArrayList. Nếu không tìm thấy, trả về -1.

    */


    // Khởi tạo một ArrayList kiểu Integer
        ArrayList<Integer> numbers = new ArrayList<>();

    // Thêm phần tử vào ArrayList
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

    // Truy cập phần tử trong ArrayList
        int firstElement = numbers.get(0);
        System.out.println("First element: "+firstElement);

    // Xóa phần tử khỏi ArrayList
        numbers.remove(1);

    // Duyệt qua các phần tử trong ArrayList
        for(
        int i = 0; i<numbers.size();i++)

    {
        int number = numbers.get(i);
        System.out.println("Element at index " + i + ": " + number);
    }
        // Khởi tạo một ArrayList kiểu String
        List<String> arrayList = new ArrayList<>();

        // Thêm phần tử vào danh sách
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Truy cập phần tử theo chỉ mục
        String element = arrayList.get(1);
        System.out.println("Element at index 1: " + element);

        // Xóa phần tử theo chỉ mục
        arrayList.remove(0);

        // Sử dụng vòng lặp for-each để duyệt danh sách
        System.out.println("Elements in the ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Kiểm tra số lượng phần tử trong danh sách
        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size);

        // Kiểm tra xem danh sách có trống hay không
        boolean isEmpty = arrayList.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // Kiểm tra xem danh sách có chứa phần tử cụ thể hay không
        boolean contains = arrayList.contains("Banana");
        System.out.println("Does the ArrayList contain 'Banana'? " + contains);

        // Tìm vị trí (chỉ mục) đầu tiên của phần tử trong danh sách
        int index = arrayList.indexOf("Orange");
        System.out.println("Index of 'Orange': " + index);

}
}
