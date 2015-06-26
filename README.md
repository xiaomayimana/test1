# tefler
##A textual feature modeling tool based on Xtext.
__New in release 1.0.0:__
* Without import (you need not to import another model file, just make it visible to the current model file, e.g., in classpath)
* Simplified feature reference (you need not to write a full qualified feature name, just the local name is OK, this means the feature name is unique in the feature model space, so be carefule this restriction. But an attribute name must be companyed with its owner feature's except in its owner feature's scope)
* Introduce a root feature for every model file (every model file begins with a root feature)

Attribute typing validation for rules will be added in the next release.
----
Tefler is a textual feature (an essential concept in software product lines) modeling tool based on Xtext. Tefler supports feature
attributes, complex composition rules, as well as cardinality support for both standalone (individual) and feature groups. In addition,
tefler supports modularity via import for large feature models.

However, the current version of tefler does not support more for validation (mainly naming and types) and context assistant except
for the basic Xtext provides based on the grammar that tefler supports. These feature may be included in future versions. 

You should download the __person.zhoujg.spl.feature.zip__ from /__eclipse_update__ and then install it via Eclipse __Install New Software...__ menu . After installation, you can 
create feature files with extension .fm thereby activating tefler editors. The grammar (in EBNF) can be found at  https://github.com/zhou-jg/tefler/deploy/TEFL_grammar.txt.

Hoping it helps to you!
