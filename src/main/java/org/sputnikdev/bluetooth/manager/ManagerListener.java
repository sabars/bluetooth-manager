package org.sputnikdev.bluetooth.manager;

/**
 * A listener that is used to subscribe for some internal bluetooth manager events.
 */
@FunctionalInterface
public interface ManagerListener {

    /**
     * Notifies when a governor becomes ready or otherwise.
     * @param governor a bluetooth governor
     * @param ready true if ready, false otherwise
     */
    void ready(BluetoothGovernor governor, boolean ready);

    /**
     * Notifies when the bluetooth manager gets disposed.
     */
    default void disposed() { }

}
