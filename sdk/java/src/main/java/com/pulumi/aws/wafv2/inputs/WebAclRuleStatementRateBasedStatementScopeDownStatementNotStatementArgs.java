// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs();

    /**
     * Statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs>> statements;

    /**
     * @return Statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    public Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs>> statements() {
        return this.statements;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param statements Statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(Output<List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        /**
         * @param statements Statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(List<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        /**
         * @param statements Statement to negate. You can use any statement that can be nested. See Statement above for details.
         * 
         * @return builder
         * 
         */
        public Builder statements(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
