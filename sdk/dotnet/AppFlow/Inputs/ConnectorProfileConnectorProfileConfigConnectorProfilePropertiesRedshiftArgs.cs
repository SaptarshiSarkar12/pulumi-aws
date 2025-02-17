// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Inputs
{

    public sealed class ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Amazon S3 bucket associated with Snowflake.
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// The bucket path that refers to the Amazon S3 bucket associated with Snowflake.
        /// </summary>
        [Input("bucketPrefix")]
        public Input<string>? BucketPrefix { get; set; }

        /// <summary>
        /// The JDBC URL of the Amazon Redshift cluster.
        /// </summary>
        [Input("databaseUrl")]
        public Input<string>? DatabaseUrl { get; set; }

        /// <summary>
        /// ARN of the IAM role.
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        public ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs()
        {
        }
        public static new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs Empty => new ConnectorProfileConnectorProfileConfigConnectorProfilePropertiesRedshiftArgs();
    }
}
