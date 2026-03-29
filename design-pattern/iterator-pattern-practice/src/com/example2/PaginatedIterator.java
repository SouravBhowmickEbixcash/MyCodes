package com.example2;

import java.util.List;

public class PaginatedIterator implements Iterator<Product>{
    private ProductCatalog catalog;
    private int pageSize;
    private List<Product> currentPage;
    private int pageIndex;
    private int globalOffset;
    private int pageNumber;
    
    public PaginatedIterator(ProductCatalog catalog, int pageSize) {
        // TODO: Initialize fields and load first page
    }

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product next() {
		// TODO Auto-generated method stub
		return null;
	}

    private void loadNextPage() {
        currentPage = catalog.getPage(globalOffset, pageSize);
        pageNumber++;
        System.out.println("Loading page " + pageNumber + "...");
        globalOffset += currentPage.size();
        pageIndex = 0;
    }
}
