// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MultiRegionAccessPointDetailsRegionArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointDetailsRegionArgs Empty = new MultiRegionAccessPointDetailsRegionArgs();

    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    private MultiRegionAccessPointDetailsRegionArgs() {}

    private MultiRegionAccessPointDetailsRegionArgs(MultiRegionAccessPointDetailsRegionArgs $) {
        this.bucket = $.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiRegionAccessPointDetailsRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiRegionAccessPointDetailsRegionArgs $;

        public Builder() {
            $ = new MultiRegionAccessPointDetailsRegionArgs();
        }

        public Builder(MultiRegionAccessPointDetailsRegionArgs defaults) {
            $ = new MultiRegionAccessPointDetailsRegionArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public MultiRegionAccessPointDetailsRegionArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
