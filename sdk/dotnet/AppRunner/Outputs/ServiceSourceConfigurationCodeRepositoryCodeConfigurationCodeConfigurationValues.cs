// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppRunner.Outputs
{

    [OutputType]
    public sealed class ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues
    {
        /// <summary>
        /// Command App Runner runs to build your application.
        /// </summary>
        public readonly string? BuildCommand;
        /// <summary>
        /// Port that your application listens to in the container. Defaults to `"8080"`.
        /// </summary>
        public readonly string? Port;
        /// <summary>
        /// Runtime environment type for building and running an App Runner service. Represents a programming language runtime. Valid values: `PYTHON_3`, `NODEJS_12`.
        /// </summary>
        public readonly string Runtime;
        /// <summary>
        /// Environment variables available to your running App Runner service. A map of key/value pairs. Keys with a prefix of `AWSAPPRUNNER` are reserved for system use and aren't valid.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? RuntimeEnvironmentVariables;
        /// <summary>
        /// Command App Runner runs to start your application.
        /// </summary>
        public readonly string? StartCommand;

        [OutputConstructor]
        private ServiceSourceConfigurationCodeRepositoryCodeConfigurationCodeConfigurationValues(
            string? buildCommand,

            string? port,

            string runtime,

            ImmutableDictionary<string, string>? runtimeEnvironmentVariables,

            string? startCommand)
        {
            BuildCommand = buildCommand;
            Port = port;
            Runtime = runtime;
            RuntimeEnvironmentVariables = runtimeEnvironmentVariables;
            StartCommand = startCommand;
        }
    }
}
