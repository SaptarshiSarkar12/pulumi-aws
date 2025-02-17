// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IntentDialogCodeHook {
    /**
     * @return The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
     */
    private String messageVersion;
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    private String uri;

    private IntentDialogCodeHook() {}
    /**
     * @return The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
     */
    public String messageVersion() {
        return this.messageVersion;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentDialogCodeHook defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String messageVersion;
        private String uri;
        public Builder() {}
        public Builder(IntentDialogCodeHook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageVersion = defaults.messageVersion;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder messageVersion(String messageVersion) {
            this.messageVersion = Objects.requireNonNull(messageVersion);
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public IntentDialogCodeHook build() {
            final var o = new IntentDialogCodeHook();
            o.messageVersion = messageVersion;
            o.uri = uri;
            return o;
        }
    }
}
