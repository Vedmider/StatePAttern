package com.study.domain;

import com.study.domain.state.Created;
import com.study.domain.state.GrantState;

public class Grant {
    private int moneyAmount;
    private String purpose;
    private GrantState state;

    public Grant(String purpose, int moneyAmount) {
        this.purpose = purpose;
        this.moneyAmount = moneyAmount;
        state = new Created(this);
    }


    public void setState(GrantState state) {
        this.state = state;
    }

    public GrantState getState() {
        return state;
    }

    public String apply(){
        return state.apply();
    }

    public String reapply(){
        return state.reapply();
    }

    public String use(){
        return state.use();
    }

}
