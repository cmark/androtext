package hu.bme.mit.androtext.lang.attributes;

import static com.google.common.collect.Lists.newArrayList;

import com.google.common.collect.Iterables;

public class AndroidAttributeList {

	// VIEW XML ATTRIBUTES
	public static final Iterable<String> VIEW_ATTRIBUTES = newArrayList(
			"alpha", "background", "clickable", "contentDescription",
			"fadeScrollbars", "padding", "paddingBottom", "paddingLeft",
			"paddingRight", "paddingTop", "visibility", "isScrollContainer");

	public static final Iterable<String> TEXTVIEW_ATTRIBUTES = Iterables
			.concat(VIEW_ATTRIBUTES,
					newArrayList("autoLink", "autoText", "capitalize",
							"digits", "editable", "ems", "gravity", "height",
							"hint", "singleLine", "textAppearance",
							"textColor", "textSize", "typeface", "numeric",
							"password", "phoneNumber", "textStyle"));
	
	public static final Iterable<String> GRIDVIEW_ATTRIBUTES = Iterables
			.concat(VIEW_ATTRIBUTES,
					newArrayList("columnWidth", "horizontalSpacing", "verticalSpacing",
							"numColumns", "stretchMode", "gravity"));
	
	public static final Iterable<String> LINEARLAYOUT_ATTRIBUTES = Iterables.concat(VIEW_ATTRIBUTES,
					newArrayList("gravity"));
	
	public static final Iterable<String> RELATIVELAYOUT_ATTRIBUTES = Iterables.concat(VIEW_ATTRIBUTES,
			newArrayList("gravity"));
	
	public static final Iterable<String> TABLELAYOUT_ATTRIBUTES = Iterables.concat(VIEW_ATTRIBUTES,
			newArrayList("shrinkColumns", "collapseColumns", "stretchColumns"));
	
	public static final Iterable<String> EDITTEXT_ATTRIBUTES = TEXTVIEW_ATTRIBUTES;
	
	// XML LAYOUTPARAMS
	public static final Iterable<String> VIEWGROUP_LAYOUTPARAMS = newArrayList(
			"layout_height", "layout_width");
	public static final Iterable<String> VIEWGROUP_MARGINLAYOUTPARAMS = Iterables
			.concat(VIEWGROUP_LAYOUTPARAMS,
					newArrayList("layout_marginLeft", "layout_marginTop",
							"layout_marginRight", "layout_marginBottom"));
	public static final Iterable<String> LINEARLAYOUT_LAYOUTPARAMS = Iterables
			.concat(VIEWGROUP_MARGINLAYOUTPARAMS,
					newArrayList("layout_gravity", "layout_weight"));
	public static final Iterable<String> TABLELAYOUT_LAYOUTPARAMS = LINEARLAYOUT_LAYOUTPARAMS;
	public static final Iterable<String> TABLEROW_LAYOUTPARAMS = Iterables
			.concat(LINEARLAYOUT_LAYOUTPARAMS,
					newArrayList("layout_span", "layout_column"));
	public static final Iterable<String> RELATIVELAYOUT_LAYOUTPARAMS = Iterables
			.concat(VIEWGROUP_MARGINLAYOUTPARAMS,
					newArrayList("layout_above", "layout_alignBaseline",
							"layout_alignBottom", "layout_alignLeft",
							"layout_alignParentLeft", "layout_alignParentTop",
							"layout_alignParentRight",
							"layout_alignParentBottom", "layout_alignTop",
							"layout_alignRight",
							"layout_alignWithParentIfMissing", "layout_below",
							"layout_centerHorizontal", "layout_centerInParent",
							"layout_centerVertical", "layout_toLeftOf",
							"layout_toRightOf"));
	public static final Iterable<String> FRAMELAYOUT_LAYOUTPARAMS = Iterables
			.concat(VIEWGROUP_MARGINLAYOUTPARAMS,
					newArrayList("layout_gravity"));
}
