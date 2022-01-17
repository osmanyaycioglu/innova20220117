package com.training.spring.conditional;

import java.util.Map;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyConditionImpl implements Condition {

    @Override
    public boolean matches(final ConditionContext contextParam,
                           final AnnotatedTypeMetadata metadataParam) {
        Environment environmentLoc = contextParam.getEnvironment();
        MergedAnnotations annotationsLoc = metadataParam.getAnnotations();
        MergedAnnotation<MyCondition> mergedAnnotationLoc = annotationsLoc.get(MyCondition.class);
        if (mergedAnnotationLoc == null) {
            return false;
        }
        Map<String, Object> asMapLoc = mergedAnnotationLoc.asMap();
        String prop = (String) asMapLoc.get("prop");
        String propValue = (String) asMapLoc.get("propValue");
        String propertyLoc = environmentLoc.getProperty(prop);
        if ((propertyLoc == null) || propertyLoc.isEmpty()) {
            return false;
        }
        return propValue.equals(propertyLoc);
    }

}
