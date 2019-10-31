package com.study.presentation;

import com.study.domain.Grant;
import com.study.domain.state.Approved;
import com.study.domain.state.Refusal;
import com.study.domain.state.Withdrawal;

public class ConsolePresentation {

    public static void main(String[] args) {
        System.out.println("This is program to demonstrate work of State pattern\n" +
                "\n .............\n");
        Grant grant = new Grant("Harvard study. CS50 course", 500_000);
        System.out.println(grant.apply());

        grant.setState(new Approved(grant));
        System.out.println(grant.use());
        System.out.println(grant.use());
        System.out.println(grant.apply());
        System.out.println(grant.reapply());

        grant.setState(new Refusal(grant));
        System.out.println(grant.reapply());
    }
}
