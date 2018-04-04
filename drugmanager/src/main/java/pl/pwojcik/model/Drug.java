package pl.pwojcik.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="drugs")
public class Drug {
	

	@Column(name="name")
	private String name;
	
	@Column(name="common_name")
	private String commonName;
	
	@Column(name="dosage")
	private String dosage;
	
	@Column(name="usage_type")
	private String UsageType;
	
	@Column(name="producer")
	private String producer;
	
	@Column(name="pack_quantity")
	private String packQuantity;
	
	@Column(name="active_substance")
	private String activeSubstance;
	
	@Column(name="leaflet")
	private String feaflet;
	
	@Column(name="characteristics")
	private String characteristics;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
    @JsonIgnore
	private Long id;
	
	@JsonIgnore
	@Column(name="internal_id")
	private Integer internalId;
	
	@JsonIgnore
	@Column(name="exp_date")
	private String expirationDate;
	
	@JsonIgnore
	@Column(name="procedure_type")
	private String procedureType;
	
	@JsonIgnore
	@Column(name="type")
	private String type;
	
	@JsonIgnore
	@Column(name="target_spec")
	private String targetSpec;
	
	@JsonIgnore
	@Column(name="okr_kar")
	private String okrKar;
	
	@JsonIgnore
	@Column(name="permission_number")
	private Integer permissionNumber;
	
	@JsonIgnore
	@Column(name="atc")
	private String atc;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getInternalId() {
		return internalId;
	}

	public void setInternalId(Integer internalId) {
		this.internalId = internalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTargetSpec() {
		return targetSpec;
	}

	public void setTargetSpec(String targetSpec) {
		this.targetSpec = targetSpec;
	}

	public String getOkrKar() {
		return okrKar;
	}

	public void setOkrKar(String okrKar) {
		this.okrKar = okrKar;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getUsageType() {
		return UsageType;
	}

	public void setUsageType(String usageType) {
		UsageType = usageType;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getProcedureType() {
		return procedureType;
	}

	public void setProcedureType(String procedureType) {
		this.procedureType = procedureType;
	}

	public Integer getPermissionNumber() {
		return permissionNumber;
	}

	public void setPermissionNumber(Integer permissionNumber) {
		this.permissionNumber = permissionNumber;
	}

	public String getAtc() {
		return atc;
	}

	public void setAtc(String atc) {
		this.atc = atc;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getPackQuantity() {
		return packQuantity;
	}

	public void setPackQuantity(String packQuantity) {
		this.packQuantity = packQuantity;
	}

	public String getActiveSubstance() {
		return activeSubstance;
	}

	public void setActiveSubstance(String activeSubstance) {
		this.activeSubstance = activeSubstance;
	}

	public String getFeaflet() {
		return feaflet;
	}

	public void setFeaflet(String feaflet) {
		this.feaflet = feaflet;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	
	
	
	
	
	
}
