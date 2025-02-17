// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.medialive.InputArgs;
import com.pulumi.aws.medialive.inputs.InputState;
import com.pulumi.aws.medialive.outputs.InputDestination;
import com.pulumi.aws.medialive.outputs.InputInputDevice;
import com.pulumi.aws.medialive.outputs.InputMediaConnectFlow;
import com.pulumi.aws.medialive.outputs.InputSource;
import com.pulumi.aws.medialive.outputs.InputVpc;
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
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.medialive.InputSecurityGroup;
 * import com.pulumi.aws.medialive.InputSecurityGroupArgs;
 * import com.pulumi.aws.medialive.inputs.InputSecurityGroupWhitelistRuleArgs;
 * import com.pulumi.aws.medialive.Input;
 * import com.pulumi.aws.medialive.InputArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleInputSecurityGroup = new InputSecurityGroup(&#34;exampleInputSecurityGroup&#34;, InputSecurityGroupArgs.builder()        
 *             .whitelistRules(InputSecurityGroupWhitelistRuleArgs.builder()
 *                 .cidr(&#34;10.0.0.8/32&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;ENVIRONMENT&#34;, &#34;prod&#34;))
 *             .build());
 * 
 *         var exampleInput = new Input(&#34;exampleInput&#34;, InputArgs.builder()        
 *             .inputSecurityGroups(exampleInputSecurityGroup.id())
 *             .type(&#34;UDP_PUSH&#34;)
 *             .tags(Map.of(&#34;ENVIRONMENT&#34;, &#34;prod&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * MediaLive Input can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:medialive/input:Input example 12345678
 * ```
 * 
 */
@ResourceType(type="aws:medialive/input:Input")
public class Input extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Input.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the Input.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Channels attached to Input.
     * 
     */
    @Export(name="attachedChannels", type=List.class, parameters={String.class})
    private Output<List<String>> attachedChannels;

    /**
     * @return Channels attached to Input.
     * 
     */
    public Output<List<String>> attachedChannels() {
        return this.attachedChannels;
    }
    /**
     * Destination settings for PUSH type inputs. See Destinations for more details.
     * 
     */
    @Export(name="destinations", type=List.class, parameters={InputDestination.class})
    private Output</* @Nullable */ List<InputDestination>> destinations;

    /**
     * @return Destination settings for PUSH type inputs. See Destinations for more details.
     * 
     */
    public Output<Optional<List<InputDestination>>> destinations() {
        return Codegen.optional(this.destinations);
    }
    /**
     * The input class.
     * 
     */
    @Export(name="inputClass", type=String.class, parameters={})
    private Output<String> inputClass;

    /**
     * @return The input class.
     * 
     */
    public Output<String> inputClass() {
        return this.inputClass;
    }
    /**
     * Settings for the devices. See Input Devices for more details.
     * 
     */
    @Export(name="inputDevices", type=List.class, parameters={InputInputDevice.class})
    private Output<List<InputInputDevice>> inputDevices;

    /**
     * @return Settings for the devices. See Input Devices for more details.
     * 
     */
    public Output<List<InputInputDevice>> inputDevices() {
        return this.inputDevices;
    }
    /**
     * A list of IDs for all Inputs which are partners of this one.
     * 
     */
    @Export(name="inputPartnerIds", type=List.class, parameters={String.class})
    private Output<List<String>> inputPartnerIds;

    /**
     * @return A list of IDs for all Inputs which are partners of this one.
     * 
     */
    public Output<List<String>> inputPartnerIds() {
        return this.inputPartnerIds;
    }
    /**
     * List of input security groups.
     * 
     */
    @Export(name="inputSecurityGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> inputSecurityGroups;

    /**
     * @return List of input security groups.
     * 
     */
    public Output<Optional<List<String>>> inputSecurityGroups() {
        return Codegen.optional(this.inputSecurityGroups);
    }
    /**
     * Source type of the input.
     * 
     */
    @Export(name="inputSourceType", type=String.class, parameters={})
    private Output<String> inputSourceType;

    /**
     * @return Source type of the input.
     * 
     */
    public Output<String> inputSourceType() {
        return this.inputSourceType;
    }
    /**
     * A list of the MediaConnect Flows. See Media Connect Flows for more details.
     * 
     */
    @Export(name="mediaConnectFlows", type=List.class, parameters={InputMediaConnectFlow.class})
    private Output<List<InputMediaConnectFlow>> mediaConnectFlows;

    /**
     * @return A list of the MediaConnect Flows. See Media Connect Flows for more details.
     * 
     */
    public Output<List<InputMediaConnectFlow>> mediaConnectFlows() {
        return this.mediaConnectFlows;
    }
    /**
     * Name of the input.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the input.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ARN of the role this input assumes during and after creation.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of the role this input assumes during and after creation.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * The source URLs for a PULL-type input. See Sources for more details.
     * 
     */
    @Export(name="sources", type=List.class, parameters={InputSource.class})
    private Output<List<InputSource>> sources;

    /**
     * @return The source URLs for a PULL-type input. See Sources for more details.
     * 
     */
    public Output<List<InputSource>> sources() {
        return this.sources;
    }
    /**
     * A map of tags to assign to the Input. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the Input. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The different types of inputs that AWS Elemental MediaLive supports.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The different types of inputs that AWS Elemental MediaLive supports.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Settings for a private VPC Input. See VPC for more details.
     * 
     */
    @Export(name="vpc", type=InputVpc.class, parameters={})
    private Output</* @Nullable */ InputVpc> vpc;

    /**
     * @return Settings for a private VPC Input. See VPC for more details.
     * 
     */
    public Output<Optional<InputVpc>> vpc() {
        return Codegen.optional(this.vpc);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Input(String name) {
        this(name, InputArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Input(String name, InputArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Input(String name, InputArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:medialive/input:Input", name, args == null ? InputArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Input(String name, Output<String> id, @Nullable InputState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:medialive/input:Input", name, state, makeResourceOptions(options, id));
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
    public static Input get(String name, Output<String> id, @Nullable InputState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Input(name, id, state, options);
    }
}
