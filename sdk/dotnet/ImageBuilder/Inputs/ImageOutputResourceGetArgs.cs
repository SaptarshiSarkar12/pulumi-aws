// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ImageBuilder.Inputs
{

    public sealed class ImageOutputResourceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("amis")]
        private InputList<Inputs.ImageOutputResourceAmiGetArgs>? _amis;

        /// <summary>
        /// Set of objects with each Amazon Machine Image (AMI) created.
        /// </summary>
        public InputList<Inputs.ImageOutputResourceAmiGetArgs> Amis
        {
            get => _amis ?? (_amis = new InputList<Inputs.ImageOutputResourceAmiGetArgs>());
            set => _amis = value;
        }

        public ImageOutputResourceGetArgs()
        {
        }
        public static new ImageOutputResourceGetArgs Empty => new ImageOutputResourceGetArgs();
    }
}
