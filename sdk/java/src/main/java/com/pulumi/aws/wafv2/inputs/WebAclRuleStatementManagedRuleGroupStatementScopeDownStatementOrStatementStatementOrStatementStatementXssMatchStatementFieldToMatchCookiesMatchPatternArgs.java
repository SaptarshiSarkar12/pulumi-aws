// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs();

    @Import(name="all")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs> all;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs>> all() {
        return Optional.ofNullable(this.all);
    }

    @Import(name="excludedCookies")
    private @Nullable Output<List<String>> excludedCookies;

    public Optional<Output<List<String>>> excludedCookies() {
        return Optional.ofNullable(this.excludedCookies);
    }

    @Import(name="includedCookies")
    private @Nullable Output<List<String>> includedCookies;

    public Optional<Output<List<String>>> includedCookies() {
        return Optional.ofNullable(this.includedCookies);
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs $) {
        this.all = $.all;
        this.excludedCookies = $.excludedCookies;
        this.includedCookies = $.includedCookies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs(Objects.requireNonNull(defaults));
        }

        public Builder all(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs> all) {
            $.all = all;
            return this;
        }

        public Builder all(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs all) {
            return all(Output.of(all));
        }

        public Builder excludedCookies(@Nullable Output<List<String>> excludedCookies) {
            $.excludedCookies = excludedCookies;
            return this;
        }

        public Builder excludedCookies(List<String> excludedCookies) {
            return excludedCookies(Output.of(excludedCookies));
        }

        public Builder excludedCookies(String... excludedCookies) {
            return excludedCookies(List.of(excludedCookies));
        }

        public Builder includedCookies(@Nullable Output<List<String>> includedCookies) {
            $.includedCookies = includedCookies;
            return this;
        }

        public Builder includedCookies(List<String> includedCookies) {
            return includedCookies(Output.of(includedCookies));
        }

        public Builder includedCookies(String... includedCookies) {
            return includedCookies(List.of(includedCookies));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs build() {
            return $;
        }
    }

}
