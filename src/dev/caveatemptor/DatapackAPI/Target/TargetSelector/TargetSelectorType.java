package dev.caveatemptor.DatapackAPI.Target.TargetSelector;

import dev.caveatemptor.DatapackAPI.Target.Target;


public enum TargetSelectorType implements Target {
    ALL_PLAYERS("@a"),
    NEAREST_PLAYER("@p"),
    RANDOM_PLAYER("@r"),
    /**
     * The entity executing the command.
     */
    SELF("@s");

    private final String selector;

    /**
     * Changes the selector based on the enum chosen.
     * @param selector The target selector type.
     */
    TargetSelectorType(String selector) {
        this.selector = selector;
    }


    /**
     * While named generate() to be consistent with the rest of the API, this simply returns selector.
     * @return The string representation of the target selector type.
     */
    public String generate() {
        return selector;
    }
}
