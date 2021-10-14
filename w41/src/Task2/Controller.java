package Task2;

public class Controller {
    private Dialog dialog;
    private CalculateVat calculateVat;
    private View view;
    private int PRCVAT = 25;
    private String MSG = "MOMS";
    private String CURRENCY = "Kr";

    public Controller() {
        dialog = new Dialog();
        calculateVat = new CalculateVat(PRCVAT);
        view = new View(MSG, CURRENCY);
    }

    public void runController() {
        double userIn = dialog.doDiag();
        double moms = calculateVat.doVAT(userIn);
        view.doView(moms);
    }
}
