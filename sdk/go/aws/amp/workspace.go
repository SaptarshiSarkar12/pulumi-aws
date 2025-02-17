// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package amp

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Amazon Managed Service for Prometheus (AMP) Workspace.
//
// > **NOTE:** This AWS functionality is in Preview and may change before General Availability release. Backwards compatibility is not guaranteed between provider releases.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/amp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := amp.NewWorkspace(ctx, "demo", &amp.WorkspaceArgs{
//				Alias: pulumi.String("prometheus-test"),
//				Tags: pulumi.StringMap{
//					"Environment": pulumi.String("production"),
//					"Owner":       pulumi.String("abhi"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// AMP Workspaces can be imported using the identifier, e.g.,
//
// ```sh
//
//	$ pulumi import aws:amp/workspace:Workspace demo ws-C6DCB907-F2D7-4D96-957B-66691F865D8B
//
// ```
type Workspace struct {
	pulumi.CustomResourceState

	// The alias of the prometheus workspace. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-onboard-create-workspace.html).
	Alias pulumi.StringPtrOutput `pulumi:"alias"`
	// Amazon Resource Name (ARN) of the workspace.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Prometheus endpoint available for this workspace.
	PrometheusEndpoint pulumi.StringOutput `pulumi:"prometheusEndpoint"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewWorkspace registers a new resource with the given unique name, arguments, and options.
func NewWorkspace(ctx *pulumi.Context,
	name string, args *WorkspaceArgs, opts ...pulumi.ResourceOption) (*Workspace, error) {
	if args == nil {
		args = &WorkspaceArgs{}
	}

	var resource Workspace
	err := ctx.RegisterResource("aws:amp/workspace:Workspace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkspace gets an existing Workspace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkspace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkspaceState, opts ...pulumi.ResourceOption) (*Workspace, error) {
	var resource Workspace
	err := ctx.ReadResource("aws:amp/workspace:Workspace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Workspace resources.
type workspaceState struct {
	// The alias of the prometheus workspace. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-onboard-create-workspace.html).
	Alias *string `pulumi:"alias"`
	// Amazon Resource Name (ARN) of the workspace.
	Arn *string `pulumi:"arn"`
	// Prometheus endpoint available for this workspace.
	PrometheusEndpoint *string `pulumi:"prometheusEndpoint"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type WorkspaceState struct {
	// The alias of the prometheus workspace. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-onboard-create-workspace.html).
	Alias pulumi.StringPtrInput
	// Amazon Resource Name (ARN) of the workspace.
	Arn pulumi.StringPtrInput
	// Prometheus endpoint available for this workspace.
	PrometheusEndpoint pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (WorkspaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceState)(nil)).Elem()
}

type workspaceArgs struct {
	// The alias of the prometheus workspace. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-onboard-create-workspace.html).
	Alias *string `pulumi:"alias"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Workspace resource.
type WorkspaceArgs struct {
	// The alias of the prometheus workspace. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-onboard-create-workspace.html).
	Alias pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (WorkspaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceArgs)(nil)).Elem()
}

type WorkspaceInput interface {
	pulumi.Input

	ToWorkspaceOutput() WorkspaceOutput
	ToWorkspaceOutputWithContext(ctx context.Context) WorkspaceOutput
}

func (*Workspace) ElementType() reflect.Type {
	return reflect.TypeOf((**Workspace)(nil)).Elem()
}

func (i *Workspace) ToWorkspaceOutput() WorkspaceOutput {
	return i.ToWorkspaceOutputWithContext(context.Background())
}

func (i *Workspace) ToWorkspaceOutputWithContext(ctx context.Context) WorkspaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceOutput)
}

// WorkspaceArrayInput is an input type that accepts WorkspaceArray and WorkspaceArrayOutput values.
// You can construct a concrete instance of `WorkspaceArrayInput` via:
//
//	WorkspaceArray{ WorkspaceArgs{...} }
type WorkspaceArrayInput interface {
	pulumi.Input

	ToWorkspaceArrayOutput() WorkspaceArrayOutput
	ToWorkspaceArrayOutputWithContext(context.Context) WorkspaceArrayOutput
}

type WorkspaceArray []WorkspaceInput

func (WorkspaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workspace)(nil)).Elem()
}

func (i WorkspaceArray) ToWorkspaceArrayOutput() WorkspaceArrayOutput {
	return i.ToWorkspaceArrayOutputWithContext(context.Background())
}

func (i WorkspaceArray) ToWorkspaceArrayOutputWithContext(ctx context.Context) WorkspaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceArrayOutput)
}

// WorkspaceMapInput is an input type that accepts WorkspaceMap and WorkspaceMapOutput values.
// You can construct a concrete instance of `WorkspaceMapInput` via:
//
//	WorkspaceMap{ "key": WorkspaceArgs{...} }
type WorkspaceMapInput interface {
	pulumi.Input

	ToWorkspaceMapOutput() WorkspaceMapOutput
	ToWorkspaceMapOutputWithContext(context.Context) WorkspaceMapOutput
}

type WorkspaceMap map[string]WorkspaceInput

func (WorkspaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workspace)(nil)).Elem()
}

func (i WorkspaceMap) ToWorkspaceMapOutput() WorkspaceMapOutput {
	return i.ToWorkspaceMapOutputWithContext(context.Background())
}

func (i WorkspaceMap) ToWorkspaceMapOutputWithContext(ctx context.Context) WorkspaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceMapOutput)
}

type WorkspaceOutput struct{ *pulumi.OutputState }

func (WorkspaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Workspace)(nil)).Elem()
}

func (o WorkspaceOutput) ToWorkspaceOutput() WorkspaceOutput {
	return o
}

func (o WorkspaceOutput) ToWorkspaceOutputWithContext(ctx context.Context) WorkspaceOutput {
	return o
}

// The alias of the prometheus workspace. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-onboard-create-workspace.html).
func (o WorkspaceOutput) Alias() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Workspace) pulumi.StringPtrOutput { return v.Alias }).(pulumi.StringPtrOutput)
}

// Amazon Resource Name (ARN) of the workspace.
func (o WorkspaceOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Workspace) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Prometheus endpoint available for this workspace.
func (o WorkspaceOutput) PrometheusEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *Workspace) pulumi.StringOutput { return v.PrometheusEndpoint }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o WorkspaceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Workspace) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o WorkspaceOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Workspace) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type WorkspaceArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workspace)(nil)).Elem()
}

func (o WorkspaceArrayOutput) ToWorkspaceArrayOutput() WorkspaceArrayOutput {
	return o
}

func (o WorkspaceArrayOutput) ToWorkspaceArrayOutputWithContext(ctx context.Context) WorkspaceArrayOutput {
	return o
}

func (o WorkspaceArrayOutput) Index(i pulumi.IntInput) WorkspaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Workspace {
		return vs[0].([]*Workspace)[vs[1].(int)]
	}).(WorkspaceOutput)
}

type WorkspaceMapOutput struct{ *pulumi.OutputState }

func (WorkspaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workspace)(nil)).Elem()
}

func (o WorkspaceMapOutput) ToWorkspaceMapOutput() WorkspaceMapOutput {
	return o
}

func (o WorkspaceMapOutput) ToWorkspaceMapOutputWithContext(ctx context.Context) WorkspaceMapOutput {
	return o
}

func (o WorkspaceMapOutput) MapIndex(k pulumi.StringInput) WorkspaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Workspace {
		return vs[0].(map[string]*Workspace)[vs[1].(string)]
	}).(WorkspaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceInput)(nil)).Elem(), &Workspace{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceArrayInput)(nil)).Elem(), WorkspaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceMapInput)(nil)).Elem(), WorkspaceMap{})
	pulumi.RegisterOutputType(WorkspaceOutput{})
	pulumi.RegisterOutputType(WorkspaceArrayOutput{})
	pulumi.RegisterOutputType(WorkspaceMapOutput{})
}
