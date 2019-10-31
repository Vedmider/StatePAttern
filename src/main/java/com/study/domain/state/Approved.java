package com.study.domain.state;

import com.study.domain.Grant;

public class Approved implements GrantState {
    private Grant grant;

    public Approved(Grant grant) {
        this.grant = grant;
    }

    @Override
    public String use() {
        grant.setState(new Closed(grant));
        return "Grant successfully used";
    }

    @Override
    public String apply() {
        return "Rejected";
    }

    @Override
    public String reapply() {
        return "You loosed grant";
    }
}
