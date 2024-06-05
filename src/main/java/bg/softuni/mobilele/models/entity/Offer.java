package bg.softuni.mobilele.models.entity;


import bg.softuni.mobilele.models.enums.EngineType;
import bg.softuni.mobilele.models.enums.TransmissionType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity{

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "engine")
    @Enumerated(value = EnumType.ORDINAL)
    private EngineType engineType;

    @Column
    private String imageUrl;

    @Column
    private Integer mileage;

    @Column(columnDefinition = "DECIMAL(19,2)")
    private Double price;

    @Column(name = "transmission")
    @Enumerated(value = EnumType.ORDINAL)
    private TransmissionType transmissionType;

    @Column
    private Integer year;

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime modified;

    @ManyToOne
    private Model model;

    @ManyToOne
    private User seller;

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }
}
