// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect.Inputs
{

    public sealed class RoutingProfileQueueConfigsAssociatedArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the channels that agents can handle in the Contact Control Panel (CCP). Valid values are `VOICE`, `CHAT`, `TASK`.
        /// </summary>
        [Input("channel")]
        public Input<string>? Channel { get; set; }

        /// <summary>
        /// Specifies the delay, in seconds, that a contact should be in the queue before they are routed to an available agent
        /// </summary>
        [Input("delay")]
        public Input<int>? Delay { get; set; }

        /// <summary>
        /// Specifies the order in which contacts are to be handled for the queue.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// ARN for the queue.
        /// </summary>
        [Input("queueArn")]
        public Input<string>? QueueArn { get; set; }

        /// <summary>
        /// Specifies the identifier for the queue.
        /// </summary>
        [Input("queueId")]
        public Input<string>? QueueId { get; set; }

        /// <summary>
        /// Name for the queue.
        /// </summary>
        [Input("queueName")]
        public Input<string>? QueueName { get; set; }

        public RoutingProfileQueueConfigsAssociatedArgs()
        {
        }
        public static new RoutingProfileQueueConfigsAssociatedArgs Empty => new RoutingProfileQueueConfigsAssociatedArgs();
    }
}
