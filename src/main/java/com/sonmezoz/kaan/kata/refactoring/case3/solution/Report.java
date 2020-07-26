package com.sonmezoz.kaan.kata.refactoring.case3.solution;

import com.sonmezoz.kaan.kata.refactoring.case3.Machine;
import com.sonmezoz.kaan.kata.refactoring.case3.Robot;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class Report {
    public static void report(Writer out, List<Machine> machines, Robot robot) throws IOException {
        out.write("FACTORY REPORT\n");

        reportMachines(out, machines);
        reportRobot(out, robot);

        out.write("========\n");
    }

    private static void reportMachines(Writer out, List<Machine> machines) throws IOException {
        for (Machine machine : machines) {
            out.write("Machine " + machine.name());
            reportField(out, "bin", machine.bin());
            out.write("\n");
        }

        out.write("\n");
    }

    private static void reportRobot(Writer out, Robot robot) throws IOException {
        out.write("Robot");

        reportField(out, "location", robot.location().name());
        reportField(out, "bin", robot.bin());

        out.write("\n");
    }

    private static void reportField(Writer out, String fieldName, String value) throws IOException {
        if (value != null) {
            out.write(String.format(" %s=%s", fieldName, value));
        }
    }
}