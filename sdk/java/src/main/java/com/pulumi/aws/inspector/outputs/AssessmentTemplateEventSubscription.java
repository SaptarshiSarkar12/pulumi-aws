// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inspector.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AssessmentTemplateEventSubscription {
    /**
     * @return The event for which you want to receive SNS notifications. Valid values are `ASSESSMENT_RUN_STARTED`, `ASSESSMENT_RUN_COMPLETED`, `ASSESSMENT_RUN_STATE_CHANGED`, and `FINDING_REPORTED`.
     * 
     */
    private String event;
    /**
     * @return The ARN of the SNS topic to which notifications are sent.
     * 
     */
    private String topicArn;

    private AssessmentTemplateEventSubscription() {}
    /**
     * @return The event for which you want to receive SNS notifications. Valid values are `ASSESSMENT_RUN_STARTED`, `ASSESSMENT_RUN_COMPLETED`, `ASSESSMENT_RUN_STATE_CHANGED`, and `FINDING_REPORTED`.
     * 
     */
    public String event() {
        return this.event;
    }
    /**
     * @return The ARN of the SNS topic to which notifications are sent.
     * 
     */
    public String topicArn() {
        return this.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentTemplateEventSubscription defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String event;
        private String topicArn;
        public Builder() {}
        public Builder(AssessmentTemplateEventSubscription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.topicArn = defaults.topicArn;
        }

        @CustomType.Setter
        public Builder event(String event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }
        @CustomType.Setter
        public Builder topicArn(String topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }
        public AssessmentTemplateEventSubscription build() {
            final var o = new AssessmentTemplateEventSubscription();
            o.event = event;
            o.topicArn = topicArn;
            return o;
        }
    }
}
