package com.study.domain.state;

import com.study.domain.Grant;

public class Withdrawal implements GrantState {
    private Grant grant;

    public Withdrawal(Grant grant) {
        this.grant = grant;
    }

    @Override
    public String use() {
        return "Reject";
    }

    @Override
    public String apply() {
        return "Reject";
    }

    @Override
    public String reapply() {
        return "Reject";
    }
}
