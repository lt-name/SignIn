package org.badfish.signin.panel;

import cn.nukkit.Player;
import cn.nukkit.inventory.InventoryHolder;
import org.badfish.signin.panel.lib.DoubleChestFakeInventory;

/**
 * @author BadFish
 */
public class ChestInventoryPanel extends DoubleChestFakeInventory {

    ChestInventoryPanel(InventoryHolder holder, String name) {
        super(holder);
        this.setName(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

}
