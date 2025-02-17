// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs Empty = new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs();

    /**
     * ID of profile to use for field-level encryption query argument-profile mapping
     * 
     */
    @Import(name="profileId", required=true)
    private Output<String> profileId;

    /**
     * @return ID of profile to use for field-level encryption query argument-profile mapping
     * 
     */
    public Output<String> profileId() {
        return this.profileId;
    }

    /**
     * Query argument for field-level encryption query argument-profile mapping.
     * 
     */
    @Import(name="queryArg", required=true)
    private Output<String> queryArg;

    /**
     * @return Query argument for field-level encryption query argument-profile mapping.
     * 
     */
    public Output<String> queryArg() {
        return this.queryArg;
    }

    private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs() {}

    private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs $) {
        this.profileId = $.profileId;
        this.queryArg = $.queryArg;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs $;

        public Builder() {
            $ = new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs();
        }

        public Builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs defaults) {
            $ = new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param profileId ID of profile to use for field-level encryption query argument-profile mapping
         * 
         * @return builder
         * 
         */
        public Builder profileId(Output<String> profileId) {
            $.profileId = profileId;
            return this;
        }

        /**
         * @param profileId ID of profile to use for field-level encryption query argument-profile mapping
         * 
         * @return builder
         * 
         */
        public Builder profileId(String profileId) {
            return profileId(Output.of(profileId));
        }

        /**
         * @param queryArg Query argument for field-level encryption query argument-profile mapping.
         * 
         * @return builder
         * 
         */
        public Builder queryArg(Output<String> queryArg) {
            $.queryArg = queryArg;
            return this;
        }

        /**
         * @param queryArg Query argument for field-level encryption query argument-profile mapping.
         * 
         * @return builder
         * 
         */
        public Builder queryArg(String queryArg) {
            return queryArg(Output.of(queryArg));
        }

        public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemArgs build() {
            $.profileId = Objects.requireNonNull($.profileId, "expected parameter 'profileId' to be non-null");
            $.queryArg = Objects.requireNonNull($.queryArg, "expected parameter 'queryArg' to be non-null");
            return $;
        }
    }

}
