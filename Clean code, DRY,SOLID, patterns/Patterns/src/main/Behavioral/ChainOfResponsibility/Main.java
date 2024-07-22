package org.example.Behavioral.ChainOfResponsibility;

import org.example.Behavioral.ChainOfResponsibility.Trimmers.NumberFilter;
import org.example.Behavioral.ChainOfResponsibility.Trimmers.PointFilter;
import org.example.Behavioral.ChainOfResponsibility.Trimmers.SpaceFilter;
import org.example.Behavioral.ChainOfResponsibility.Trimmers.StringFilter;

public class Main {

    public static void main(String[] args) {
        StringFilter numberTrimmer = new NumberFilter();
        StringFilter pointTrimmer = new PointFilter();
        StringFilter spaceTrimmer = new SpaceFilter();

        numberTrimmer.setNext(pointTrimmer);
        pointTrimmer.setNext(spaceTrimmer);

        String trimmed = numberTrimmer
                .trim(".5 8T.01h.4 .. is_ .i s _e8 .x405a. 9m124. 123p6le.");
        System.out.println(trimmed);
    }
}
