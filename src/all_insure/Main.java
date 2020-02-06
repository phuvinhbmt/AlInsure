package all_insure;

import javax.swing.*;

public class Main extends javax.swing.JFrame {

    public static Model backend = new Model();
    public static Controller controller;

    public static SignInFrame signInFrm = new SignInFrame();
    public static SignUpFrame signUpFrm = new SignUpFrame();
    public static MainPageFrame mainPageFrm = new MainPageFrame();
    public static ObtainQuoteFrame obtainQuoteFrm = new ObtainQuoteFrame();
    public static QuestionFrame questionFrm = new QuestionFrame();
    public static QuoteSelectionFrame quoteSelectFrm = new QuoteSelectionFrame();
    public static BookApmFrame bookApmFrm = new BookApmFrame();
    public static EditAccFrame edit = new EditAccFrame();
    public static PurchaseMethodFrame purchaseFrm = new PurchaseMethodFrame();
    public static StaffFrame staffFrm = new StaffFrame(); // Main page for staffFrm user
    public static ActionItemFrame actionItemFrm = new ActionItemFrame();

    // new added class
    public static ChatBot cb = new ChatBot();
    static ProductView productView = new ProductView();
    static CustDetailsStaff custDetail = new CustDetailsStaff();

    public static void main(String[] args) {
//       custDetail.setVisible(true);
        mainPageFrm.setVisible(true);
        signUpFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        signInFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        obtainQuoteFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        questionFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        quoteSelectFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        bookApmFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        edit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        purchaseFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        staffFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        actionItemFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        productView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        custDetail.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        controller = new Controller(backend, signInFrm, signUpFrm, mainPageFrm, obtainQuoteFrm, quoteSelectFrm, bookApmFrm, edit, purchaseFrm, staffFrm, actionItemFrm, custDetail, productView);
    }

    public static void reset() {
        questionFrm = new QuestionFrame();
        questionFrm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}
