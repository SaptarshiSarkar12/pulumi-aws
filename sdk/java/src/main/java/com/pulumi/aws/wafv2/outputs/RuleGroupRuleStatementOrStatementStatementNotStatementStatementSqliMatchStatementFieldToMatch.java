// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchCookies;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody body;
    /**
     * @return Inspect the request cookies.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchCookies cookies;
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBody jsonBody;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

    private RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch() {}
    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the request cookies.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBody> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchCookies cookies;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBody jsonBody;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;
        public Builder() {}
        public Builder(RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.cookies = defaults.cookies;
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        @CustomType.Setter
        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder cookies(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        @CustomType.Setter
        public Builder jsonBody(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBody jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder singleHeader(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        @CustomType.Setter
        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch build() {
            final var o = new RuleGroupRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch();
            o.allQueryArguments = allQueryArguments;
            o.body = body;
            o.cookies = cookies;
            o.jsonBody = jsonBody;
            o.method = method;
            o.queryString = queryString;
            o.singleHeader = singleHeader;
            o.singleQueryArgument = singleQueryArgument;
            o.uriPath = uriPath;
            return o;
        }
    }
}
