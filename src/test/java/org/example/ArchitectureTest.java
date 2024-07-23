package org.example;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "org.example")
public class ArchitectureTest {

    @ArchTest
    private static final ArchRule rule1 =
            classes().that().resideInAPackage("..infrastructure..")
                    .should().onlyBeAccessed()
                    .byAnyPackage("..adapters..","..ports..");


    private static final ArchRule rule2 =
            classes().that().resideInAPackage("..adapters..")
                    .should().onlyBeAccessed().byAnyPackage("..app..");
}