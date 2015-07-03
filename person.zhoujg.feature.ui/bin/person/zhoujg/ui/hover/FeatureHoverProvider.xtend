package person.zhoujg.ui.hover

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider
import person.zhoujg.feature.Feature
import static extension person.zhoujg.util.FeatureUtil.isAttribute

class FeatureHoverProvider extends DefaultEObjectHoverProvider {
	
	override protected getFirstLine(EObject o) {
		if (o instanceof Feature){			
			if ((o as Feature).attribute){
				return 'Feaure <i>attribute</i> <b>' + o.name + '</b>'
			}else{
				return 'Feature <b>' + o.name + '</b>'
			}
		}
		super.getFirstLine(o)
	}
	
}