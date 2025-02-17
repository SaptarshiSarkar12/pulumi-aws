// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFileSystemSelfManagedActiveDirectoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFileSystemSelfManagedActiveDirectoryArgs Empty = new WindowsFileSystemSelfManagedActiveDirectoryArgs();

    /**
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
     * 
     */
    @Import(name="dnsIps", required=true)
    private Output<List<String>> dnsIps;

    /**
     * @return A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
     * 
     */
    public Output<List<String>> dnsIps() {
        return this.dnsIps;
    }

    /**
     * The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
     * 
     */
    @Import(name="domainName", required=true)
    private Output<String> domainName;

    /**
     * @return The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
     * 
     */
    @Import(name="fileSystemAdministratorsGroup")
    private @Nullable Output<String> fileSystemAdministratorsGroup;

    /**
     * @return The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
     * 
     */
    public Optional<Output<String>> fileSystemAdministratorsGroup() {
        return Optional.ofNullable(this.fileSystemAdministratorsGroup);
    }

    /**
     * The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
     * 
     */
    @Import(name="organizationalUnitDistinguishedName")
    private @Nullable Output<String> organizationalUnitDistinguishedName;

    /**
     * @return The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
     * 
     */
    public Optional<Output<String>> organizationalUnitDistinguishedName() {
        return Optional.ofNullable(this.organizationalUnitDistinguishedName);
    }

    /**
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private WindowsFileSystemSelfManagedActiveDirectoryArgs() {}

    private WindowsFileSystemSelfManagedActiveDirectoryArgs(WindowsFileSystemSelfManagedActiveDirectoryArgs $) {
        this.dnsIps = $.dnsIps;
        this.domainName = $.domainName;
        this.fileSystemAdministratorsGroup = $.fileSystemAdministratorsGroup;
        this.organizationalUnitDistinguishedName = $.organizationalUnitDistinguishedName;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFileSystemSelfManagedActiveDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFileSystemSelfManagedActiveDirectoryArgs $;

        public Builder() {
            $ = new WindowsFileSystemSelfManagedActiveDirectoryArgs();
        }

        public Builder(WindowsFileSystemSelfManagedActiveDirectoryArgs defaults) {
            $ = new WindowsFileSystemSelfManagedActiveDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsIps A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
         * 
         * @return builder
         * 
         */
        public Builder dnsIps(Output<List<String>> dnsIps) {
            $.dnsIps = dnsIps;
            return this;
        }

        /**
         * @param dnsIps A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
         * 
         * @return builder
         * 
         */
        public Builder dnsIps(List<String> dnsIps) {
            return dnsIps(Output.of(dnsIps));
        }

        /**
         * @param dnsIps A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
         * 
         * @return builder
         * 
         */
        public Builder dnsIps(String... dnsIps) {
            return dnsIps(List.of(dnsIps));
        }

        /**
         * @param domainName The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
         * 
         * @return builder
         * 
         */
        public Builder domainName(Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param fileSystemAdministratorsGroup The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemAdministratorsGroup(@Nullable Output<String> fileSystemAdministratorsGroup) {
            $.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
            return this;
        }

        /**
         * @param fileSystemAdministratorsGroup The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemAdministratorsGroup(String fileSystemAdministratorsGroup) {
            return fileSystemAdministratorsGroup(Output.of(fileSystemAdministratorsGroup));
        }

        /**
         * @param organizationalUnitDistinguishedName The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnitDistinguishedName(@Nullable Output<String> organizationalUnitDistinguishedName) {
            $.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }

        /**
         * @param organizationalUnitDistinguishedName The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
            return organizationalUnitDistinguishedName(Output.of(organizationalUnitDistinguishedName));
        }

        /**
         * @param password The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public WindowsFileSystemSelfManagedActiveDirectoryArgs build() {
            $.dnsIps = Objects.requireNonNull($.dnsIps, "expected parameter 'dnsIps' to be non-null");
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
