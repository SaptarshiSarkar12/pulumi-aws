// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class InstanceCapacityReservationSpecificationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates the instance's Capacity Reservation preferences. Can be `"open"` or `"none"`. (Default: `"open"`).
        /// </summary>
        [Input("capacityReservationPreference")]
        public Input<string>? CapacityReservationPreference { get; set; }

        /// <summary>
        /// Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
        /// </summary>
        [Input("capacityReservationTarget")]
        public Input<Inputs.InstanceCapacityReservationSpecificationCapacityReservationTargetArgs>? CapacityReservationTarget { get; set; }

        public InstanceCapacityReservationSpecificationArgs()
        {
        }
        public static new InstanceCapacityReservationSpecificationArgs Empty => new InstanceCapacityReservationSpecificationArgs();
    }
}
