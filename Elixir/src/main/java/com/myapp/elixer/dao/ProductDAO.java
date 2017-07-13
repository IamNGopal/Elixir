package com.myapp.elixer.dao;

import com.myapp.elixer.entity.Product;
import com.myapp.elixer.model.PaginationResult;
import com.myapp.elixer.model.ProductInfo;

public interface ProductDAO {

	public Product findProduct(String code);

	public ProductInfo findProductInfo(String code);

	public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage);

	public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage, String likeName);

	public void save(ProductInfo productInfo);

}