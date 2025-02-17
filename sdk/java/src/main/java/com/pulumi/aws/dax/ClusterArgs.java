// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dax;

import com.pulumi.aws.dax.inputs.ClusterServerSideEncryptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * List of Availability Zones in which the
     * nodes will be created
     * 
     */
    @Import(name="availabilityZones")
    private @Nullable Output<List<String>> availabilityZones;

    /**
     * @return List of Availability Zones in which the
     * nodes will be created
     * 
     */
    public Optional<Output<List<String>>> availabilityZones() {
        return Optional.ofNullable(this.availabilityZones);
    }

    /**
     * The type of encryption the
     * cluster&#39;s endpoint should support. Valid values are: `NONE` and `TLS`.
     * Default value is `NONE`.
     * 
     */
    @Import(name="clusterEndpointEncryptionType")
    private @Nullable Output<String> clusterEndpointEncryptionType;

    /**
     * @return The type of encryption the
     * cluster&#39;s endpoint should support. Valid values are: `NONE` and `TLS`.
     * Default value is `NONE`.
     * 
     */
    public Optional<Output<String>> clusterEndpointEncryptionType() {
        return Optional.ofNullable(this.clusterEndpointEncryptionType);
    }

    /**
     * Group identifier. DAX converts this name to
     * lowercase
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return Group identifier. DAX converts this name to
     * lowercase
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Description for the cluster
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description for the cluster
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A valid Amazon Resource Name (ARN) that identifies
     * an IAM role. At runtime, DAX will assume this role and use the role&#39;s
     * permissions to access DynamoDB on your behalf
     * 
     */
    @Import(name="iamRoleArn", required=true)
    private Output<String> iamRoleArn;

    /**
     * @return A valid Amazon Resource Name (ARN) that identifies
     * an IAM role. At runtime, DAX will assume this role and use the role&#39;s
     * permissions to access DynamoDB on your behalf
     * 
     */
    public Output<String> iamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * Specifies the weekly time range for when
     * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
     * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
     * `sun:05:00-sun:09:00`
     * 
     */
    @Import(name="maintenanceWindow")
    private @Nullable Output<String> maintenanceWindow;

    /**
     * @return Specifies the weekly time range for when
     * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
     * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
     * `sun:05:00-sun:09:00`
     * 
     */
    public Optional<Output<String>> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }

    /**
     * The compute and memory capacity of the nodes. See
     * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
     * 
     */
    @Import(name="nodeType", required=true)
    private Output<String> nodeType;

    /**
     * @return The compute and memory capacity of the nodes. See
     * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
     * 
     */
    public Output<String> nodeType() {
        return this.nodeType;
    }

    /**
     * An Amazon Resource Name (ARN) of an
     * SNS topic to send DAX notifications to. Example:
     * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     * 
     */
    @Import(name="notificationTopicArn")
    private @Nullable Output<String> notificationTopicArn;

    /**
     * @return An Amazon Resource Name (ARN) of an
     * SNS topic to send DAX notifications to. Example:
     * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     * 
     */
    public Optional<Output<String>> notificationTopicArn() {
        return Optional.ofNullable(this.notificationTopicArn);
    }

    /**
     * Name of the parameter group to associate
     * with this DAX cluster
     * 
     */
    @Import(name="parameterGroupName")
    private @Nullable Output<String> parameterGroupName;

    /**
     * @return Name of the parameter group to associate
     * with this DAX cluster
     * 
     */
    public Optional<Output<String>> parameterGroupName() {
        return Optional.ofNullable(this.parameterGroupName);
    }

    /**
     * The number of nodes in the DAX cluster. A
     * replication factor of 1 will create a single-node cluster, without any read
     * replicas
     * 
     */
    @Import(name="replicationFactor", required=true)
    private Output<Integer> replicationFactor;

    /**
     * @return The number of nodes in the DAX cluster. A
     * replication factor of 1 will create a single-node cluster, without any read
     * replicas
     * 
     */
    public Output<Integer> replicationFactor() {
        return this.replicationFactor;
    }

    /**
     * One or more VPC security groups associated
     * with the cluster
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return One or more VPC security groups associated
     * with the cluster
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * Encrypt at rest options
     * 
     */
    @Import(name="serverSideEncryption")
    private @Nullable Output<ClusterServerSideEncryptionArgs> serverSideEncryption;

    /**
     * @return Encrypt at rest options
     * 
     */
    public Optional<Output<ClusterServerSideEncryptionArgs>> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }

    /**
     * Name of the subnet group to be used for the
     * cluster
     * 
     */
    @Import(name="subnetGroupName")
    private @Nullable Output<String> subnetGroupName;

    /**
     * @return Name of the subnet group to be used for the
     * cluster
     * 
     */
    public Optional<Output<String>> subnetGroupName() {
        return Optional.ofNullable(this.subnetGroupName);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.availabilityZones = $.availabilityZones;
        this.clusterEndpointEncryptionType = $.clusterEndpointEncryptionType;
        this.clusterName = $.clusterName;
        this.description = $.description;
        this.iamRoleArn = $.iamRoleArn;
        this.maintenanceWindow = $.maintenanceWindow;
        this.nodeType = $.nodeType;
        this.notificationTopicArn = $.notificationTopicArn;
        this.parameterGroupName = $.parameterGroupName;
        this.replicationFactor = $.replicationFactor;
        this.securityGroupIds = $.securityGroupIds;
        this.serverSideEncryption = $.serverSideEncryption;
        this.subnetGroupName = $.subnetGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterArgs $;

        public Builder() {
            $ = new ClusterArgs();
        }

        public Builder(ClusterArgs defaults) {
            $ = new ClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZones List of Availability Zones in which the
         * nodes will be created
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * @param availabilityZones List of Availability Zones in which the
         * nodes will be created
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        /**
         * @param availabilityZones List of Availability Zones in which the
         * nodes will be created
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        /**
         * @param clusterEndpointEncryptionType The type of encryption the
         * cluster&#39;s endpoint should support. Valid values are: `NONE` and `TLS`.
         * Default value is `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder clusterEndpointEncryptionType(@Nullable Output<String> clusterEndpointEncryptionType) {
            $.clusterEndpointEncryptionType = clusterEndpointEncryptionType;
            return this;
        }

        /**
         * @param clusterEndpointEncryptionType The type of encryption the
         * cluster&#39;s endpoint should support. Valid values are: `NONE` and `TLS`.
         * Default value is `NONE`.
         * 
         * @return builder
         * 
         */
        public Builder clusterEndpointEncryptionType(String clusterEndpointEncryptionType) {
            return clusterEndpointEncryptionType(Output.of(clusterEndpointEncryptionType));
        }

        /**
         * @param clusterName Group identifier. DAX converts this name to
         * lowercase
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Group identifier. DAX converts this name to
         * lowercase
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param description Description for the cluster
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description for the cluster
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param iamRoleArn A valid Amazon Resource Name (ARN) that identifies
         * an IAM role. At runtime, DAX will assume this role and use the role&#39;s
         * permissions to access DynamoDB on your behalf
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(Output<String> iamRoleArn) {
            $.iamRoleArn = iamRoleArn;
            return this;
        }

        /**
         * @param iamRoleArn A valid Amazon Resource Name (ARN) that identifies
         * an IAM role. At runtime, DAX will assume this role and use the role&#39;s
         * permissions to access DynamoDB on your behalf
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(String iamRoleArn) {
            return iamRoleArn(Output.of(iamRoleArn));
        }

        /**
         * @param maintenanceWindow Specifies the weekly time range for when
         * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
         * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
         * `sun:05:00-sun:09:00`
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(@Nullable Output<String> maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        /**
         * @param maintenanceWindow Specifies the weekly time range for when
         * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
         * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
         * `sun:05:00-sun:09:00`
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindow(String maintenanceWindow) {
            return maintenanceWindow(Output.of(maintenanceWindow));
        }

        /**
         * @param nodeType The compute and memory capacity of the nodes. See
         * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
         * 
         * @return builder
         * 
         */
        public Builder nodeType(Output<String> nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param nodeType The compute and memory capacity of the nodes. See
         * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
         * 
         * @return builder
         * 
         */
        public Builder nodeType(String nodeType) {
            return nodeType(Output.of(nodeType));
        }

        /**
         * @param notificationTopicArn An Amazon Resource Name (ARN) of an
         * SNS topic to send DAX notifications to. Example:
         * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
         * 
         * @return builder
         * 
         */
        public Builder notificationTopicArn(@Nullable Output<String> notificationTopicArn) {
            $.notificationTopicArn = notificationTopicArn;
            return this;
        }

        /**
         * @param notificationTopicArn An Amazon Resource Name (ARN) of an
         * SNS topic to send DAX notifications to. Example:
         * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
         * 
         * @return builder
         * 
         */
        public Builder notificationTopicArn(String notificationTopicArn) {
            return notificationTopicArn(Output.of(notificationTopicArn));
        }

        /**
         * @param parameterGroupName Name of the parameter group to associate
         * with this DAX cluster
         * 
         * @return builder
         * 
         */
        public Builder parameterGroupName(@Nullable Output<String> parameterGroupName) {
            $.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * @param parameterGroupName Name of the parameter group to associate
         * with this DAX cluster
         * 
         * @return builder
         * 
         */
        public Builder parameterGroupName(String parameterGroupName) {
            return parameterGroupName(Output.of(parameterGroupName));
        }

        /**
         * @param replicationFactor The number of nodes in the DAX cluster. A
         * replication factor of 1 will create a single-node cluster, without any read
         * replicas
         * 
         * @return builder
         * 
         */
        public Builder replicationFactor(Output<Integer> replicationFactor) {
            $.replicationFactor = replicationFactor;
            return this;
        }

        /**
         * @param replicationFactor The number of nodes in the DAX cluster. A
         * replication factor of 1 will create a single-node cluster, without any read
         * replicas
         * 
         * @return builder
         * 
         */
        public Builder replicationFactor(Integer replicationFactor) {
            return replicationFactor(Output.of(replicationFactor));
        }

        /**
         * @param securityGroupIds One or more VPC security groups associated
         * with the cluster
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds One or more VPC security groups associated
         * with the cluster
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds One or more VPC security groups associated
         * with the cluster
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param serverSideEncryption Encrypt at rest options
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(@Nullable Output<ClusterServerSideEncryptionArgs> serverSideEncryption) {
            $.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * @param serverSideEncryption Encrypt at rest options
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(ClusterServerSideEncryptionArgs serverSideEncryption) {
            return serverSideEncryption(Output.of(serverSideEncryption));
        }

        /**
         * @param subnetGroupName Name of the subnet group to be used for the
         * cluster
         * 
         * @return builder
         * 
         */
        public Builder subnetGroupName(@Nullable Output<String> subnetGroupName) {
            $.subnetGroupName = subnetGroupName;
            return this;
        }

        /**
         * @param subnetGroupName Name of the subnet group to be used for the
         * cluster
         * 
         * @return builder
         * 
         */
        public Builder subnetGroupName(String subnetGroupName) {
            return subnetGroupName(Output.of(subnetGroupName));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ClusterArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.iamRoleArn = Objects.requireNonNull($.iamRoleArn, "expected parameter 'iamRoleArn' to be non-null");
            $.nodeType = Objects.requireNonNull($.nodeType, "expected parameter 'nodeType' to be non-null");
            $.replicationFactor = Objects.requireNonNull($.replicationFactor, "expected parameter 'replicationFactor' to be non-null");
            return $;
        }
    }

}
