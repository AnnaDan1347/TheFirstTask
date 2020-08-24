package my.traning.project.flower.store.prices;

import my.traning.project.flower.store.model.Good;

import java.util.Map;

public class PriceList {
	public Map<Good, Integer> getPriceMap() {
		return priceMap;
	}

	public void setPriceMap(Map<Good, Integer> priceMap) {
		this.priceMap = priceMap;
	}

	Map<Good, Integer> priceMap;
}
