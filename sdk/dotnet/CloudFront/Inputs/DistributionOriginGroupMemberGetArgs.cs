// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Inputs
{

    public sealed class DistributionOriginGroupMemberGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique identifier of the member origin
        /// </summary>
        [Input("originId", required: true)]
        public Input<string> OriginId { get; set; } = null!;

        public DistributionOriginGroupMemberGetArgs()
        {
        }
        public static new DistributionOriginGroupMemberGetArgs Empty => new DistributionOriginGroupMemberGetArgs();
    }
}
