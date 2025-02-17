// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs Empty = new DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs();

    /**
     * Your secret ARN, which you can create in AWS Secrets Manager. You use a secret if basic authentication credentials are required to connect to a website. The secret stores your credentials of user name and password.
     * 
     */
    @Import(name="credentials", required=true)
    private Output<String> credentials;

    /**
     * @return Your secret ARN, which you can create in AWS Secrets Manager. You use a secret if basic authentication credentials are required to connect to a website. The secret stores your credentials of user name and password.
     * 
     */
    public Output<String> credentials() {
        return this.credentials;
    }

    /**
     * The name of the website host you want to connect to using authentication credentials. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;`.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return The name of the website host you want to connect to using authentication credentials. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;`.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * The port number of the website host you want to connect to using authentication credentials. For example, the port for `https://a.example.com/page1.html` is `443`, the standard port for HTTPS.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port number of the website host you want to connect to using authentication credentials. For example, the port for `https://a.example.com/page1.html` is `443`, the standard port for HTTPS.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    private DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs() {}

    private DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs(DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs $) {
        this.credentials = $.credentials;
        this.host = $.host;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs $;

        public Builder() {
            $ = new DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs();
        }

        public Builder(DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs defaults) {
            $ = new DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials Your secret ARN, which you can create in AWS Secrets Manager. You use a secret if basic authentication credentials are required to connect to a website. The secret stores your credentials of user name and password.
         * 
         * @return builder
         * 
         */
        public Builder credentials(Output<String> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials Your secret ARN, which you can create in AWS Secrets Manager. You use a secret if basic authentication credentials are required to connect to a website. The secret stores your credentials of user name and password.
         * 
         * @return builder
         * 
         */
        public Builder credentials(String credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param host The name of the website host you want to connect to using authentication credentials. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The name of the website host you want to connect to using authentication credentials. For example, the host name of `https://a.example.com/page1.html` is `&#34;a.example.com&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port The port number of the website host you want to connect to using authentication credentials. For example, the port for `https://a.example.com/page1.html` is `443`, the standard port for HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number of the website host you want to connect to using authentication credentials. For example, the port for `https://a.example.com/page1.html` is `443`, the standard port for HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public DataSourceConfigurationWebCrawlerConfigurationAuthenticationConfigurationBasicAuthenticationArgs build() {
            $.credentials = Objects.requireNonNull($.credentials, "expected parameter 'credentials' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
