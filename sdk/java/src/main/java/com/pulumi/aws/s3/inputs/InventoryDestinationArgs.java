// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.InventoryDestinationBucketArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class InventoryDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryDestinationArgs Empty = new InventoryDestinationArgs();

    /**
     * The S3 bucket configuration where inventory results are published (documented below).
     * 
     */
    @Import(name="bucket", required=true)
    private Output<InventoryDestinationBucketArgs> bucket;

    /**
     * @return The S3 bucket configuration where inventory results are published (documented below).
     * 
     */
    public Output<InventoryDestinationBucketArgs> bucket() {
        return this.bucket;
    }

    private InventoryDestinationArgs() {}

    private InventoryDestinationArgs(InventoryDestinationArgs $) {
        this.bucket = $.bucket;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryDestinationArgs $;

        public Builder() {
            $ = new InventoryDestinationArgs();
        }

        public Builder(InventoryDestinationArgs defaults) {
            $ = new InventoryDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The S3 bucket configuration where inventory results are published (documented below).
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<InventoryDestinationBucketArgs> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The S3 bucket configuration where inventory results are published (documented below).
         * 
         * @return builder
         * 
         */
        public Builder bucket(InventoryDestinationBucketArgs bucket) {
            return bucket(Output.of(bucket));
        }

        public InventoryDestinationArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
