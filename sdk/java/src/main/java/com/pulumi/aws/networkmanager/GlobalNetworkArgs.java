// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalNetworkArgs Empty = new GlobalNetworkArgs();

    /**
     * Description of the Global Network.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the Global Network.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GlobalNetworkArgs() {}

    private GlobalNetworkArgs(GlobalNetworkArgs $) {
        this.description = $.description;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalNetworkArgs $;

        public Builder() {
            $ = new GlobalNetworkArgs();
        }

        public Builder(GlobalNetworkArgs defaults) {
            $ = new GlobalNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the Global Network.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the Global Network.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GlobalNetworkArgs build() {
            return $;
        }
    }

}
