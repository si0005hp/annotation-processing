package com.example;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

@SupportedSourceVersion(SourceVersion.RELEASE_8)
@SupportedAnnotationTypes("*")
public class AlphaAnnotationProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> typeElements, RoundEnvironment roundEnv) {
        System.out.println("******** Alpha processing start ******** ");
        
        typeElements.stream()
        .map(typeElement -> roundEnv.getElementsAnnotatedWith(typeElement))
        .flatMap(elements -> elements.stream())
        .forEach(element -> {
            Alpha alpha = element.getAnnotation(Alpha.class);
            if (alpha != null) {
                System.out.println(String.format("@Alpha at %s, value: %s", element, alpha.value()));
            }
        });
        return true;
    }

}
