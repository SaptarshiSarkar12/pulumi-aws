// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs();

    /**
     * The value to use in the custom metric dimension.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value to use in the custom metric dimension.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs() {}

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs();
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs defaults) {
            $ = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value The value to use in the custom metric dimension.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value to use in the custom metric dimension.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinitionPublishMetricActionDimensionArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
