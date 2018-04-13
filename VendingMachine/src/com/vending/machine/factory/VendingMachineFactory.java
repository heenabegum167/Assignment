package com.vending.machine.factory;

import com.vending.machine.VendingMachine;
import com.vending.machine.impl.VendingMachineImpl;

public class VendingMachineFactory {      
    public static VendingMachine createVendingMachine() {
        return (VendingMachine) new VendingMachineImpl();
    }
}


