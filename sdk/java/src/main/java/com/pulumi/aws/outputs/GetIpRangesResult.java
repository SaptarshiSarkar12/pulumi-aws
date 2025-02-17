// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIpRangesResult {
    /**
     * @return Lexically ordered list of CIDR blocks.
     * 
     */
    private List<String> cidrBlocks;
    /**
     * @return Publication time of the IP ranges (e.g., `2016-08-03-23-46-05`).
     * 
     */
    private String createDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Lexically ordered list of IPv6 CIDR blocks.
     * 
     */
    private List<String> ipv6CidrBlocks;
    private @Nullable List<String> regions;
    private List<String> services;
    /**
     * @return Publication time of the IP ranges, in Unix epoch time format
     * (e.g., `1470267965`).
     * 
     */
    private Integer syncToken;
    private @Nullable String url;

    private GetIpRangesResult() {}
    /**
     * @return Lexically ordered list of CIDR blocks.
     * 
     */
    public List<String> cidrBlocks() {
        return this.cidrBlocks;
    }
    /**
     * @return Publication time of the IP ranges (e.g., `2016-08-03-23-46-05`).
     * 
     */
    public String createDate() {
        return this.createDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Lexically ordered list of IPv6 CIDR blocks.
     * 
     */
    public List<String> ipv6CidrBlocks() {
        return this.ipv6CidrBlocks;
    }
    public List<String> regions() {
        return this.regions == null ? List.of() : this.regions;
    }
    public List<String> services() {
        return this.services;
    }
    /**
     * @return Publication time of the IP ranges, in Unix epoch time format
     * (e.g., `1470267965`).
     * 
     */
    public Integer syncToken() {
        return this.syncToken;
    }
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpRangesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> cidrBlocks;
        private String createDate;
        private String id;
        private List<String> ipv6CidrBlocks;
        private @Nullable List<String> regions;
        private List<String> services;
        private Integer syncToken;
        private @Nullable String url;
        public Builder() {}
        public Builder(GetIpRangesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.createDate = defaults.createDate;
    	      this.id = defaults.id;
    	      this.ipv6CidrBlocks = defaults.ipv6CidrBlocks;
    	      this.regions = defaults.regions;
    	      this.services = defaults.services;
    	      this.syncToken = defaults.syncToken;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder cidrBlocks(List<String> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }
        @CustomType.Setter
        public Builder createDate(String createDate) {
            this.createDate = Objects.requireNonNull(createDate);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6CidrBlocks(List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = Objects.requireNonNull(ipv6CidrBlocks);
            return this;
        }
        public Builder ipv6CidrBlocks(String... ipv6CidrBlocks) {
            return ipv6CidrBlocks(List.of(ipv6CidrBlocks));
        }
        @CustomType.Setter
        public Builder regions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        @CustomType.Setter
        public Builder services(List<String> services) {
            this.services = Objects.requireNonNull(services);
            return this;
        }
        public Builder services(String... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder syncToken(Integer syncToken) {
            this.syncToken = Objects.requireNonNull(syncToken);
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public GetIpRangesResult build() {
            final var o = new GetIpRangesResult();
            o.cidrBlocks = cidrBlocks;
            o.createDate = createDate;
            o.id = id;
            o.ipv6CidrBlocks = ipv6CidrBlocks;
            o.regions = regions;
            o.services = services;
            o.syncToken = syncToken;
            o.url = url;
            return o;
        }
    }
}
