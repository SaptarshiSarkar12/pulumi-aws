// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Inputs
{

    public sealed class DistributionOriginCustomOriginConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The HTTP port the custom origin listens on.
        /// </summary>
        [Input("httpPort", required: true)]
        public Input<int> HttpPort { get; set; } = null!;

        /// <summary>
        /// The HTTPS port the custom origin listens on.
        /// </summary>
        [Input("httpsPort", required: true)]
        public Input<int> HttpsPort { get; set; } = null!;

        /// <summary>
        /// The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
        /// </summary>
        [Input("originKeepaliveTimeout")]
        public Input<int>? OriginKeepaliveTimeout { get; set; }

        /// <summary>
        /// The origin protocol policy to apply to
        /// your origin. One of `http-only`, `https-only`, or `match-viewer`.
        /// </summary>
        [Input("originProtocolPolicy", required: true)]
        public Input<string> OriginProtocolPolicy { get; set; } = null!;

        /// <summary>
        /// The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
        /// </summary>
        [Input("originReadTimeout")]
        public Input<int>? OriginReadTimeout { get; set; }

        [Input("originSslProtocols", required: true)]
        private InputList<string>? _originSslProtocols;

        /// <summary>
        /// The SSL/TLS protocols that you want
        /// CloudFront to use when communicating with your origin over HTTPS. A list of
        /// one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
        /// </summary>
        public InputList<string> OriginSslProtocols
        {
            get => _originSslProtocols ?? (_originSslProtocols = new InputList<string>());
            set => _originSslProtocols = value;
        }

        public DistributionOriginCustomOriginConfigArgs()
        {
        }
        public static new DistributionOriginCustomOriginConfigArgs Empty => new DistributionOriginCustomOriginConfigArgs();
    }
}
