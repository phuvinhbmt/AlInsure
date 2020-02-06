package all_insure;

/**
 *
 * @author Vinh
 */
public class View {
//    variable declarations
    public  SignInFrame log = new SignInFrame();
    public  SignUpFrame sign = new SignUpFrame();
    public  MainPageFrame mainy = new MainPageFrame();
    public  ObtainQuoteFrame obtain = new ObtainQuoteFrame();
    public  QuestionFrame quest = new QuestionFrame();
    public  QuoteSelectionFrame quote = new QuoteSelectionFrame();
    public  BookApmFrame fin = new BookApmFrame();
    public  EditAccFrame edit = new EditAccFrame();
    public  PurchaseMethodFrame pur = new PurchaseMethodFrame();
    public  StaffFrame staff = new StaffFrame();
    public  ActionItemFrame actionItem = new ActionItemFrame();

    public View(SignInFrame log, SignUpFrame signup, MainPageFrame mainy, ObtainQuoteFrame obtain, QuestionFrame quest, QuoteSelectionFrame quote, BookApmFrame fin, EditAccFrame edit, PurchaseMethodFrame pur, StaffFrame staff, ActionItemFrame actionItem) {
        this.log = log;
        this.sign = signup;
        this.mainy = mainy;
        this.obtain = obtain;
        this.quest = quest;
        this.quote = quote;
        this.fin = fin;
        this.edit = edit;
        this.pur = pur;
        this.staff = staff;
        this.actionItem = actionItem;
        
    }

    
    
}
