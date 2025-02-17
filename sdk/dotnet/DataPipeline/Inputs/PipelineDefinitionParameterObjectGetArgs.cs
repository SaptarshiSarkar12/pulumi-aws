// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DataPipeline.Inputs
{

    public sealed class PipelineDefinitionParameterObjectGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputList<Inputs.PipelineDefinitionParameterObjectAttributeGetArgs>? _attributes;

        /// <summary>
        /// Configuration block for attributes of the parameter object. See below
        /// </summary>
        public InputList<Inputs.PipelineDefinitionParameterObjectAttributeGetArgs> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<Inputs.PipelineDefinitionParameterObjectAttributeGetArgs>());
            set => _attributes = value;
        }

        /// <summary>
        /// ID of the parameter value.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public PipelineDefinitionParameterObjectGetArgs()
        {
        }
        public static new PipelineDefinitionParameterObjectGetArgs Empty => new PipelineDefinitionParameterObjectGetArgs();
    }
}
