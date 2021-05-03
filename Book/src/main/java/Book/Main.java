package Book;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Main {
//    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        ArrayList<Book> arrayOfBooks = new ArrayList<>();
//        System.out.println("ban muon lam gi ?");
//        System.out.println(" 1. them sach ");
//        System.out.println("2. thong tin nhung cuon sach da them");
//        System.out.println("3. dang co bao nhieu cuon sach ");
//        Scanner input = new Scanner(System.in);
//        int luaChon = input.nextInt();
//        System.out.print("in ra so da nhap : " + luaChon);
//        switch (luaChon){
//            case 1 :
//                Scanner in = new Scanner(System.in);
//                System.out.println(" nhap ten cuon sach, nhap ten tac gia, nhap so trang sach");
//                String name = in.nextLine();
//                String author = in.nextLine();
//                int numberOfPage = in.nextInt();
//                Book book = new Book(name, author, numberOfPage);
//                arrayOfBooks.add(book);
//                break;
//            case 2 :
//                showNames(arrayOfBooks);
//                showTotalNumberOfPages(arrayOfBooks);
//                break;
///            case 3 :
//                showNumberOfCurrentBook(arrayOfBooks);
//                break;
//            default :       
//            System.out.print("khong co lua chon nay");
//            break;
//        }
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }   
//    
////    
////    public static void showNames( ArrayList<Book> arr){
////        int i;
//        for (i = 0; i <= arr.size(); i++){
//            Book a = arr.get(i);
//            String b = a.getName(a);
//            System.out.println("ten nhung quyen sach la :" + b + "\n");
//        } 
//    }
//    
//    
//    public static void showTotalNumberOfPages(ArrayList<Book> arr){
//        int i;
//        int tong = 0;
//        for (i = 0; i <= arr.size(); i++){
//            Book a = arr.get(i);
//            int b = a.getNumberOfPage(a);   
//            tong += b;
//        }
//         System.out.println("tong so trang sach la :" + tong);
//    }
//    
//    public static void showNumberOfCurrentBook(ArrayList<Book> arr){
//        Book a = arr.get(0);
//        int b = a.numberOfBook;
//        System.out.println("number of current books is" + b);
//    }
//    
//    
//    public int checkSize(ArrayList<Book> arr){
//        int a = arr.size();
//        if(a>10){
//            return 1;
//        } else {
//            return 0;
//        }
//    }
}

