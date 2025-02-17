// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProvisionedConcurrencyConfigState extends com.pulumi.resources.ResourceArgs {

    public static final ProvisionedConcurrencyConfigState Empty = new ProvisionedConcurrencyConfigState();

    /**
     * Name or Amazon Resource Name (ARN) of the Lambda Function.
     * 
     */
    @Import(name="functionName")
    private @Nullable Output<String> functionName;

    /**
     * @return Name or Amazon Resource Name (ARN) of the Lambda Function.
     * 
     */
    public Optional<Output<String>> functionName() {
        return Optional.ofNullable(this.functionName);
    }

    /**
     * Amount of capacity to allocate. Must be greater than or equal to `1`.
     * 
     */
    @Import(name="provisionedConcurrentExecutions")
    private @Nullable Output<Integer> provisionedConcurrentExecutions;

    /**
     * @return Amount of capacity to allocate. Must be greater than or equal to `1`.
     * 
     */
    public Optional<Output<Integer>> provisionedConcurrentExecutions() {
        return Optional.ofNullable(this.provisionedConcurrentExecutions);
    }

    /**
     * Lambda Function version or Lambda Alias name.
     * 
     */
    @Import(name="qualifier")
    private @Nullable Output<String> qualifier;

    /**
     * @return Lambda Function version or Lambda Alias name.
     * 
     */
    public Optional<Output<String>> qualifier() {
        return Optional.ofNullable(this.qualifier);
    }

    private ProvisionedConcurrencyConfigState() {}

    private ProvisionedConcurrencyConfigState(ProvisionedConcurrencyConfigState $) {
        this.functionName = $.functionName;
        this.provisionedConcurrentExecutions = $.provisionedConcurrentExecutions;
        this.qualifier = $.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProvisionedConcurrencyConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProvisionedConcurrencyConfigState $;

        public Builder() {
            $ = new ProvisionedConcurrencyConfigState();
        }

        public Builder(ProvisionedConcurrencyConfigState defaults) {
            $ = new ProvisionedConcurrencyConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param functionName Name or Amazon Resource Name (ARN) of the Lambda Function.
         * 
         * @return builder
         * 
         */
        public Builder functionName(@Nullable Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName Name or Amazon Resource Name (ARN) of the Lambda Function.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        /**
         * @param provisionedConcurrentExecutions Amount of capacity to allocate. Must be greater than or equal to `1`.
         * 
         * @return builder
         * 
         */
        public Builder provisionedConcurrentExecutions(@Nullable Output<Integer> provisionedConcurrentExecutions) {
            $.provisionedConcurrentExecutions = provisionedConcurrentExecutions;
            return this;
        }

        /**
         * @param provisionedConcurrentExecutions Amount of capacity to allocate. Must be greater than or equal to `1`.
         * 
         * @return builder
         * 
         */
        public Builder provisionedConcurrentExecutions(Integer provisionedConcurrentExecutions) {
            return provisionedConcurrentExecutions(Output.of(provisionedConcurrentExecutions));
        }

        /**
         * @param qualifier Lambda Function version or Lambda Alias name.
         * 
         * @return builder
         * 
         */
        public Builder qualifier(@Nullable Output<String> qualifier) {
            $.qualifier = qualifier;
            return this;
        }

        /**
         * @param qualifier Lambda Function version or Lambda Alias name.
         * 
         * @return builder
         * 
         */
        public Builder qualifier(String qualifier) {
            return qualifier(Output.of(qualifier));
        }

        public ProvisionedConcurrencyConfigState build() {
            return $;
        }
    }

}
