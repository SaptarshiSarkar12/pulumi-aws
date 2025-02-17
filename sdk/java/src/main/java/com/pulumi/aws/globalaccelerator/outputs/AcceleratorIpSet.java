// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AcceleratorIpSet {
    /**
     * @return A list of IP addresses in the IP address set.
     * 
     */
    private @Nullable List<String> ipAddresses;
    /**
     * @return The type of IP addresses included in this IP set.
     * 
     */
    private @Nullable String ipFamily;

    private AcceleratorIpSet() {}
    /**
     * @return A list of IP addresses in the IP address set.
     * 
     */
    public List<String> ipAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * @return The type of IP addresses included in this IP set.
     * 
     */
    public Optional<String> ipFamily() {
        return Optional.ofNullable(this.ipFamily);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorIpSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> ipAddresses;
        private @Nullable String ipFamily;
        public Builder() {}
        public Builder(AcceleratorIpSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.ipFamily = defaults.ipFamily;
        }

        @CustomType.Setter
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        @CustomType.Setter
        public Builder ipFamily(@Nullable String ipFamily) {
            this.ipFamily = ipFamily;
            return this;
        }
        public AcceleratorIpSet build() {
            final var o = new AcceleratorIpSet();
            o.ipAddresses = ipAddresses;
            o.ipFamily = ipFamily;
            return o;
        }
    }
}
