/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package all_insure;
import javax.swing.*;
public class All_Insure extends javax.swing.JFrame {
//    vinh code 
    public static Model backend = new Model();
    public static Controller controller;
//    

    public static Login log = new Login();
    public static SignUp sign = new SignUp();
    public static MainPage mainy = new MainPage();
    public static Obatin obtain = new Obatin();
    public static Question quest = new Question();
    public static Quote quote = new Quote();
    public static BookAppointment fin = new BookAppointment();
    public static Edit edit = new Edit();
    public static Purchase pur = new Purchase();
    public static MyStaff staff = new MyStaff();
    public static ActionItem actionItem = new ActionItem();

    
    // new added class
    public static ChatBot cb = new ChatBot();
    static ProductView productView = new ProductView();
    static CustDetailsStaff custDetail = new CustDetailsStaff();
    
    public static void main(String[] args) {
//       custDetail.setVisible(true);
        
        
       mainy.setVisible(true);
       sign.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       log.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       obtain.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       quest.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       quote.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       fin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       edit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       pur.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       staff.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       actionItem.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       
//       vinh code 
//        controller = new Controller(backend, log, sign, mainy, obtain, quote, fin, edit, pur, staff, actionItem);
       productView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       custDetail.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        controller = new Controller(backend, log, sign, mainy, obtain, quote, fin, edit, pur, staff, actionItem, custDetail, productView);
    }
    
    public static void reset(){
        quest = new Question();
        quest.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
    
    
    
}




//public class All_Insure {
////    public static Login log = new Login();
////    public static SignUp sign = new SignUp();
////    public static Model backend = new Model();
////    public static void main(String[] args) {
////       log.setVisible(true);
//////        backend = new Model();
////    }
//    
//    public static Login log = new Login();
//    public static SignUp sign = new SignUp();
//    public static MainPage mainy = new MainPage();
//    public static Obatin obtain = new Obatin();
//    public static Question quest = new Question();
//    public static Quote quote = new Quote();
//    public static BookAppointment fin = new BookAppointment();
//    public static Edit edit = new Edit();
//    
//    
//    public static Model backend = new Model();
//    public static Controller controller;
//    public static void main(String[] args) {
//       mainy.setVisible(true);
//       controller = new Controller(log, sign, backend);
//    }
//}
