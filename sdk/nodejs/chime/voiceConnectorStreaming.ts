// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration specifies whether media streaming is enabled for sending to Amazon Kinesis.
 * It also sets the retention period, in hours, for the Amazon Kinesis data.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const defaultVoiceConnector = new aws.chime.VoiceConnector("defaultVoiceConnector", {requireEncryption: true});
 * const defaultVoiceConnectorStreaming = new aws.chime.VoiceConnectorStreaming("defaultVoiceConnectorStreaming", {
 *     disabled: false,
 *     voiceConnectorId: defaultVoiceConnector.id,
 *     dataRetention: 7,
 *     streamingNotificationTargets: ["SQS"],
 * });
 * ```
 *
 * ## Import
 *
 * Chime Voice Connector Streaming can be imported using the `voice_connector_id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:chime/voiceConnectorStreaming:VoiceConnectorStreaming default abcdef1ghij2klmno3pqr4
 * ```
 */
export class VoiceConnectorStreaming extends pulumi.CustomResource {
    /**
     * Get an existing VoiceConnectorStreaming resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VoiceConnectorStreamingState, opts?: pulumi.CustomResourceOptions): VoiceConnectorStreaming {
        return new VoiceConnectorStreaming(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:chime/voiceConnectorStreaming:VoiceConnectorStreaming';

    /**
     * Returns true if the given object is an instance of VoiceConnectorStreaming.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VoiceConnectorStreaming {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VoiceConnectorStreaming.__pulumiType;
    }

    /**
     * The retention period, in hours, for the Amazon Kinesis data.
     */
    public readonly dataRetention!: pulumi.Output<number>;
    /**
     * When true, media streaming to Amazon Kinesis is turned off. Default: `false`
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
     */
    public readonly streamingNotificationTargets!: pulumi.Output<string[] | undefined>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    public readonly voiceConnectorId!: pulumi.Output<string>;

    /**
     * Create a VoiceConnectorStreaming resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VoiceConnectorStreamingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VoiceConnectorStreamingArgs | VoiceConnectorStreamingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VoiceConnectorStreamingState | undefined;
            resourceInputs["dataRetention"] = state ? state.dataRetention : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["streamingNotificationTargets"] = state ? state.streamingNotificationTargets : undefined;
            resourceInputs["voiceConnectorId"] = state ? state.voiceConnectorId : undefined;
        } else {
            const args = argsOrState as VoiceConnectorStreamingArgs | undefined;
            if ((!args || args.dataRetention === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataRetention'");
            }
            if ((!args || args.voiceConnectorId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'voiceConnectorId'");
            }
            resourceInputs["dataRetention"] = args ? args.dataRetention : undefined;
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["streamingNotificationTargets"] = args ? args.streamingNotificationTargets : undefined;
            resourceInputs["voiceConnectorId"] = args ? args.voiceConnectorId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VoiceConnectorStreaming.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VoiceConnectorStreaming resources.
 */
export interface VoiceConnectorStreamingState {
    /**
     * The retention period, in hours, for the Amazon Kinesis data.
     */
    dataRetention?: pulumi.Input<number>;
    /**
     * When true, media streaming to Amazon Kinesis is turned off. Default: `false`
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
     */
    streamingNotificationTargets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    voiceConnectorId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a VoiceConnectorStreaming resource.
 */
export interface VoiceConnectorStreamingArgs {
    /**
     * The retention period, in hours, for the Amazon Kinesis data.
     */
    dataRetention: pulumi.Input<number>;
    /**
     * When true, media streaming to Amazon Kinesis is turned off. Default: `false`
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The streaming notification targets. Valid Values: `EventBridge | SNS | SQS`
     */
    streamingNotificationTargets?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Amazon Chime Voice Connector ID.
     */
    voiceConnectorId: pulumi.Input<string>;
}
