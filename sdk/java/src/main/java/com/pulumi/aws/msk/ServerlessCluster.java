// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.msk.ServerlessClusterArgs;
import com.pulumi.aws.msk.inputs.ServerlessClusterState;
import com.pulumi.aws.msk.outputs.ServerlessClusterClientAuthentication;
import com.pulumi.aws.msk.outputs.ServerlessClusterVpcConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon MSK Serverless cluster.
 * 
 * &gt; **Note:** To manage a _provisioned_ Amazon MSK cluster, use the [`aws.msk.Cluster`](https://www.terraform.io/docs/providers/aws/r/msk_cluster.html) resource.
 * 
 * ## Import
 * 
 * MSK serverless clusters can be imported using the cluster `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:msk/serverlessCluster:ServerlessCluster example arn:aws:kafka:us-west-2:123456789012:cluster/example/279c0212-d057-4dba-9aa9-1c4e5a25bfc7-3
 * ```
 * 
 */
@ResourceType(type="aws:msk/serverlessCluster:ServerlessCluster")
public class ServerlessCluster extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the serverless cluster.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the serverless cluster.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies client authentication information for the serverless cluster. See below.
     * 
     */
    @Export(name="clientAuthentication", type=ServerlessClusterClientAuthentication.class, parameters={})
    private Output<ServerlessClusterClientAuthentication> clientAuthentication;

    /**
     * @return Specifies client authentication information for the serverless cluster. See below.
     * 
     */
    public Output<ServerlessClusterClientAuthentication> clientAuthentication() {
        return this.clientAuthentication;
    }
    /**
     * The name of the serverless cluster.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return The name of the serverless cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * VPC configuration information. See below.
     * 
     */
    @Export(name="vpcConfigs", type=List.class, parameters={ServerlessClusterVpcConfig.class})
    private Output<List<ServerlessClusterVpcConfig>> vpcConfigs;

    /**
     * @return VPC configuration information. See below.
     * 
     */
    public Output<List<ServerlessClusterVpcConfig>> vpcConfigs() {
        return this.vpcConfigs;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerlessCluster(String name) {
        this(name, ServerlessClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerlessCluster(String name, ServerlessClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerlessCluster(String name, ServerlessClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/serverlessCluster:ServerlessCluster", name, args == null ? ServerlessClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServerlessCluster(String name, Output<String> id, @Nullable ServerlessClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:msk/serverlessCluster:ServerlessCluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServerlessCluster get(String name, Output<String> id, @Nullable ServerlessClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServerlessCluster(name, id, state, options);
    }
}
