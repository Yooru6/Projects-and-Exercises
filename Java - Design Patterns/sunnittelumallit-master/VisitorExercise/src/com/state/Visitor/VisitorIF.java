package com.state.Visitor;

import com.state.human.Human;
import com.state.human.HumanState;

public interface VisitorIF {
    public void Visit(Human human);

}
