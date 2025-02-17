// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs Empty = new RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs();

    /**
     * Set of port ranges.
     * 
     */
    @Import(name="definitions", required=true)
    private Output<List<String>> definitions;

    /**
     * @return Set of port ranges.
     * 
     */
    public Output<List<String>> definitions() {
        return this.definitions;
    }

    private RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs() {}

    private RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs(RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs $) {
        this.definitions = $.definitions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs();
        }

        public Builder(RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs defaults) {
            $ = new RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param definitions Set of port ranges.
         * 
         * @return builder
         * 
         */
        public Builder definitions(Output<List<String>> definitions) {
            $.definitions = definitions;
            return this;
        }

        /**
         * @param definitions Set of port ranges.
         * 
         * @return builder
         * 
         */
        public Builder definitions(List<String> definitions) {
            return definitions(Output.of(definitions));
        }

        /**
         * @param definitions Set of port ranges.
         * 
         * @return builder
         * 
         */
        public Builder definitions(String... definitions) {
            return definitions(List.of(definitions));
        }

        public RuleGroupRuleGroupRuleVariablesPortSetPortSetArgs build() {
            $.definitions = Objects.requireNonNull($.definitions, "expected parameter 'definitions' to be non-null");
            return $;
        }
    }

}
