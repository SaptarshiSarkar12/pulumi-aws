// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceSettingArgs Empty = new ServiceSettingArgs();

    /**
     * ID of the service setting.
     * 
     */
    @Import(name="settingId", required=true)
    private Output<String> settingId;

    /**
     * @return ID of the service setting.
     * 
     */
    public Output<String> settingId() {
        return this.settingId;
    }

    /**
     * Value of the service setting.
     * 
     */
    @Import(name="settingValue", required=true)
    private Output<String> settingValue;

    /**
     * @return Value of the service setting.
     * 
     */
    public Output<String> settingValue() {
        return this.settingValue;
    }

    private ServiceSettingArgs() {}

    private ServiceSettingArgs(ServiceSettingArgs $) {
        this.settingId = $.settingId;
        this.settingValue = $.settingValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSettingArgs $;

        public Builder() {
            $ = new ServiceSettingArgs();
        }

        public Builder(ServiceSettingArgs defaults) {
            $ = new ServiceSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param settingId ID of the service setting.
         * 
         * @return builder
         * 
         */
        public Builder settingId(Output<String> settingId) {
            $.settingId = settingId;
            return this;
        }

        /**
         * @param settingId ID of the service setting.
         * 
         * @return builder
         * 
         */
        public Builder settingId(String settingId) {
            return settingId(Output.of(settingId));
        }

        /**
         * @param settingValue Value of the service setting.
         * 
         * @return builder
         * 
         */
        public Builder settingValue(Output<String> settingValue) {
            $.settingValue = settingValue;
            return this;
        }

        /**
         * @param settingValue Value of the service setting.
         * 
         * @return builder
         * 
         */
        public Builder settingValue(String settingValue) {
            return settingValue(Output.of(settingValue));
        }

        public ServiceSettingArgs build() {
            $.settingId = Objects.requireNonNull($.settingId, "expected parameter 'settingId' to be non-null");
            $.settingValue = Objects.requireNonNull($.settingValue, "expected parameter 'settingValue' to be non-null");
            return $;
        }
    }

}
