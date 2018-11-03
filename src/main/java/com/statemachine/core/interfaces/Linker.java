package com.statemachine.core.interfaces;

import java.util.List;
import java.util.Map;

public interface Linker {
    /**
     * The name should be unique to this linker.
     *
     * @return String: name of the Linker object
     */
    String getName();

    /**
     * This method adds a Stimulus->State relationship to the linker object,
     * This essentially makes the linker to change a state it is attached to,
     * to a different state(here the dest object). This means the State object the Linker
     * object is attached to will change state from the the state to dest state on inputting
     * the stimulus
     *
     * @param stimulus: Stimulus object
     * @param dest: State object
     * @return
     */
    void addStimulus(Stimulus stimulus, State dest);


    /**
     The function above addStimulus should be able to facilitate the
     the functions below, could be implemented by the classes if they need them
    **/
    // String addStimuli(List<Stimulus> stimuli, List<State> states);
    // String addStimuli(Map<Stimulus, State> stimulusToState);
}
