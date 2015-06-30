# tefler
##A textual feature modeling tool based on Xtext.
Tefler is a textual feature (an essential concept in software product lines) modeling tool based on Xtext. Tefler supports feature attributes, complex composition rules, as well as cardinality support for both standalone (individual) and feature groups. In addition, tefler supports modularity which is important for large feature models.

You can download the __person.zhoujg.spl.feature.zip__ from /__eclipse_update__ and then install it via Eclipse __Install New Software...__ menu. After installation, you can 
create feature files with extension .fm thereby activating tefler editors. The grammar (in EBNF) can be found at https://github.com/zhou-jg/tefler/deploy/TEFL_grammar.txt.
You may also use comments indicated by a "//" for a single line and a pair of "/\*" and "\*/" for multiple lines in your model files.

Hoping it helps to you!

__New in release 1.1.0:__
* In grammar, I removed 'real' type for feature attribute since it is not so useful as I thought and can be replaced with other types.
* Add type validation when you specify composition rules for your feature models to ensure the expressions are valid.
* Improve outline (an eclipse view) to make you feel better.
* Make the hover for feature attributes in the model editor more precisely.

__New in release 1.0.0:__
* Without import (you need not to import another model file, just make it visible to the current model file, e.g., in classpath)
* Simplified feature reference (you need not to write a full qualified feature name, just the local name is OK, this means the feature name is unique in the feature model space, so be carefule this restriction. But an attribute name must be companied with its owner feature's except in its owner feature's scope)
* Introduce a root feature for every model file (every model file begins with a root feature)

Attribute typing validation for rules will be added in the next release.

----
__In 0.9.0__
the current version of tefler does not support more for validation (mainly naming and types) and context assistant except
for the basic Xtext provides based on the grammar that tefler supports. These feature may be included in future versions. 

