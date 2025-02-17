// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs Empty = new ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs();

    @Import(name="items")
    private @Nullable Output<List<String>> items;

    public Optional<Output<List<String>>> items() {
        return Optional.ofNullable(this.items);
    }

    private ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs() {}

    private ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs(ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs();
        }

        public Builder(ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs defaults) {
            $ = new ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs(Objects.requireNonNull(defaults));
        }

        public Builder items(@Nullable Output<List<String>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<String> items) {
            return items(Output.of(items));
        }

        public Builder items(String... items) {
            return items(List.of(items));
        }

        public ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsArgs build() {
            return $;
        }
    }

}
