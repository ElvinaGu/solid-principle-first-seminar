package homework.model.util;

import dip1.model.ReportItem;
import homework.model.Entity;
import homework.model.User;

import java.util.List;

public class Report {

    public void report(Entity entity){
        System.out.println("Report for user: " + entity.getName());
    }
}
