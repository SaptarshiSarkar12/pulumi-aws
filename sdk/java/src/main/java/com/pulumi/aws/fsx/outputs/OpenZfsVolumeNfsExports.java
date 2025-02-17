// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.aws.fsx.outputs.OpenZfsVolumeNfsExportsClientConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OpenZfsVolumeNfsExports {
    /**
     * @return - A list of configuration objects that contain the client and options for mounting the OpenZFS file system. Maximum of 25 items. See Client Configurations Below.
     * 
     */
    private List<OpenZfsVolumeNfsExportsClientConfiguration> clientConfigurations;

    private OpenZfsVolumeNfsExports() {}
    /**
     * @return - A list of configuration objects that contain the client and options for mounting the OpenZFS file system. Maximum of 25 items. See Client Configurations Below.
     * 
     */
    public List<OpenZfsVolumeNfsExportsClientConfiguration> clientConfigurations() {
        return this.clientConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsVolumeNfsExports defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<OpenZfsVolumeNfsExportsClientConfiguration> clientConfigurations;
        public Builder() {}
        public Builder(OpenZfsVolumeNfsExports defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientConfigurations = defaults.clientConfigurations;
        }

        @CustomType.Setter
        public Builder clientConfigurations(List<OpenZfsVolumeNfsExportsClientConfiguration> clientConfigurations) {
            this.clientConfigurations = Objects.requireNonNull(clientConfigurations);
            return this;
        }
        public Builder clientConfigurations(OpenZfsVolumeNfsExportsClientConfiguration... clientConfigurations) {
            return clientConfigurations(List.of(clientConfigurations));
        }
        public OpenZfsVolumeNfsExports build() {
            final var o = new OpenZfsVolumeNfsExports();
            o.clientConfigurations = clientConfigurations;
            return o;
        }
    }
}
