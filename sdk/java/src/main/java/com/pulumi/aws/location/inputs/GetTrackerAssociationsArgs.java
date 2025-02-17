// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.location.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTrackerAssociationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrackerAssociationsArgs Empty = new GetTrackerAssociationsArgs();

    /**
     * Name of the tracker resource associated with a geofence collection.
     * 
     */
    @Import(name="trackerName", required=true)
    private Output<String> trackerName;

    /**
     * @return Name of the tracker resource associated with a geofence collection.
     * 
     */
    public Output<String> trackerName() {
        return this.trackerName;
    }

    private GetTrackerAssociationsArgs() {}

    private GetTrackerAssociationsArgs(GetTrackerAssociationsArgs $) {
        this.trackerName = $.trackerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrackerAssociationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrackerAssociationsArgs $;

        public Builder() {
            $ = new GetTrackerAssociationsArgs();
        }

        public Builder(GetTrackerAssociationsArgs defaults) {
            $ = new GetTrackerAssociationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param trackerName Name of the tracker resource associated with a geofence collection.
         * 
         * @return builder
         * 
         */
        public Builder trackerName(Output<String> trackerName) {
            $.trackerName = trackerName;
            return this;
        }

        /**
         * @param trackerName Name of the tracker resource associated with a geofence collection.
         * 
         * @return builder
         * 
         */
        public Builder trackerName(String trackerName) {
            return trackerName(Output.of(trackerName));
        }

        public GetTrackerAssociationsArgs build() {
            $.trackerName = Objects.requireNonNull($.trackerName, "expected parameter 'trackerName' to be non-null");
            return $;
        }
    }

}
