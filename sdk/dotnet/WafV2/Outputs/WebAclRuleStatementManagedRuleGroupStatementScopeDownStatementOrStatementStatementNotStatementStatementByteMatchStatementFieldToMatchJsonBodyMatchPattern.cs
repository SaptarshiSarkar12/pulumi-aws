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
    public sealed class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPattern
    {
        public readonly Outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAll? All;
        public readonly ImmutableArray<string> IncludedPaths;

        [OutputConstructor]
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPattern(
            Outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementByteMatchStatementFieldToMatchJsonBodyMatchPatternAll? all,

            ImmutableArray<string> includedPaths)
        {
            All = all;
            IncludedPaths = includedPaths;
        }
    }
}
