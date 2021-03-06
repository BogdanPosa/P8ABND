package com.example.android.inventoryappstage1.data;


import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;


public class InventoryContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.

    public InventoryContract() {
    }

    public static final String CONTENT_AUTHORITY = "com.example.android.books";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_BOOKS = "inventory";

    public static final class InventoryEntry implements BaseColumns {

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_BOOKS);

        public static final String CONTENT_LIST_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BOOKS;
        public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_BOOKS;

        public static final String TABLE_NAME = "books";

        public final static String _ID = BaseColumns._ID;
        public final static String PRODUCT_NAME = "product";
        public final static String PRODUCT_PRICE = "price";
        public final static String PRODUCT_QUANTITY = "quantity";
        public final static String PRODUCT_SUPPLIER_NAME = "supplier";
        public final static String PRODUCT_SUPPLIER_PHONE = "phone";
    }
}