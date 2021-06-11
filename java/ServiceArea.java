package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class ServiceArea extends Message {
    public static final String DEFAULT_PICURL = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_SERVICENAME = "";
    public static final String DEFAULT_SERVICEURL = "";
    public static final String DEFAULT_SERVICE_TYPE = "";
    public static final List<String> DEFAULT_THIRD_STATISTICS_URL = Collections.emptyList();
    public static final String DEFAULT_VERSION = "";
    @ProtoField(tag = 6)
    public final SmartApp area_smart_app;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String picurl;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String schema;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String service_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String servicename;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String serviceurl;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
    public final List<String> third_statistics_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String version;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ServiceArea> {
        public SmartApp area_smart_app;
        public String picurl;
        public String schema;
        public String service_type;
        public String servicename;
        public String serviceurl;
        public List<String> third_statistics_url;
        public String version;

        public Builder() {
        }

        public Builder(ServiceArea serviceArea) {
            super(serviceArea);
            if (serviceArea == null) {
                return;
            }
            this.servicename = serviceArea.servicename;
            this.picurl = serviceArea.picurl;
            this.serviceurl = serviceArea.serviceurl;
            this.version = serviceArea.version;
            this.service_type = serviceArea.service_type;
            this.area_smart_app = serviceArea.area_smart_app;
            this.schema = serviceArea.schema;
            this.third_statistics_url = Message.copyOf(serviceArea.third_statistics_url);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ServiceArea build(boolean z) {
            return new ServiceArea(this, z);
        }
    }

    public ServiceArea(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.servicename;
            if (str == null) {
                this.servicename = "";
            } else {
                this.servicename = str;
            }
            String str2 = builder.picurl;
            if (str2 == null) {
                this.picurl = "";
            } else {
                this.picurl = str2;
            }
            String str3 = builder.serviceurl;
            if (str3 == null) {
                this.serviceurl = "";
            } else {
                this.serviceurl = str3;
            }
            String str4 = builder.version;
            if (str4 == null) {
                this.version = "";
            } else {
                this.version = str4;
            }
            String str5 = builder.service_type;
            if (str5 == null) {
                this.service_type = "";
            } else {
                this.service_type = str5;
            }
            this.area_smart_app = builder.area_smart_app;
            String str6 = builder.schema;
            if (str6 == null) {
                this.schema = "";
            } else {
                this.schema = str6;
            }
            List<String> list = builder.third_statistics_url;
            if (list == null) {
                this.third_statistics_url = DEFAULT_THIRD_STATISTICS_URL;
                return;
            } else {
                this.third_statistics_url = Message.immutableCopyOf(list);
                return;
            }
        }
        this.servicename = builder.servicename;
        this.picurl = builder.picurl;
        this.serviceurl = builder.serviceurl;
        this.version = builder.version;
        this.service_type = builder.service_type;
        this.area_smart_app = builder.area_smart_app;
        this.schema = builder.schema;
        this.third_statistics_url = Message.immutableCopyOf(builder.third_statistics_url);
    }
}
