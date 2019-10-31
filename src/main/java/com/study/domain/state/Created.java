package com.study.domain.state;

import com.study.domain.Grant;

public class Created implements GrantState {
    private Grant grant;

    public Created(Grant grant) {
        this.grant = grant;
    }

    @Override
    public String use() {
        return "Rejected";
    }

    @Override
    public String apply() {
        grant.setState(new Applied(grant));
        return "Applied";
    }

    @Override
    public String reapply() {
        return "Rejected";
    }
}
