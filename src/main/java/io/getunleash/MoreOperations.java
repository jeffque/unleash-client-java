package io.getunleash;

import java.util.List;
import java.util.Optional;

public interface MoreOperations {

    List<String> getFeatureToggleNames();

    Optional<FeatureToggle> getFeatureToggleDefinition(String toggleName);

    List<EvaluatedToggle> evaluateAllToggles();

    /**
     * Evaluate all toggles using the provided context. This does not record the corresponding usage
     * metrics for each toggle
     *
     * @param context
     * @return
     */
    List<EvaluatedToggle> evaluateAllToggles(UnleashContext context);

    void count(String toggleName, boolean enabled);

    void countVariant(String toggleName, String variantName);
}
