// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codeartifact.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAuthorizationTokenResult {
    /**
     * @return Temporary authorization token.
     * 
     */
    private String authorizationToken;
    private String domain;
    private String domainOwner;
    private @Nullable Integer durationSeconds;
    /**
     * @return Time in UTC RFC3339 format when the authorization token expires.
     * 
     */
    private String expiration;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetAuthorizationTokenResult() {}
    /**
     * @return Temporary authorization token.
     * 
     */
    public String authorizationToken() {
        return this.authorizationToken;
    }
    public String domain() {
        return this.domain;
    }
    public String domainOwner() {
        return this.domainOwner;
    }
    public Optional<Integer> durationSeconds() {
        return Optional.ofNullable(this.durationSeconds);
    }
    /**
     * @return Time in UTC RFC3339 format when the authorization token expires.
     * 
     */
    public String expiration() {
        return this.expiration;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationTokenResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authorizationToken;
        private String domain;
        private String domainOwner;
        private @Nullable Integer durationSeconds;
        private String expiration;
        private String id;
        public Builder() {}
        public Builder(GetAuthorizationTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationToken = defaults.authorizationToken;
    	      this.domain = defaults.domain;
    	      this.domainOwner = defaults.domainOwner;
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.expiration = defaults.expiration;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder authorizationToken(String authorizationToken) {
            this.authorizationToken = Objects.requireNonNull(authorizationToken);
            return this;
        }
        @CustomType.Setter
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        @CustomType.Setter
        public Builder domainOwner(String domainOwner) {
            this.domainOwner = Objects.requireNonNull(domainOwner);
            return this;
        }
        @CustomType.Setter
        public Builder durationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder expiration(String expiration) {
            this.expiration = Objects.requireNonNull(expiration);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetAuthorizationTokenResult build() {
            final var o = new GetAuthorizationTokenResult();
            o.authorizationToken = authorizationToken;
            o.domain = domain;
            o.domainOwner = domainOwner;
            o.durationSeconds = durationSeconds;
            o.expiration = expiration;
            o.id = id;
            return o;
        }
    }
}
