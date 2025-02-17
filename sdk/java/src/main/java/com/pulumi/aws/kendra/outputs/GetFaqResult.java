// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.aws.kendra.outputs.GetFaqS3Path;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFaqResult {
    /**
     * @return ARN of the FAQ.
     * 
     */
    private String arn;
    /**
     * @return Unix datetime that the faq was created.
     * 
     */
    private String createdAt;
    /**
     * @return Description of the FAQ.
     * 
     */
    private String description;
    /**
     * @return When the `status` field value is `FAILED`, this contains a message that explains why.
     * 
     */
    private String errorMessage;
    private String faqId;
    /**
     * @return File format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
     * 
     */
    private String fileFormat;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String indexId;
    /**
     * @return Code for a language. This shows a supported language for the FAQ document. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
     * 
     */
    private String languageCode;
    /**
     * @return Name of the FAQ.
     * 
     */
    private String name;
    /**
     * @return ARN of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     * 
     */
    private String roleArn;
    /**
     * @return S3 location of the FAQ input data. Detailed below.
     * 
     */
    private List<GetFaqS3Path> s3Paths;
    /**
     * @return Status of the FAQ. It is ready to use when the status is ACTIVE.
     * 
     */
    private String status;
    /**
     * @return Metadata that helps organize the FAQs you create.
     * 
     */
    private Map<String,String> tags;
    /**
     * @return Date and time that the FAQ was last updated.
     * 
     */
    private String updatedAt;

    private GetFaqResult() {}
    /**
     * @return ARN of the FAQ.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Unix datetime that the faq was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Description of the FAQ.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return When the `status` field value is `FAILED`, this contains a message that explains why.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    public String faqId() {
        return this.faqId;
    }
    /**
     * @return File format used by the input files for the FAQ. Valid Values are `CSV`, `CSV_WITH_HEADER`, `JSON`.
     * 
     */
    public String fileFormat() {
        return this.fileFormat;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String indexId() {
        return this.indexId;
    }
    /**
     * @return Code for a language. This shows a supported language for the FAQ document. For more information on supported languages, including their codes, see [Adding documents in languages other than English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html).
     * 
     */
    public String languageCode() {
        return this.languageCode;
    }
    /**
     * @return Name of the FAQ.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return ARN of a role with permission to access the S3 bucket that contains the FAQs. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return S3 location of the FAQ input data. Detailed below.
     * 
     */
    public List<GetFaqS3Path> s3Paths() {
        return this.s3Paths;
    }
    /**
     * @return Status of the FAQ. It is ready to use when the status is ACTIVE.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Metadata that helps organize the FAQs you create.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Date and time that the FAQ was last updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFaqResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String createdAt;
        private String description;
        private String errorMessage;
        private String faqId;
        private String fileFormat;
        private String id;
        private String indexId;
        private String languageCode;
        private String name;
        private String roleArn;
        private List<GetFaqS3Path> s3Paths;
        private String status;
        private Map<String,String> tags;
        private String updatedAt;
        public Builder() {}
        public Builder(GetFaqResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.errorMessage = defaults.errorMessage;
    	      this.faqId = defaults.faqId;
    	      this.fileFormat = defaults.fileFormat;
    	      this.id = defaults.id;
    	      this.indexId = defaults.indexId;
    	      this.languageCode = defaults.languageCode;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.s3Paths = defaults.s3Paths;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        @CustomType.Setter
        public Builder faqId(String faqId) {
            this.faqId = Objects.requireNonNull(faqId);
            return this;
        }
        @CustomType.Setter
        public Builder fileFormat(String fileFormat) {
            this.fileFormat = Objects.requireNonNull(fileFormat);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder indexId(String indexId) {
            this.indexId = Objects.requireNonNull(indexId);
            return this;
        }
        @CustomType.Setter
        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        @CustomType.Setter
        public Builder s3Paths(List<GetFaqS3Path> s3Paths) {
            this.s3Paths = Objects.requireNonNull(s3Paths);
            return this;
        }
        public Builder s3Paths(GetFaqS3Path... s3Paths) {
            return s3Paths(List.of(s3Paths));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        public GetFaqResult build() {
            final var o = new GetFaqResult();
            o.arn = arn;
            o.createdAt = createdAt;
            o.description = description;
            o.errorMessage = errorMessage;
            o.faqId = faqId;
            o.fileFormat = fileFormat;
            o.id = id;
            o.indexId = indexId;
            o.languageCode = languageCode;
            o.name = name;
            o.roleArn = roleArn;
            o.s3Paths = s3Paths;
            o.status = status;
            o.tags = tags;
            o.updatedAt = updatedAt;
            return o;
        }
    }
}
