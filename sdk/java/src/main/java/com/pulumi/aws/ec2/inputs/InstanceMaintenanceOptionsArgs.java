// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceMaintenanceOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceMaintenanceOptionsArgs Empty = new InstanceMaintenanceOptionsArgs();

    /**
     * Automatic recovery behavior of the Instance. Can be `&#34;default&#34;` or `&#34;disabled&#34;`. See [Recover your instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-recover.html) for more details.
     * 
     */
    @Import(name="autoRecovery")
    private @Nullable Output<String> autoRecovery;

    /**
     * @return Automatic recovery behavior of the Instance. Can be `&#34;default&#34;` or `&#34;disabled&#34;`. See [Recover your instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-recover.html) for more details.
     * 
     */
    public Optional<Output<String>> autoRecovery() {
        return Optional.ofNullable(this.autoRecovery);
    }

    private InstanceMaintenanceOptionsArgs() {}

    private InstanceMaintenanceOptionsArgs(InstanceMaintenanceOptionsArgs $) {
        this.autoRecovery = $.autoRecovery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceMaintenanceOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceMaintenanceOptionsArgs $;

        public Builder() {
            $ = new InstanceMaintenanceOptionsArgs();
        }

        public Builder(InstanceMaintenanceOptionsArgs defaults) {
            $ = new InstanceMaintenanceOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRecovery Automatic recovery behavior of the Instance. Can be `&#34;default&#34;` or `&#34;disabled&#34;`. See [Recover your instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-recover.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder autoRecovery(@Nullable Output<String> autoRecovery) {
            $.autoRecovery = autoRecovery;
            return this;
        }

        /**
         * @param autoRecovery Automatic recovery behavior of the Instance. Can be `&#34;default&#34;` or `&#34;disabled&#34;`. See [Recover your instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-recover.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder autoRecovery(String autoRecovery) {
            return autoRecovery(Output.of(autoRecovery));
        }

        public InstanceMaintenanceOptionsArgs build() {
            return $;
        }
    }

}
