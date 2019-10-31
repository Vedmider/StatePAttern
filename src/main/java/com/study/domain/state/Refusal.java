package com.study.domain.state;

import com.study.domain.Grant;

public class Refusal implements GrantState {
    private Grant grant;

    public Refusal(Grant grant){
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
        grant.setState(new Applied(grant));
        return "Successfully reapplied";
    }
}
