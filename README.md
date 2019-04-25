# pmd-custom-rule-sample

An example custom rule for PMD

1. Build src into a jar file. You need to add dependencies on 
    - pmd-apex-6.12.0.jar
	- pmd-apex-jorje-6.12.0-lib.jar
    - pmd-core-6.12.0.jar
2. Run PMD using ruleset.xml and including your jar file in the classpath

`java -classpath "<pmd lib folder>;<jar file>" net.sourceforge.pmd.PMD -dir test -rulesets ruleset.xml`