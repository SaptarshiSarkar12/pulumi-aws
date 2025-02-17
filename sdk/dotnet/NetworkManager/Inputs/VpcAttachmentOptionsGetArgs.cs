// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.NetworkManager.Inputs
{

    public sealed class VpcAttachmentOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether IPv6 is supported.
        /// </summary>
        [Input("ipv6Support", required: true)]
        public Input<bool> Ipv6Support { get; set; } = null!;

        public VpcAttachmentOptionsGetArgs()
        {
        }
        public static new VpcAttachmentOptionsGetArgs Empty => new VpcAttachmentOptionsGetArgs();
    }
}
