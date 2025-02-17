// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs Empty = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs();

    /**
     * Password that corresponds to the user name.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password that corresponds to the user name.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Name of the user.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Name of the user.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs() {}

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs $;

        public Builder() {
            $ = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs();
        }

        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs defaults) {
            $ = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Password that corresponds to the user name.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password that corresponds to the user name.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username Name of the user.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Name of the user.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsServiceNowArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
