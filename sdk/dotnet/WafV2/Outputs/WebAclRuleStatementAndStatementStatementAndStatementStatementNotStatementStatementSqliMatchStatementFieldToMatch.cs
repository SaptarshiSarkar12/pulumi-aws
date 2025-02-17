// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch
    {
        /// <summary>
        /// Inspect all query arguments.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments? AllQueryArguments;
        /// <summary>
        /// Inspect the request body, which immediately follows the request headers.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody? Body;
        /// <summary>
        /// Inspect the request cookies.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchCookies? Cookies;
        /// <summary>
        /// Inspect the request body as JSON. See JSON Body for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBody? JsonBody;
        /// <summary>
        /// Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod? Method;
        /// <summary>
        /// Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString? QueryString;
        /// <summary>
        /// Inspect a single header. See Single Header below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader? SingleHeader;
        /// <summary>
        /// Inspect a single query argument. See Single Query Argument below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument? SingleQueryArgument;
        /// <summary>
        /// Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath? UriPath;

        [OutputConstructor]
        private WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch(
            Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments? allQueryArguments,

            Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody? body,

            Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchCookies? cookies,

            Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchJsonBody? jsonBody,

            Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod? method,

            Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString? queryString,

            Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader? singleHeader,

            Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument? singleQueryArgument,

            Outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath? uriPath)
        {
            AllQueryArguments = allQueryArguments;
            Body = body;
            Cookies = cookies;
            JsonBody = jsonBody;
            Method = method;
            QueryString = queryString;
            SingleHeader = singleHeader;
            SingleQueryArgument = singleQueryArgument;
            UriPath = uriPath;
        }
    }
}
