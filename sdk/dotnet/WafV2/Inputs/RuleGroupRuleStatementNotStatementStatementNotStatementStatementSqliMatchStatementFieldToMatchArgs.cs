// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        [Input("allQueryArguments")]
        public Input<Inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs>? AllQueryArguments { get; set; }

        /// <summary>
        /// Inspect the request body, which immediately follows the request headers.
        /// </summary>
        [Input("body")]
        public Input<Inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyArgs>? Body { get; set; }

        /// <summary>
        /// Inspect the request cookies.
        /// </summary>
        [Input("cookies")]
        public Input<Inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchCookiesArgs>? Cookies { get; set; }

        /// <summary>
        /// Inspect the request body as JSON. See JSON Body for details.
        /// </summary>
        [Input("jsonBody")]
        public Input<Inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBodyArgs>? JsonBody { get; set; }

        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        [Input("method")]
        public Input<Inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodArgs>? Method { get; set; }

        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        [Input("queryString")]
        public Input<Inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs>? QueryString { get; set; }

        /// <summary>
        /// Inspect a single header. See Single Header below for details.
        /// </summary>
        [Input("singleHeader")]
        public Input<Inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs>? SingleHeader { get; set; }

        /// <summary>
        /// Inspect a single query argument. See Single Query Argument below for details.
        /// </summary>
        [Input("singleQueryArgument")]
        public Input<Inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs>? SingleQueryArgument { get; set; }

        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        [Input("uriPath")]
        public Input<Inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathArgs>? UriPath { get; set; }

        public RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs()
        {
        }
        public static new RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs Empty => new RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs();
    }
}
