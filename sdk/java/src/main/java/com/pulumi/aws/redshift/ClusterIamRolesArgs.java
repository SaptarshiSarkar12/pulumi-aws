// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterIamRolesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterIamRolesArgs Empty = new ClusterIamRolesArgs();

    /**
     * The name of the Redshift Cluster IAM Roles.
     * 
     */
    @Import(name="clusterIdentifier", required=true)
    private Output<String> clusterIdentifier;

    /**
     * @return The name of the Redshift Cluster IAM Roles.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
     * 
     */
    @Import(name="defaultIamRoleArn")
    private @Nullable Output<String> defaultIamRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
     * 
     */
    public Optional<Output<String>> defaultIamRoleArn() {
        return Optional.ofNullable(this.defaultIamRoleArn);
    }

    /**
     * A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
     * 
     */
    @Import(name="iamRoleArns")
    private @Nullable Output<List<String>> iamRoleArns;

    /**
     * @return A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
     * 
     */
    public Optional<Output<List<String>>> iamRoleArns() {
        return Optional.ofNullable(this.iamRoleArns);
    }

    private ClusterIamRolesArgs() {}

    private ClusterIamRolesArgs(ClusterIamRolesArgs $) {
        this.clusterIdentifier = $.clusterIdentifier;
        this.defaultIamRoleArn = $.defaultIamRoleArn;
        this.iamRoleArns = $.iamRoleArns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterIamRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterIamRolesArgs $;

        public Builder() {
            $ = new ClusterIamRolesArgs();
        }

        public Builder(ClusterIamRolesArgs defaults) {
            $ = new ClusterIamRolesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterIdentifier The name of the Redshift Cluster IAM Roles.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(Output<String> clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * @param clusterIdentifier The name of the Redshift Cluster IAM Roles.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(String clusterIdentifier) {
            return clusterIdentifier(Output.of(clusterIdentifier));
        }

        /**
         * @param defaultIamRoleArn The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
         * 
         * @return builder
         * 
         */
        public Builder defaultIamRoleArn(@Nullable Output<String> defaultIamRoleArn) {
            $.defaultIamRoleArn = defaultIamRoleArn;
            return this;
        }

        /**
         * @param defaultIamRoleArn The Amazon Resource Name (ARN) for the IAM role that was set as default for the cluster when the cluster was created.
         * 
         * @return builder
         * 
         */
        public Builder defaultIamRoleArn(String defaultIamRoleArn) {
            return defaultIamRoleArn(Output.of(defaultIamRoleArn));
        }

        /**
         * @param iamRoleArns A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArns(@Nullable Output<List<String>> iamRoleArns) {
            $.iamRoleArns = iamRoleArns;
            return this;
        }

        /**
         * @param iamRoleArns A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArns(List<String> iamRoleArns) {
            return iamRoleArns(Output.of(iamRoleArns));
        }

        /**
         * @param iamRoleArns A list of IAM Role ARNs to associate with the cluster. A Maximum of 10 can be associated to the cluster at any time.
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArns(String... iamRoleArns) {
            return iamRoleArns(List.of(iamRoleArns));
        }

        public ClusterIamRolesArgs build() {
            $.clusterIdentifier = Objects.requireNonNull($.clusterIdentifier, "expected parameter 'clusterIdentifier' to be non-null");
            return $;
        }
    }

}
