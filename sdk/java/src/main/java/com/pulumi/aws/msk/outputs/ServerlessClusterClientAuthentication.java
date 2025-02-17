// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.aws.msk.outputs.ServerlessClusterClientAuthenticationSasl;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ServerlessClusterClientAuthentication {
    /**
     * @return Details for client authentication using SASL. See below.
     * 
     */
    private ServerlessClusterClientAuthenticationSasl sasl;

    private ServerlessClusterClientAuthentication() {}
    /**
     * @return Details for client authentication using SASL. See below.
     * 
     */
    public ServerlessClusterClientAuthenticationSasl sasl() {
        return this.sasl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerlessClusterClientAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ServerlessClusterClientAuthenticationSasl sasl;
        public Builder() {}
        public Builder(ServerlessClusterClientAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasl = defaults.sasl;
        }

        @CustomType.Setter
        public Builder sasl(ServerlessClusterClientAuthenticationSasl sasl) {
            this.sasl = Objects.requireNonNull(sasl);
            return this;
        }
        public ServerlessClusterClientAuthentication build() {
            final var o = new ServerlessClusterClientAuthentication();
            o.sasl = sasl;
            return o;
        }
    }
}
