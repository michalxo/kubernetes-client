
package io.fabric8.openshift.api.model.hive.openstack.v1;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "certificatesSecretRef",
    "cloud",
    "credentialsSecretRef",
    "trunkSupport"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
public class Platform implements KubernetesResource
{

    @JsonProperty("certificatesSecretRef")
    private io.fabric8.kubernetes.api.model.LocalObjectReference certificatesSecretRef;
    @JsonProperty("cloud")
    private String cloud;
    @JsonProperty("credentialsSecretRef")
    private io.fabric8.kubernetes.api.model.LocalObjectReference credentialsSecretRef;
    @JsonProperty("trunkSupport")
    private Boolean trunkSupport;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Platform() {
    }

    /**
     * 
     * @param cloud
     * @param credentialsSecretRef
     * @param certificatesSecretRef
     * @param trunkSupport
     */
    public Platform(io.fabric8.kubernetes.api.model.LocalObjectReference certificatesSecretRef, String cloud, io.fabric8.kubernetes.api.model.LocalObjectReference credentialsSecretRef, Boolean trunkSupport) {
        super();
        this.certificatesSecretRef = certificatesSecretRef;
        this.cloud = cloud;
        this.credentialsSecretRef = credentialsSecretRef;
        this.trunkSupport = trunkSupport;
    }

    @JsonProperty("certificatesSecretRef")
    public io.fabric8.kubernetes.api.model.LocalObjectReference getCertificatesSecretRef() {
        return certificatesSecretRef;
    }

    @JsonProperty("certificatesSecretRef")
    public void setCertificatesSecretRef(io.fabric8.kubernetes.api.model.LocalObjectReference certificatesSecretRef) {
        this.certificatesSecretRef = certificatesSecretRef;
    }

    @JsonProperty("cloud")
    public String getCloud() {
        return cloud;
    }

    @JsonProperty("cloud")
    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    @JsonProperty("credentialsSecretRef")
    public io.fabric8.kubernetes.api.model.LocalObjectReference getCredentialsSecretRef() {
        return credentialsSecretRef;
    }

    @JsonProperty("credentialsSecretRef")
    public void setCredentialsSecretRef(io.fabric8.kubernetes.api.model.LocalObjectReference credentialsSecretRef) {
        this.credentialsSecretRef = credentialsSecretRef;
    }

    @JsonProperty("trunkSupport")
    public Boolean getTrunkSupport() {
        return trunkSupport;
    }

    @JsonProperty("trunkSupport")
    public void setTrunkSupport(Boolean trunkSupport) {
        this.trunkSupport = trunkSupport;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
