package com.sgitario.android.layoutgridview.events;

import com.sgitario.android.layoutgridview.AbsLayoutContainer;
import com.sgitario.android.layoutgridview.model.LayoutItem;

public interface OnItemClickListener {

	/**
	 * Callback method to be invoked when an item in this AdapterView has
	 * been clicked.
	 * <p>
	 * Implementers can call getItemAtPosition(position) if they need to
	 * access the data associated with the selected item.
	 * 
	 * @param parent
	 *            The AdapterView where the click happened.
	 * @param view
	 *            The view within the AdapterView that was clicked (this
	 *            will be a view provided by the adapter)
	 * @param position
	 *            The position of the view in the adapter.
	 * @param id
	 *            The row id of the item that was clicked.
	 */
	void onItemClick(AbsLayoutContainer parent, LayoutItem proxy);
}
