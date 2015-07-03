package person.zhoujg.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import person.zhoujg.feature.Feature;
import person.zhoujg.util.FeatureUtil;

@SuppressWarnings("all")
public class FeatureHoverProvider extends DefaultEObjectHoverProvider {
  @Override
  protected String getFirstLine(final EObject o) {
    String _xblockexpression = null;
    {
      if ((o instanceof Feature)) {
        boolean _isAttribute = FeatureUtil.isAttribute(((Feature) o));
        if (_isAttribute) {
          String _name = ((Feature)o).getName();
          String _plus = ("Feaure <i>attribute</i> <b>" + _name);
          return (_plus + "</b>");
        } else {
          String _name_1 = ((Feature)o).getName();
          String _plus_1 = ("Feature <b>" + _name_1);
          return (_plus_1 + "</b>");
        }
      }
      _xblockexpression = super.getFirstLine(o);
    }
    return _xblockexpression;
  }
}
