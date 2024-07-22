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
                .trim("4. 54.П 2р.32и  .в4. . е 6. т 1 2.");
        System.out.println(trimmed);
    }
}
