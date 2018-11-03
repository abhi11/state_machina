package com.statemachine.core.interfaces;

import java.util.List;

public interface Stimulus {
    /**
     *
     * @return String: Name of the Stimulus, should be an unique identifier for the
     * Stimulus object.
     */
    String getName();

    /**
     * Given a state this should return the resulting states.
     * For a deterministic state machines one State should result in, therefore
     * there will be just one state in the returned List<>.
     * TODO: Implement the Undeterministic State Machine, this interface helps
     * TODO: us in supporting the Undeterministic SM, but there needs to be way to
     * TODO: keep track of the undeterministic state switches. !!!
     * @param st
     * @return List<State> it will return a list of State objects
     */
    // For deterministic state machines
    List<State> getResultingStates(State st);
}
