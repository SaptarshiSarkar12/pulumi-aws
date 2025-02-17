// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { EndpointAccessArgs, EndpointAccessState } from "./endpointAccess";
export type EndpointAccess = import("./endpointAccess").EndpointAccess;
export const EndpointAccess: typeof import("./endpointAccess").EndpointAccess = null as any;

export { NamespaceArgs, NamespaceState } from "./namespace";
export type Namespace = import("./namespace").Namespace;
export const Namespace: typeof import("./namespace").Namespace = null as any;

export { UsageLimitArgs, UsageLimitState } from "./usageLimit";
export type UsageLimit = import("./usageLimit").UsageLimit;
export const UsageLimit: typeof import("./usageLimit").UsageLimit = null as any;

export { WorkgroupArgs, WorkgroupState } from "./workgroup";
export type Workgroup = import("./workgroup").Workgroup;
export const Workgroup: typeof import("./workgroup").Workgroup = null as any;

utilities.lazyLoad(exports, ["EndpointAccess"], () => require("./endpointAccess"));
utilities.lazyLoad(exports, ["Namespace"], () => require("./namespace"));
utilities.lazyLoad(exports, ["UsageLimit"], () => require("./usageLimit"));
utilities.lazyLoad(exports, ["Workgroup"], () => require("./workgroup"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:redshiftserverless/endpointAccess:EndpointAccess":
                return new EndpointAccess(name, <any>undefined, { urn })
            case "aws:redshiftserverless/namespace:Namespace":
                return new Namespace(name, <any>undefined, { urn })
            case "aws:redshiftserverless/usageLimit:UsageLimit":
                return new UsageLimit(name, <any>undefined, { urn })
            case "aws:redshiftserverless/workgroup:Workgroup":
                return new Workgroup(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "redshiftserverless/endpointAccess", _module)
pulumi.runtime.registerResourceModule("aws", "redshiftserverless/namespace", _module)
pulumi.runtime.registerResourceModule("aws", "redshiftserverless/usageLimit", _module)
pulumi.runtime.registerResourceModule("aws", "redshiftserverless/workgroup", _module)
