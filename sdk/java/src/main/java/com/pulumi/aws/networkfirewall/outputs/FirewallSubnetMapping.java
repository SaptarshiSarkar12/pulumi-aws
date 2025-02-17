// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallSubnetMapping {
    /**
     * @return The unique identifier for the subnet.
     * 
     */
    private String subnetId;

    private FirewallSubnetMapping() {}
    /**
     * @return The unique identifier for the subnet.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallSubnetMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String subnetId;
        public Builder() {}
        public Builder(FirewallSubnetMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        @CustomType.Setter
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public FirewallSubnetMapping build() {
            final var o = new FirewallSubnetMapping();
            o.subnetId = subnetId;
            return o;
        }
    }
}
