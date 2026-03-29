package com.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductCatalog {
	
	private List<Product> products;
	
	public ProductCatalog () {
		this.products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
	
    public List<Product> getPage(int offset, int limit) {
        int end = Math.min(offset + limit, products.size());
        if (offset >= products.size()) return Collections.emptyList();
        return products.subList(offset, end);
    }
    
    public int getTotalCount() { return products.size(); }

    public Iterator<Product> createPaginatedIterator(int pageSize) {
        return null;
    }
}
