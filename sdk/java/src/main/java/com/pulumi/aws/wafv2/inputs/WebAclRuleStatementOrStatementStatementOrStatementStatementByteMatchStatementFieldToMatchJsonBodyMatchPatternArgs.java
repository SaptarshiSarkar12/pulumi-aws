// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs();

    @Import(name="all")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs> all;

    public Optional<Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs>> all() {
        return Optional.ofNullable(this.all);
    }

    @Import(name="includedPaths")
    private @Nullable Output<List<String>> includedPaths;

    public Optional<Output<List<String>>> includedPaths() {
        return Optional.ofNullable(this.includedPaths);
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs() {}

    private WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs(WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs $) {
        this.all = $.all;
        this.includedPaths = $.includedPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs(Objects.requireNonNull(defaults));
        }

        public Builder all(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs> all) {
            $.all = all;
            return this;
        }

        public Builder all(WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs all) {
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

        public WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternArgs build() {
            return $;
        }
    }

}
