// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchCookies;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBody;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body;
    /**
     * @return Inspect the request cookies.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchCookies cookies;
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBody jsonBody;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch() {}
    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the request cookies.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }
    /**
     * @return Inspect the request body as JSON. See JSON Body for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBody> jsonBody() {
        return Optional.ofNullable(this.jsonBody);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchCookies cookies;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBody jsonBody;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;
        public Builder() {}
        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch defaults) {
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
        public Builder allQueryArguments(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        @CustomType.Setter
        public Builder body(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        @CustomType.Setter
        public Builder cookies(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        @CustomType.Setter
        public Builder jsonBody(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchJsonBody jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }
        @CustomType.Setter
        public Builder method(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder singleHeader(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        @CustomType.Setter
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        @CustomType.Setter
        public Builder uriPath(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch build() {
            final var o = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch();
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
