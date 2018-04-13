package com.vending.machine;

import java.util.List;

import com.vending.machine.model.Bucket;
import com.vending.machine.model.Coin;
import com.vending.machine.model.Item;

public interface VendingMachine {

	public long selectItemAndGetPrice(Item item); 
	public void insertCoin(Coin coin);
	public List<Coin> refund(); 
	public Bucket<Item, List<Coin>> collectItemAndChange(); 
	public void reset();

}
