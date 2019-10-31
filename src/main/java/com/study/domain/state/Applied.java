package com.study.domain.state;

import com.study.domain.Grant;

public class Applied implements GrantState {
    private Grant grant;

    public Applied( Grant grant) {
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
