package dip1.model;

import java.util.List;

public class ReportManager{

    Printable printable;

    public ReportManager(Printable printable) {
        this.printable = printable;
    }

    public void toOutput(List<ReportItem> items) {
        printable.output(items);
    }
}
