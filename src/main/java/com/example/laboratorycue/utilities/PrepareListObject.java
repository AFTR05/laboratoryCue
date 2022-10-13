package com.example.laboratorycue.utilities;

import com.example.laboratorycue.model.Object;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class PrepareListObject {
    SearcherObject searcherObject=new SearcherObject();
    public ObservableList<Object> prepareListObjectOutStatus(ObservableList<Object> objectObservableList){
        ObservableList<Object> outStatuslist=objectObservableList;
        for (int x=0;x<outStatuslist.size();x++){
            if (searcherObject.getObjectStatus(objectObservableList.get(x).getStatus(),outStatuslist)!=null){
                outStatuslist.remove(searcherObject.getObjectStatus(objectObservableList.get(x).getStatus(),outStatuslist));
            }
        }
        return outStatuslist;
    }
}
