// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs Empty = new GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs();

    /**
     * ASN of the Core Network Edge in an AWS Region. By default, the ASN will be a single integer automatically assigned from `asn_ranges`
     * 
     */
    @Import(name="asn")
    private @Nullable Output<Integer> asn;

    /**
     * @return ASN of the Core Network Edge in an AWS Region. By default, the ASN will be a single integer automatically assigned from `asn_ranges`
     * 
     */
    public Optional<Output<Integer>> asn() {
        return Optional.ofNullable(this.asn);
    }

    /**
     * The local CIDR blocks for this Core Network Edge for AWS Transit Gateway Connect attachments. By default, this CIDR block will be one or more optional IPv4 and IPv6 CIDR prefixes auto-assigned from `inside_cidr_blocks`.
     * 
     */
    @Import(name="insideCidrBlocks")
    private @Nullable Output<List<String>> insideCidrBlocks;

    /**
     * @return The local CIDR blocks for this Core Network Edge for AWS Transit Gateway Connect attachments. By default, this CIDR block will be one or more optional IPv4 and IPv6 CIDR prefixes auto-assigned from `inside_cidr_blocks`.
     * 
     */
    public Optional<Output<List<String>>> insideCidrBlocks() {
        return Optional.ofNullable(this.insideCidrBlocks);
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    private GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs() {}

    private GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs(GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs $) {
        this.asn = $.asn;
        this.insideCidrBlocks = $.insideCidrBlocks;
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs $;

        public Builder() {
            $ = new GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs();
        }

        public Builder(GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs defaults) {
            $ = new GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asn ASN of the Core Network Edge in an AWS Region. By default, the ASN will be a single integer automatically assigned from `asn_ranges`
         * 
         * @return builder
         * 
         */
        public Builder asn(@Nullable Output<Integer> asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param asn ASN of the Core Network Edge in an AWS Region. By default, the ASN will be a single integer automatically assigned from `asn_ranges`
         * 
         * @return builder
         * 
         */
        public Builder asn(Integer asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param insideCidrBlocks The local CIDR blocks for this Core Network Edge for AWS Transit Gateway Connect attachments. By default, this CIDR block will be one or more optional IPv4 and IPv6 CIDR prefixes auto-assigned from `inside_cidr_blocks`.
         * 
         * @return builder
         * 
         */
        public Builder insideCidrBlocks(@Nullable Output<List<String>> insideCidrBlocks) {
            $.insideCidrBlocks = insideCidrBlocks;
            return this;
        }

        /**
         * @param insideCidrBlocks The local CIDR blocks for this Core Network Edge for AWS Transit Gateway Connect attachments. By default, this CIDR block will be one or more optional IPv4 and IPv6 CIDR prefixes auto-assigned from `inside_cidr_blocks`.
         * 
         * @return builder
         * 
         */
        public Builder insideCidrBlocks(List<String> insideCidrBlocks) {
            return insideCidrBlocks(Output.of(insideCidrBlocks));
        }

        /**
         * @param insideCidrBlocks The local CIDR blocks for this Core Network Edge for AWS Transit Gateway Connect attachments. By default, this CIDR block will be one or more optional IPv4 and IPv6 CIDR prefixes auto-assigned from `inside_cidr_blocks`.
         * 
         * @return builder
         * 
         */
        public Builder insideCidrBlocks(String... insideCidrBlocks) {
            return insideCidrBlocks(List.of(insideCidrBlocks));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public GetCoreNetworkPolicyDocumentCoreNetworkConfigurationEdgeLocationArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
