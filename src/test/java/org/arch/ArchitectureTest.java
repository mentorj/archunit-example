package org.arch;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "org.example")
public class ArchitectureTest {

    @ArchTest
    private static final ArchRule rule1 =
            classes().that().resideInAPackage("..infrastructure..")
                    .should().onlyBeAccessed()
                    .byAnyPackage("..adapters..","..ports..");


    @ArchTest
    private static final ArchRule rule2 =
            classes().that().resideInAPackage("..adapters..")
                    .should().onlyBeAccessed().byAnyPackage("..app..");

    @ArchTest
    private static final ArchRule rule3 =
            noClasses().that().resideInAPackage("..domain..")
                    .should().dependOnClassesThat().resideInAPackage("com.google..");


    @ArchTest
    private static final ArchRule noJavaDateConsumed =
            noClasses().that().resideInAPackage("org.example..").should().dependOnClassesThat().belongToAnyOf(java.util.Date.class);
}