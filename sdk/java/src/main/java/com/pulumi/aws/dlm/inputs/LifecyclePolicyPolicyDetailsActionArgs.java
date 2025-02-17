// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.inputs;

import com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LifecyclePolicyPolicyDetailsActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsActionArgs Empty = new LifecyclePolicyPolicyDetailsActionArgs();

    /**
     * The rule for copying shared snapshots across Regions. See the `cross_region_copy` configuration block.
     * 
     */
    @Import(name="crossRegionCopies", required=true)
    private Output<List<LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs>> crossRegionCopies;

    /**
     * @return The rule for copying shared snapshots across Regions. See the `cross_region_copy` configuration block.
     * 
     */
    public Output<List<LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs>> crossRegionCopies() {
        return this.crossRegionCopies;
    }

    /**
     * A name for the schedule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A name for the schedule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private LifecyclePolicyPolicyDetailsActionArgs() {}

    private LifecyclePolicyPolicyDetailsActionArgs(LifecyclePolicyPolicyDetailsActionArgs $) {
        this.crossRegionCopies = $.crossRegionCopies;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecyclePolicyPolicyDetailsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecyclePolicyPolicyDetailsActionArgs $;

        public Builder() {
            $ = new LifecyclePolicyPolicyDetailsActionArgs();
        }

        public Builder(LifecyclePolicyPolicyDetailsActionArgs defaults) {
            $ = new LifecyclePolicyPolicyDetailsActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crossRegionCopies The rule for copying shared snapshots across Regions. See the `cross_region_copy` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder crossRegionCopies(Output<List<LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs>> crossRegionCopies) {
            $.crossRegionCopies = crossRegionCopies;
            return this;
        }

        /**
         * @param crossRegionCopies The rule for copying shared snapshots across Regions. See the `cross_region_copy` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder crossRegionCopies(List<LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs> crossRegionCopies) {
            return crossRegionCopies(Output.of(crossRegionCopies));
        }

        /**
         * @param crossRegionCopies The rule for copying shared snapshots across Regions. See the `cross_region_copy` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder crossRegionCopies(LifecyclePolicyPolicyDetailsActionCrossRegionCopyArgs... crossRegionCopies) {
            return crossRegionCopies(List.of(crossRegionCopies));
        }

        /**
         * @param name A name for the schedule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the schedule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LifecyclePolicyPolicyDetailsActionArgs build() {
            $.crossRegionCopies = Objects.requireNonNull($.crossRegionCopies, "expected parameter 'crossRegionCopies' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
