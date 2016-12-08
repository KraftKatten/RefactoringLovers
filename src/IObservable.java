import com.oracle.webservices.internal.api.message.PropertySet;

import java.beans.PropertyChangeListener;

/**
 * Created by hussainbalasem on 2016-12-08.
 */
public interface IObservable {

     void addObserver(PropertyChangeListener observer);

    void  removeObserver(PropertyChangeListener observer);
}
