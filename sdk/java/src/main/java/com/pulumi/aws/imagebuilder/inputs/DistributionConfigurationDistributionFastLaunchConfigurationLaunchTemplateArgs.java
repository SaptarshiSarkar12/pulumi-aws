// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs Empty = new DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs();

    /**
     * The ID of the Amazon EC2 launch template to use.
     * 
     */
    @Import(name="launchTemplateId")
    private @Nullable Output<String> launchTemplateId;

    /**
     * @return The ID of the Amazon EC2 launch template to use.
     * 
     */
    public Optional<Output<String>> launchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }

    /**
     * The name of the launch template to use for faster launching for a Windows AMI.
     * 
     */
    @Import(name="launchTemplateName")
    private @Nullable Output<String> launchTemplateName;

    /**
     * @return The name of the launch template to use for faster launching for a Windows AMI.
     * 
     */
    public Optional<Output<String>> launchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }

    /**
     * The version of the launch template to use for faster launching for a Windows AMI.
     * 
     */
    @Import(name="launchTemplateVersion")
    private @Nullable Output<String> launchTemplateVersion;

    /**
     * @return The version of the launch template to use for faster launching for a Windows AMI.
     * 
     */
    public Optional<Output<String>> launchTemplateVersion() {
        return Optional.ofNullable(this.launchTemplateVersion);
    }

    private DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs() {}

    private DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs(DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs $) {
        this.launchTemplateId = $.launchTemplateId;
        this.launchTemplateName = $.launchTemplateName;
        this.launchTemplateVersion = $.launchTemplateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs $;

        public Builder() {
            $ = new DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs();
        }

        public Builder(DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs defaults) {
            $ = new DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param launchTemplateId The ID of the Amazon EC2 launch template to use.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateId(@Nullable Output<String> launchTemplateId) {
            $.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * @param launchTemplateId The ID of the Amazon EC2 launch template to use.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateId(String launchTemplateId) {
            return launchTemplateId(Output.of(launchTemplateId));
        }

        /**
         * @param launchTemplateName The name of the launch template to use for faster launching for a Windows AMI.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateName(@Nullable Output<String> launchTemplateName) {
            $.launchTemplateName = launchTemplateName;
            return this;
        }

        /**
         * @param launchTemplateName The name of the launch template to use for faster launching for a Windows AMI.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateName(String launchTemplateName) {
            return launchTemplateName(Output.of(launchTemplateName));
        }

        /**
         * @param launchTemplateVersion The version of the launch template to use for faster launching for a Windows AMI.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateVersion(@Nullable Output<String> launchTemplateVersion) {
            $.launchTemplateVersion = launchTemplateVersion;
            return this;
        }

        /**
         * @param launchTemplateVersion The version of the launch template to use for faster launching for a Windows AMI.
         * 
         * @return builder
         * 
         */
        public Builder launchTemplateVersion(String launchTemplateVersion) {
            return launchTemplateVersion(Output.of(launchTemplateVersion));
        }

        public DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs build() {
            return $;
        }
    }

}
