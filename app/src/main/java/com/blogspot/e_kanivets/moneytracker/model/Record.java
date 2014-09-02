package com.blogspot.e_kanivets.moneytracker.model;

import android.util.Log;

import com.blogspot.e_kanivets.moneytracker.helper.MTHelper;
import com.blogspot.e_kanivets.moneytracker.util.Constants;

/**
 * Created by eugene on 01/09/14.
 */
public class Record {

    private int id;
    private long time;
    private int type;
    private String title;
    private int categoryId;
    private String category;
    private int price;

    public Record(int id, long time, int type, String title, int categoryId, int price) {
        this.id = id;
        this.time = time;
        this.type = type;
        this.title = title;
        this.categoryId = categoryId;
        this.price = price;

        category = MTHelper.getInstance().getCategoryById(categoryId);

        Log.d(Constants.TAG, "id = " + categoryId + " category = " + category);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    public long getTime() {
        return time;
    }

    public boolean isIncome() {
        return type == 0;
    }
}
