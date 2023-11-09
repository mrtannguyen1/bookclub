/*
   Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
Additional modifications by Nguyen, T. Student 2023
*/
package com.bookclub.service.dao;

import com.bookclub.model.WishlistItem;
import com.bookclub.service.GenericCrudDao;
import com.bookclub.service.GenericDao;

public interface WishlistDao extends GenericCrudDao<WishlistItem, String> {
}
