package se.sunkingofthemind.assignment3.xmlparser;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import se.sunkingofthemind.assignment3.R;
import se.sunkingofthemind.assignment3.model.Journey;
import se.sunkingofthemind.assignment3.view.TestActivity;
import java.util.ArrayList;

public class MyAdapter extends BaseExpandableListAdapter {
    private ArrayList<Journey> myItems;
        private Context c;

    public MyAdapter(Context c,ArrayList<Journey> myItems){
        this.c=c;
        this.myItems = myItems;
    }

    @Override
    public int getGroupCount() {
        return myItems.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        Log.i("adapter","group");
        LayoutInflater li = (LayoutInflater) this.c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = li.inflate(R.layout.groupexpl_layout,null);
       TextView tvDepTime = (TextView) convertView.findViewById(R.id.tv_depTime);
        String start = myItems.get(groupPosition).getDepDateTime().toString();
        tvDepTime.setText(start);


       TextView tvArrTime =(TextView) convertView.findViewById(R.id.tv_arrTime);
        String end = myItems.get(groupPosition).getArrDateTime().toString();
        tvArrTime.setText(end);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        Log.i("adapter","child");
        LayoutInflater li = (LayoutInflater) this.c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = li.inflate(R.layout.group_child_layout,null);
       TextView tvTransportType = (TextView) convertView.findViewById(R.id.tv_transportType);   // toString
       String moment = myItems.get(groupPosition).getLineTypeName();
        tvTransportType.setText(moment);
        TextView tvChange = (TextView) convertView.findViewById(R.id.tv_change);  // toString
        String room = myItems.get(groupPosition). getNoOfChanges();
        tvChange.setText(room);
        TextView tvStart = (TextView) convertView.findViewById(R.id.tv_start);  // toString
       // String start = myItems.get(groupPosition).getStartTime();
        String start = myItems.get(groupPosition).getDepDateTime().toString();
        tvStart.setText(start);
        TextView tvEnd = (TextView) convertView.findViewById(R.id.tv_end);  // toString
       // String end = myItems.get(groupPosition).getEndTime();
        String end = myItems.get(groupPosition).getArrDateTime().toString();
        tvEnd.setText(end);
        return convertView;
    }


    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }



    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
