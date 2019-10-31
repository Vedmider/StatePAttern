package com.study.domain.state;

import com.study.domain.Grant;

public class Closed implements GrantState {
    private Grant grant;

    public Closed(Grant grant) {
        this.grant = grant;
    }

    @Override
    public String use() {
        return "Rejected";
    }

    @Override
    public String apply() {
        return "Rejected";
    }

    @Override
    public String reapply() {
        return "Rejected";
    }
}
