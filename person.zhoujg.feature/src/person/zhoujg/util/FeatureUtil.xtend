package person.zhoujg.util

import person.zhoujg.feature.AttributePart
import person.zhoujg.feature.Feature

class FeatureUtil {
	static def isAttribute(Feature ele){
		if (ele.eContainer != null && ele.eContainer instanceof AttributePart){
			true
		}else{
			false
		}
	}
}