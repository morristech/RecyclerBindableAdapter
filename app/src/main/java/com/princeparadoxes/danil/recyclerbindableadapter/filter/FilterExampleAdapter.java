package com.princeparadoxes.danil.recyclerbindableadapter.filter;

import android.view.View;

import com.princeparadoxes.danil.recyclerbindableadapter.FilterBindableAdapter;
import com.princeparadoxes.danil.recyclerbindableadapter.R;

/**
 * Created by Danil on 02.10.2015.
 */
public class FilterExampleAdapter extends FilterBindableAdapter<String, FilterViewHolder> {

    public FilterExampleAdapter() {
        super();
    }

    @Override
    protected String itemToString(String item) {
        return item;
    }

    @Override
    protected int layoutId(int type) {
        return R.layout.filter_example_item;
    }

    @Override
    protected int getItemType(int position) {
        return 0;
    }

    @Override
    protected void onBindItemViewHolder(FilterViewHolder viewHolder, final int position, int type) {
        viewHolder.bindView(getItem(position));
    }

    @Override
    protected FilterViewHolder viewHolder(View view, int type) {
        return new FilterViewHolder(view);
    }
}