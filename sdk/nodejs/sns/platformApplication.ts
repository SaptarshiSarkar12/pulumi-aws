// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an SNS platform application resource
 *
 * ## Example Usage
 * ### Apple Push Notification Service (APNS)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const apnsApplication = new aws.sns.PlatformApplication("apns_application", {
 *     platform: "APNS",
 *     platformCredential: "<APNS PRIVATE KEY>",
 *     platformPrincipal: "<APNS CERTIFICATE>",
 * });
 * ```
 * ### Google Cloud Messaging (GCM)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const gcmApplication = new aws.sns.PlatformApplication("gcm_application", {
 *     platform: "GCM",
 *     platformCredential: "<GCM API KEY>",
 * });
 * ```
 *
 * ## Import
 *
 * SNS platform applications can be imported using the ARN, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:sns/platformApplication:PlatformApplication gcm_application arn:aws:sns:us-west-2:0123456789012:app/GCM/gcm_application
 * ```
 */
export class PlatformApplication extends pulumi.CustomResource {
    /**
     * Get an existing PlatformApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PlatformApplicationState, opts?: pulumi.CustomResourceOptions): PlatformApplication {
        return new PlatformApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sns/platformApplication:PlatformApplication';

    /**
     * Returns true if the given object is an instance of PlatformApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PlatformApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PlatformApplication.__pulumiType;
    }

    /**
     * The ARN of the SNS platform application
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The ARN of the SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
     */
    public readonly eventDeliveryFailureTopicArn!: pulumi.Output<string | undefined>;
    /**
     * The ARN of the SNS Topic triggered when a new platform endpoint is added to your platform application.
     */
    public readonly eventEndpointCreatedTopicArn!: pulumi.Output<string | undefined>;
    /**
     * The ARN of the SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
     */
    public readonly eventEndpointDeletedTopicArn!: pulumi.Output<string | undefined>;
    /**
     * The ARN of the SNS Topic triggered when an existing platform endpoint is changed from your platform application.
     */
    public readonly eventEndpointUpdatedTopicArn!: pulumi.Output<string | undefined>;
    /**
     * The IAM role ARN permitted to receive failure feedback for this application and give SNS write access to use CloudWatch logs on your behalf.
     */
    public readonly failureFeedbackRoleArn!: pulumi.Output<string | undefined>;
    /**
     * The friendly name for the SNS platform application
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
     */
    public readonly platform!: pulumi.Output<string>;
    /**
     * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     */
    public readonly platformCredential!: pulumi.Output<string>;
    /**
     * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     */
    public readonly platformPrincipal!: pulumi.Output<string | undefined>;
    /**
     * The IAM role ARN permitted to receive success feedback for this application and give SNS write access to use CloudWatch logs on your behalf.
     */
    public readonly successFeedbackRoleArn!: pulumi.Output<string | undefined>;
    /**
     * The sample rate percentage (0-100) of successfully delivered messages.
     */
    public readonly successFeedbackSampleRate!: pulumi.Output<string | undefined>;

    /**
     * Create a PlatformApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PlatformApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PlatformApplicationArgs | PlatformApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PlatformApplicationState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["eventDeliveryFailureTopicArn"] = state ? state.eventDeliveryFailureTopicArn : undefined;
            resourceInputs["eventEndpointCreatedTopicArn"] = state ? state.eventEndpointCreatedTopicArn : undefined;
            resourceInputs["eventEndpointDeletedTopicArn"] = state ? state.eventEndpointDeletedTopicArn : undefined;
            resourceInputs["eventEndpointUpdatedTopicArn"] = state ? state.eventEndpointUpdatedTopicArn : undefined;
            resourceInputs["failureFeedbackRoleArn"] = state ? state.failureFeedbackRoleArn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["platform"] = state ? state.platform : undefined;
            resourceInputs["platformCredential"] = state ? state.platformCredential : undefined;
            resourceInputs["platformPrincipal"] = state ? state.platformPrincipal : undefined;
            resourceInputs["successFeedbackRoleArn"] = state ? state.successFeedbackRoleArn : undefined;
            resourceInputs["successFeedbackSampleRate"] = state ? state.successFeedbackSampleRate : undefined;
        } else {
            const args = argsOrState as PlatformApplicationArgs | undefined;
            if ((!args || args.platform === undefined) && !opts.urn) {
                throw new Error("Missing required property 'platform'");
            }
            if ((!args || args.platformCredential === undefined) && !opts.urn) {
                throw new Error("Missing required property 'platformCredential'");
            }
            resourceInputs["eventDeliveryFailureTopicArn"] = args ? args.eventDeliveryFailureTopicArn : undefined;
            resourceInputs["eventEndpointCreatedTopicArn"] = args ? args.eventEndpointCreatedTopicArn : undefined;
            resourceInputs["eventEndpointDeletedTopicArn"] = args ? args.eventEndpointDeletedTopicArn : undefined;
            resourceInputs["eventEndpointUpdatedTopicArn"] = args ? args.eventEndpointUpdatedTopicArn : undefined;
            resourceInputs["failureFeedbackRoleArn"] = args ? args.failureFeedbackRoleArn : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["platform"] = args ? args.platform : undefined;
            resourceInputs["platformCredential"] = args ? args.platformCredential : undefined;
            resourceInputs["platformPrincipal"] = args ? args.platformPrincipal : undefined;
            resourceInputs["successFeedbackRoleArn"] = args ? args.successFeedbackRoleArn : undefined;
            resourceInputs["successFeedbackSampleRate"] = args ? args.successFeedbackSampleRate : undefined;
            resourceInputs["arn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PlatformApplication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PlatformApplication resources.
 */
export interface PlatformApplicationState {
    /**
     * The ARN of the SNS platform application
     */
    arn?: pulumi.Input<string>;
    /**
     * The ARN of the SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
     */
    eventDeliveryFailureTopicArn?: pulumi.Input<string>;
    /**
     * The ARN of the SNS Topic triggered when a new platform endpoint is added to your platform application.
     */
    eventEndpointCreatedTopicArn?: pulumi.Input<string>;
    /**
     * The ARN of the SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
     */
    eventEndpointDeletedTopicArn?: pulumi.Input<string>;
    /**
     * The ARN of the SNS Topic triggered when an existing platform endpoint is changed from your platform application.
     */
    eventEndpointUpdatedTopicArn?: pulumi.Input<string>;
    /**
     * The IAM role ARN permitted to receive failure feedback for this application and give SNS write access to use CloudWatch logs on your behalf.
     */
    failureFeedbackRoleArn?: pulumi.Input<string>;
    /**
     * The friendly name for the SNS platform application
     */
    name?: pulumi.Input<string>;
    /**
     * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
     */
    platform?: pulumi.Input<string>;
    /**
     * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     */
    platformCredential?: pulumi.Input<string>;
    /**
     * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     */
    platformPrincipal?: pulumi.Input<string>;
    /**
     * The IAM role ARN permitted to receive success feedback for this application and give SNS write access to use CloudWatch logs on your behalf.
     */
    successFeedbackRoleArn?: pulumi.Input<string>;
    /**
     * The sample rate percentage (0-100) of successfully delivered messages.
     */
    successFeedbackSampleRate?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PlatformApplication resource.
 */
export interface PlatformApplicationArgs {
    /**
     * The ARN of the SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
     */
    eventDeliveryFailureTopicArn?: pulumi.Input<string>;
    /**
     * The ARN of the SNS Topic triggered when a new platform endpoint is added to your platform application.
     */
    eventEndpointCreatedTopicArn?: pulumi.Input<string>;
    /**
     * The ARN of the SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
     */
    eventEndpointDeletedTopicArn?: pulumi.Input<string>;
    /**
     * The ARN of the SNS Topic triggered when an existing platform endpoint is changed from your platform application.
     */
    eventEndpointUpdatedTopicArn?: pulumi.Input<string>;
    /**
     * The IAM role ARN permitted to receive failure feedback for this application and give SNS write access to use CloudWatch logs on your behalf.
     */
    failureFeedbackRoleArn?: pulumi.Input<string>;
    /**
     * The friendly name for the SNS platform application
     */
    name?: pulumi.Input<string>;
    /**
     * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
     */
    platform: pulumi.Input<string>;
    /**
     * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     */
    platformCredential: pulumi.Input<string>;
    /**
     * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     */
    platformPrincipal?: pulumi.Input<string>;
    /**
     * The IAM role ARN permitted to receive success feedback for this application and give SNS write access to use CloudWatch logs on your behalf.
     */
    successFeedbackRoleArn?: pulumi.Input<string>;
    /**
     * The sample rate percentage (0-100) of successfully delivered messages.
     */
    successFeedbackSampleRate?: pulumi.Input<string>;
}
