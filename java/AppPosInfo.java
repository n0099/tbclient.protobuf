package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AppPosInfo extends Message {
    public static final String DEFAULT_AP_MAC = "";
    public static final String DEFAULT_ASP_SHOWN_INFO = "";
    public static final String DEFAULT_COORDINATE_TYPE = "";
    public static final String DEFAULT_LATITUDE = "";
    public static final String DEFAULT_LONGITUDE = "";
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long addr_timestamp;
    @ProtoField(tag = 2, type = Message.Datatype.BOOL)
    public final Boolean ap_connected;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String ap_mac;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String asp_shown_info;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String coordinate_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String latitude;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String longitude;
    public static final Boolean DEFAULT_AP_CONNECTED = false;
    public static final Long DEFAULT_ADDR_TIMESTAMP = 0L;

    private AppPosInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ap_mac == null) {
                this.ap_mac = "";
            } else {
                this.ap_mac = builder.ap_mac;
            }
            if (builder.ap_connected == null) {
                this.ap_connected = DEFAULT_AP_CONNECTED;
            } else {
                this.ap_connected = builder.ap_connected;
            }
            if (builder.coordinate_type == null) {
                this.coordinate_type = "";
            } else {
                this.coordinate_type = builder.coordinate_type;
            }
            if (builder.longitude == null) {
                this.longitude = "";
            } else {
                this.longitude = builder.longitude;
            }
            if (builder.latitude == null) {
                this.latitude = "";
            } else {
                this.latitude = builder.latitude;
            }
            if (builder.addr_timestamp == null) {
                this.addr_timestamp = DEFAULT_ADDR_TIMESTAMP;
            } else {
                this.addr_timestamp = builder.addr_timestamp;
            }
            if (builder.asp_shown_info == null) {
                this.asp_shown_info = "";
                return;
            } else {
                this.asp_shown_info = builder.asp_shown_info;
                return;
            }
        }
        this.ap_mac = builder.ap_mac;
        this.ap_connected = builder.ap_connected;
        this.coordinate_type = builder.coordinate_type;
        this.longitude = builder.longitude;
        this.latitude = builder.latitude;
        this.addr_timestamp = builder.addr_timestamp;
        this.asp_shown_info = builder.asp_shown_info;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AppPosInfo> {
        public Long addr_timestamp;
        public Boolean ap_connected;
        public String ap_mac;
        public String asp_shown_info;
        public String coordinate_type;
        public String latitude;
        public String longitude;

        public Builder() {
        }

        public Builder(AppPosInfo appPosInfo) {
            super(appPosInfo);
            if (appPosInfo != null) {
                this.ap_mac = appPosInfo.ap_mac;
                this.ap_connected = appPosInfo.ap_connected;
                this.coordinate_type = appPosInfo.coordinate_type;
                this.longitude = appPosInfo.longitude;
                this.latitude = appPosInfo.latitude;
                this.addr_timestamp = appPosInfo.addr_timestamp;
                this.asp_shown_info = appPosInfo.asp_shown_info;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AppPosInfo build(boolean z) {
            return new AppPosInfo(this, z);
        }
    }
}
