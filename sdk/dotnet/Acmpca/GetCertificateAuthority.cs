// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Acmpca
{
    public static class GetCertificateAuthority
    {
        /// <summary>
        /// Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Acmpca.GetCertificateAuthority.Invoke(new()
        ///     {
        ///         Arn = "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCertificateAuthorityResult> InvokeAsync(GetCertificateAuthorityArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCertificateAuthorityResult>("aws:acmpca/getCertificateAuthority:getCertificateAuthority", args ?? new GetCertificateAuthorityArgs(), options.WithDefaults());

        /// <summary>
        /// Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Acmpca.GetCertificateAuthority.Invoke(new()
        ///     {
        ///         Arn = "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCertificateAuthorityResult> Invoke(GetCertificateAuthorityInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetCertificateAuthorityResult>("aws:acmpca/getCertificateAuthority:getCertificateAuthority", args ?? new GetCertificateAuthorityInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCertificateAuthorityArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the certificate authority.
        /// </summary>
        [Input("arn", required: true)]
        public string Arn { get; set; } = null!;

        [Input("revocationConfigurations")]
        private List<Inputs.GetCertificateAuthorityRevocationConfigurationArgs>? _revocationConfigurations;

        /// <summary>
        /// Nested attribute containing revocation configuration.
        /// * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
        /// * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
        /// * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
        /// * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
        /// * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
        /// * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
        /// * `revocation_configuration.0.ocsp_configuration.0.enabled` - Boolean value that specifies whether a custom OCSP responder is enabled.
        /// * `revocation_configuration.0.ocsp_configuration.0.ocsp_custom_cname` - A CNAME specifying a customized OCSP domain.
        /// </summary>
        public List<Inputs.GetCertificateAuthorityRevocationConfigurationArgs> RevocationConfigurations
        {
            get => _revocationConfigurations ?? (_revocationConfigurations = new List<Inputs.GetCertificateAuthorityRevocationConfigurationArgs>());
            set => _revocationConfigurations = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Key-value map of user-defined tags that are attached to the certificate authority.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetCertificateAuthorityArgs()
        {
        }
        public static new GetCertificateAuthorityArgs Empty => new GetCertificateAuthorityArgs();
    }

    public sealed class GetCertificateAuthorityInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ARN of the certificate authority.
        /// </summary>
        [Input("arn", required: true)]
        public Input<string> Arn { get; set; } = null!;

        [Input("revocationConfigurations")]
        private InputList<Inputs.GetCertificateAuthorityRevocationConfigurationInputArgs>? _revocationConfigurations;

        /// <summary>
        /// Nested attribute containing revocation configuration.
        /// * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
        /// * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
        /// * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
        /// * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
        /// * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
        /// * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
        /// * `revocation_configuration.0.ocsp_configuration.0.enabled` - Boolean value that specifies whether a custom OCSP responder is enabled.
        /// * `revocation_configuration.0.ocsp_configuration.0.ocsp_custom_cname` - A CNAME specifying a customized OCSP domain.
        /// </summary>
        public InputList<Inputs.GetCertificateAuthorityRevocationConfigurationInputArgs> RevocationConfigurations
        {
            get => _revocationConfigurations ?? (_revocationConfigurations = new InputList<Inputs.GetCertificateAuthorityRevocationConfigurationInputArgs>());
            set => _revocationConfigurations = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of user-defined tags that are attached to the certificate authority.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetCertificateAuthorityInvokeArgs()
        {
        }
        public static new GetCertificateAuthorityInvokeArgs Empty => new GetCertificateAuthorityInvokeArgs();
    }


    [OutputType]
    public sealed class GetCertificateAuthorityResult
    {
        public readonly string Arn;
        /// <summary>
        /// Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
        /// </summary>
        public readonly string Certificate;
        /// <summary>
        /// Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
        /// </summary>
        public readonly string CertificateChain;
        /// <summary>
        /// The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
        /// </summary>
        public readonly string CertificateSigningRequest;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
        /// </summary>
        public readonly string NotAfter;
        /// <summary>
        /// Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
        /// </summary>
        public readonly string NotBefore;
        /// <summary>
        /// Nested attribute containing revocation configuration.
        /// * `revocation_configuration.0.crl_configuration` - Nested attribute containing configuration of the certificate revocation list (CRL), if any, maintained by the certificate authority.
        /// * `revocation_configuration.0.crl_configuration.0.custom_cname` - Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point.
        /// * `revocation_configuration.0.crl_configuration.0.enabled` - Boolean value that specifies whether certificate revocation lists (CRLs) are enabled.
        /// * `revocation_configuration.0.crl_configuration.0.expiration_in_days` - Number of days until a certificate expires.
        /// * `revocation_configuration.0.crl_configuration.0.s3_bucket_name` - Name of the S3 bucket that contains the CRL.
        /// * `revocation_configuration.0.crl_configuration.0.s3_object_acl` - Whether the CRL is publicly readable or privately held in the CRL Amazon S3 bucket.
        /// * `revocation_configuration.0.ocsp_configuration.0.enabled` - Boolean value that specifies whether a custom OCSP responder is enabled.
        /// * `revocation_configuration.0.ocsp_configuration.0.ocsp_custom_cname` - A CNAME specifying a customized OCSP domain.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCertificateAuthorityRevocationConfigurationResult> RevocationConfigurations;
        /// <summary>
        /// Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
        /// </summary>
        public readonly string Serial;
        /// <summary>
        /// Status of the certificate authority.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Key-value map of user-defined tags that are attached to the certificate authority.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Type of the certificate authority.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetCertificateAuthorityResult(
            string arn,

            string certificate,

            string certificateChain,

            string certificateSigningRequest,

            string id,

            string notAfter,

            string notBefore,

            ImmutableArray<Outputs.GetCertificateAuthorityRevocationConfigurationResult> revocationConfigurations,

            string serial,

            string status,

            ImmutableDictionary<string, string> tags,

            string type)
        {
            Arn = arn;
            Certificate = certificate;
            CertificateChain = certificateChain;
            CertificateSigningRequest = certificateSigningRequest;
            Id = id;
            NotAfter = notAfter;
            NotBefore = notBefore;
            RevocationConfigurations = revocationConfigurations;
            Serial = serial;
            Status = status;
            Tags = tags;
            Type = type;
        }
    }
}
