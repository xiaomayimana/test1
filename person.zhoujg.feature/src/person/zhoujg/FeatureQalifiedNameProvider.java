package person.zhoujg;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import person.zhoujg.feature.Feature;
import static person.zhoujg.util.FeatureUtil.isAttribute;

public class FeatureQalifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		
		String name = SimpleAttributeResolver.NAME_RESOLVER.apply(obj);
		if(name == null || name.length() == 0)
			return null;
		
		if (obj instanceof Feature) {
			Feature featureObj = (Feature)obj;
			
			//for Attributes, to make sure the owner feature is present properly.
			if (isAttribute(featureObj)) {
				QualifiedName result = super.getFullyQualifiedName(obj);
				
				if (result.getSegmentCount() == 2) {
					return result;
				}

				if (result.getSegmentCount() > 2) {									
					return QualifiedName.create(result.getSegment(result.getSegmentCount() - 2), result.getLastSegment());
				}
			}
		}
		
		return QualifiedName.create(name);
	}
}
