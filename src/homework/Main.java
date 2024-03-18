package homework;

import homework.model.User;
import homework.model.Entity;
import homework.model.util.Report;
import homework.model.util.Saver;

public class Main{
    public static void main(String[] args){
        Entity entity = new User("Bob");
        Saver saver = new Saver();
        Report report = new Report();
        report.report(entity);
        saver.save(entity);

    }
}