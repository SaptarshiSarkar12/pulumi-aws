// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Inputs
{

    public sealed class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("all")]
        public Input<Inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternAllGetArgs>? All { get; set; }

        [Input("includedPaths")]
        private InputList<string>? _includedPaths;
        public InputList<string> IncludedPaths
        {
            get => _includedPaths ?? (_includedPaths = new InputList<string>());
            set => _includedPaths = value;
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternGetArgs()
        {
        }
        public static new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternGetArgs Empty => new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchJsonBodyMatchPatternGetArgs();
    }
}
