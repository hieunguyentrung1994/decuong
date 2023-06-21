import java.util.Queue;
import java.util.LinkedList;
public class Queues {
    /*
    *
    * Định nghĩa:
    *  Queue là một cấu trúc dữ liệu dạng hàng đợi (FIFO - First In, First Out),
        trong đó phần tử được thêm vào trước là phần tử được lấy ra trước.
        Nó hoạt động tương tự như hàng đợi thực tế, ví dụ như hàng đợi tại quầy mua vé.

      Tính chất:
        Thứ tự:     Phần tử được thêm vào đầu hàng đợi là phần tử đầu tiên được lấy ra.
        Chức năng:  Thêm phần tử vào cuối hàng đợi, lấy phần tử từ đầu hàng đợi.
        FIFO:       Phần tử đầu tiên được thêm vào là phần tử đầu tiên được lấy ra.

      Các phương thức quan trọng:
       + add(element): Thêm một phần tử vào cuối hàng đợi.
       + offer(element): Thêm một phần tử vào cuối hàng đợi. Trả về true nếu thêm thành công,
          ngược lại trả về false.
       + remove(): Lấy và xóa phần tử từ đầu hàng đợi. Nếu hàng đợi trống,
         ném ra ngoại lệ NoSuchElementException.
       + poll(): Lấy và xóa phần tử từ đầu hàng đợi. Trả về null nếu hàng đợi trống.
       + peek(): Xem phần tử đầu hàng đợi mà không xóa nó. Trả về null nếu hàng đợi trống.
       + isEmpty(): Kiểm tra xem hàng đợi có trống hay không. Trả về true nếu hàng đợi trống,
         ngược lại trả về false.
       + size(): Trả về số lượng phần tử trong hàng đợi.*/
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

    // Thêm phần tử vào Queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

    // Lấy phần tử từ Queue
        String firstElement = queue.poll();
        System.out.println("First element: " + firstElement);

    // Xem phần tử đầu tiên mà không xóa nó
        String peekElement = queue.peek();
        System.out.println("Peek element: " + peekElement);

    // Kiểm tra xem Queue có trống hay không
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is queue empty? " + isEmpty);
    }
}
