// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourceResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Set to the ID of the parent Resource.
     * 
     */
    private String parentId;
    private String path;
    /**
     * @return Set to the path relative to the parent Resource.
     * 
     */
    private String pathPart;
    private String restApiId;

    private GetResourceResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Set to the ID of the parent Resource.
     * 
     */
    public String parentId() {
        return this.parentId;
    }
    public String path() {
        return this.path;
    }
    /**
     * @return Set to the path relative to the parent Resource.
     * 
     */
    public String pathPart() {
        return this.pathPart;
    }
    public String restApiId() {
        return this.restApiId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String parentId;
        private String path;
        private String pathPart;
        private String restApiId;
        public Builder() {}
        public Builder(GetResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parentId = defaults.parentId;
    	      this.path = defaults.path;
    	      this.pathPart = defaults.pathPart;
    	      this.restApiId = defaults.restApiId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder parentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder pathPart(String pathPart) {
            this.pathPart = Objects.requireNonNull(pathPart);
            return this;
        }
        @CustomType.Setter
        public Builder restApiId(String restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public GetResourceResult build() {
            final var o = new GetResourceResult();
            o.id = id;
            o.parentId = parentId;
            o.path = path;
            o.pathPart = pathPart;
            o.restApiId = restApiId;
            return o;
        }
    }
}
