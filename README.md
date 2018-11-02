# Experimental: For Fun, Not usable

## State Machina

A simple state machine, which revolves around three basic classes State, Stimulus, and Linker.
Basically a state machine should have states, and then a way to link the states together with 
the various stimuli. These links should have direction to specify the the direct of change in the 
states. That is, `State1` -> `Stimulus0` -> `State2` is different from `State1` <- `Stimulus0` <- `State2`, and both of 
these are different from `State1` <- `Stimulus0` -> `State2`.

The first one says, `Stimulus0` when applied to `State1` changes it to `State2`, similarly the second one says 
`Stimulus0` when applied to `State2` causes a state shift to `State1`, and the last one is bi-directional where both
the first and second instances are valid.   
   