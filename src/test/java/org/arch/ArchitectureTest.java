package org.arch;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packages = "org.example")
public class ArchitectureTest {

    @ArchTest
    private static final ArchRule restrictDomainClassesUsage =
            classes().that().resideInAPackage("..infrastructure..")
                    .should().onlyBeAccessed()
                    .byAnyPackage("..adapters..","..ports..");


    @ArchTest
    private static final ArchRule restrictadapterClassesUsage =
            classes().that().resideInAPackage("..adapters..")
                    .should().onlyBeAccessed().byAnyPackage("..app..");

    @ArchTest
    private static final ArchRule domainShouldBeAsPureAsPossible=
            noClasses().that().resideInAPackage("..domain..")
                    .should().dependOnClassesThat().resideInAPackage("com.google..");


    @ArchTest
    private static final ArchRule noJavaDateInCode =
            noClasses().that().resideInAPackage("org.example..").should().dependOnClassesThat().belongToAnyOf(java.util.Date.class);

    @ArchTest
    private static final ArchRule domainShouldNotDependFromInfra =
            noClasses().that().resideInAPackage("..domain.model").should().dependOnClassesThat().resideInAPackage("..infrastructure..");
}