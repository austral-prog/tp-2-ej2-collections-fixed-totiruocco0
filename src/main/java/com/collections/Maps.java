package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class    Maps {

    public Map<String, Integer> createInventory(List<String> items) {
        Map<String,Integer> inventory = new HashMap<>();
        for (int i = 0 ; i < items.size() ; i++) {
            if (inventory.containsKey(items.get(i))) {
                inventory.put(items.get(i), inventory.get(items.get(i)) + 1);
            }else{
                inventory.put(items.get(i), 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        for (int i = 0 ; i < items.size() ; i++) {
            if (inventory.containsKey(items.get(i))) {
                inventory.put(items.get(i), inventory.get(items.get(i)) + 1);
            }else{
                inventory.put(items.get(i), 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.containsKey(item) && inventory.get(item) > 0) {
                inventory.put(item, inventory.get(item) - 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        // todo: Implement the logic to remove an item from the inventory if it matches the item string
        for (int i = 0 ; i < inventory.size() ; i++) {
            if (inventory.containsKey(item)) {
                inventory.remove(item);
                return inventory;
            }
        }
        return inventory;
    }

     public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        if (inventory == null) {
            throw new IllegalArgumentException("El inventario no puede ser nulo.");
        }
        List<Map.Entry<String, Integer>> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > 0) {
                result.add(entry);
            }
        }
        return result;
    }
}