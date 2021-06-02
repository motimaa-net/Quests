package com.leonardobishop.quests.menu;

import com.leonardobishop.quests.listener.MenuController;
import com.leonardobishop.quests.player.QPlayer;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public interface QMenu {

    QPlayer getOwner();
    Inventory toInventory(int page);
    void handleClick(InventoryClickEvent event, MenuController controller);

}
