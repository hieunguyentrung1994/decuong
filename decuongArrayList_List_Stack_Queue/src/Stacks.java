import java.util.Stack;
public class Stacks {
    /*

    * Định nghĩa:
    Stack là một cấu trúc dữ liệu dạng ngăn xếp (LIFO - Last In, First Out),
     trong đó phần tử cuối cùng được thêm vào là phần tử đầu tiên được lấy ra.
    Tính chất:
       Thứ tự:      Phần tử cuối cùng được thêm vào (đỉnh ngăn xếp) là phần tử đầu tiên được lấy ra.
       Chức năng:   Đẩy phần tử vào đỉnh ngăn xếp, lấy phần tử từ đỉnh ngăn xếp.
       LIFO:        Phần tử cuối cùng được thêm vào là phần tử đầu tiên được lấy ra.
    các câu lênh thường dùng
   + push(element): Đẩy một phần tử vào đỉnh ngăn xếp.
   + pop(): Lấy và xóa phần tử từ đỉnh ngăn xếp.
            Nếu ngăn xếp trống, ném ra ngoại lệ EmptyStackException.
   + peek(): Xem phần tử trên đỉnh ngăn xếp mà không xóa nó. Nếu ngăn xếp trống,
            ném ra ngoại lệ EmptyStackException.
   + isEmpty():Kiểm tra xem ngăn xếp có trống hay không.
                Trả về true nếu ngăn xếp trống, ngược lại trả về false.
   + size(): Trả về số lượng phần tử trong ngăn xếp.
            */
    public static void main(String[] args) {
    // Khởi tạo một Stack kiểu Integer
        Stack<Integer> stack = new Stack<>();

    // Đẩy phần tử vào Stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

    // Lấy phần tử từ Stack
        int topElement = stack.pop();
        System.out.println("Top element: " + topElement);

    // Xem phần tử trên cùng mà không xóa nó
        int peekElement = stack.peek();
        System.out.println("Peek element: " + peekElement);

    // Kiểm tra xem Stack có trống hay không
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}
