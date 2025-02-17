// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs();

    @Import(name="all")
    private @Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs> all;

    public Optional<Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs>> all() {
        return Optional.ofNullable(this.all);
    }

    @Import(name="includedPaths")
    private @Nullable Output<List<String>> includedPaths;

    public Optional<Output<List<String>>> includedPaths() {
        return Optional.ofNullable(this.includedPaths);
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs $) {
        this.all = $.all;
        this.includedPaths = $.includedPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs(Objects.requireNonNull(defaults));
        }

        public Builder all(@Nullable Output<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs> all) {
            $.all = all;
            return this;
        }

        public Builder all(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs all) {
            return all(Output.of(all));
        }

        public Builder includedPaths(@Nullable Output<List<String>> includedPaths) {
            $.includedPaths = includedPaths;
            return this;
        }

        public Builder includedPaths(List<String> includedPaths) {
            return includedPaths(Output.of(includedPaths));
        }

        public Builder includedPaths(String... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs build() {
            return $;
        }
    }

}
