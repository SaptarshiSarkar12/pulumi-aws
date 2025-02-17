// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.ImageOutputResourceAmi;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ImageOutputResource {
    /**
     * @return Set of objects with each Amazon Machine Image (AMI) created.
     * 
     */
    private @Nullable List<ImageOutputResourceAmi> amis;

    private ImageOutputResource() {}
    /**
     * @return Set of objects with each Amazon Machine Image (AMI) created.
     * 
     */
    public List<ImageOutputResourceAmi> amis() {
        return this.amis == null ? List.of() : this.amis;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageOutputResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ImageOutputResourceAmi> amis;
        public Builder() {}
        public Builder(ImageOutputResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amis = defaults.amis;
        }

        @CustomType.Setter
        public Builder amis(@Nullable List<ImageOutputResourceAmi> amis) {
            this.amis = amis;
            return this;
        }
        public Builder amis(ImageOutputResourceAmi... amis) {
            return amis(List.of(amis));
        }
        public ImageOutputResource build() {
            final var o = new ImageOutputResource();
            o.amis = amis;
            return o;
        }
    }
}
