// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficMirrorTargetState extends com.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorTargetState Empty = new TrafficMirrorTargetState();

    /**
     * The ARN of the traffic mirror target.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the traffic mirror target.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A description of the traffic mirror session.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the traffic mirror session.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The network interface ID that is associated with the target.
     * 
     */
    @Import(name="networkInterfaceId")
    private @Nullable Output<String> networkInterfaceId;

    /**
     * @return The network interface ID that is associated with the target.
     * 
     */
    public Optional<Output<String>> networkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }

    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * 
     */
    @Import(name="networkLoadBalancerArn")
    private @Nullable Output<String> networkLoadBalancerArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     * 
     */
    public Optional<Output<String>> networkLoadBalancerArn() {
        return Optional.ofNullable(this.networkLoadBalancerArn);
    }

    /**
     * The ID of the AWS account that owns the traffic mirror target.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the traffic mirror target.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private TrafficMirrorTargetState() {}

    private TrafficMirrorTargetState(TrafficMirrorTargetState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.networkInterfaceId = $.networkInterfaceId;
        this.networkLoadBalancerArn = $.networkLoadBalancerArn;
        this.ownerId = $.ownerId;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficMirrorTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficMirrorTargetState $;

        public Builder() {
            $ = new TrafficMirrorTargetState();
        }

        public Builder(TrafficMirrorTargetState defaults) {
            $ = new TrafficMirrorTargetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the traffic mirror target.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the traffic mirror target.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description A description of the traffic mirror session.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the traffic mirror session.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param networkInterfaceId The network interface ID that is associated with the target.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            $.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * @param networkInterfaceId The network interface ID that is associated with the target.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            return networkInterfaceId(Output.of(networkInterfaceId));
        }

        /**
         * @param networkLoadBalancerArn The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
         * 
         * @return builder
         * 
         */
        public Builder networkLoadBalancerArn(@Nullable Output<String> networkLoadBalancerArn) {
            $.networkLoadBalancerArn = networkLoadBalancerArn;
            return this;
        }

        /**
         * @param networkLoadBalancerArn The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
         * 
         * @return builder
         * 
         */
        public Builder networkLoadBalancerArn(String networkLoadBalancerArn) {
            return networkLoadBalancerArn(Output.of(networkLoadBalancerArn));
        }

        /**
         * @param ownerId The ID of the AWS account that owns the traffic mirror target.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId The ID of the AWS account that owns the traffic mirror target.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public TrafficMirrorTargetState build() {
            return $;
        }
    }

}
