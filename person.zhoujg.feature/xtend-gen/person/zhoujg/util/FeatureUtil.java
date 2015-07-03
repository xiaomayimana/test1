package person.zhoujg.util;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import person.zhoujg.feature.AttributePart;
import person.zhoujg.feature.Feature;

@SuppressWarnings("all")
public class FeatureUtil {
  public static boolean isAttribute(final Feature ele) {
    boolean _xifexpression = false;
    boolean _and = false;
    EObject _eContainer = ele.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    if (!_notEquals) {
      _and = false;
    } else {
      EObject _eContainer_1 = ele.eContainer();
      _and = (_eContainer_1 instanceof AttributePart);
    }
    if (_and) {
      _xifexpression = true;
    } else {
      _xifexpression = false;
    }
    return _xifexpression;
  }
}
