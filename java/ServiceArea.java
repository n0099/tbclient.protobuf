package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class ServiceArea extends Message {
    public static final String DEFAULT_PICURL = "";
    public static final String DEFAULT_SERVICENAME = "";
    public static final String DEFAULT_SERVICEURL = "";
    public static final String DEFAULT_SERVICE_TYPE = "";
    public static final String DEFAULT_VERSION = "";
    @ProtoField(tag = 6)
    public final SmartApp area_smart_app;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String picurl;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String service_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String servicename;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String serviceurl;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String version;

    private ServiceArea(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.servicename == null) {
                this.servicename = "";
            } else {
                this.servicename = builder.servicename;
            }
            if (builder.picurl == null) {
                this.picurl = "";
            } else {
                this.picurl = builder.picurl;
            }
            if (builder.serviceurl == null) {
                this.serviceurl = "";
            } else {
                this.serviceurl = builder.serviceurl;
            }
            if (builder.version == null) {
                this.version = "";
            } else {
                this.version = builder.version;
            }
            if (builder.service_type == null) {
                this.service_type = "";
            } else {
                this.service_type = builder.service_type;
            }
            this.area_smart_app = builder.area_smart_app;
            return;
        }
        this.servicename = builder.servicename;
        this.picurl = builder.picurl;
        this.serviceurl = builder.serviceurl;
        this.version = builder.version;
        this.service_type = builder.service_type;
        this.area_smart_app = builder.area_smart_app;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<ServiceArea> {
        public SmartApp area_smart_app;
        public String picurl;
        public String service_type;
        public String servicename;
        public String serviceurl;
        public String version;

        public Builder() {
        }

        public Builder(ServiceArea serviceArea) {
            super(serviceArea);
            if (serviceArea != null) {
                this.servicename = serviceArea.servicename;
                this.picurl = serviceArea.picurl;
                this.serviceurl = serviceArea.serviceurl;
                this.version = serviceArea.version;
                this.service_type = serviceArea.service_type;
                this.area_smart_app = serviceArea.area_smart_app;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ServiceArea build(boolean z) {
            return new ServiceArea(this, z);
        }
    }
}
