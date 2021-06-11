package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class AppPosInfo extends Message {
    public static final String DEFAULT_AP_MAC = "";
    public static final String DEFAULT_ASP_SHOWN_INFO = "";
    public static final String DEFAULT_COORDINATE_TYPE = "";
    public static final String DEFAULT_LATITUDE = "";
    public static final String DEFAULT_LONGITUDE = "";
    public static final String DEFAULT_MERCATOR_LAT = "";
    public static final String DEFAULT_MERCATOR_LON = "";
    public static final String DEFAULT_MERCATOR_RADIUS = "";
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
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer mercator_city;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String mercator_lat;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String mercator_lon;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String mercator_radius;
    @ProtoField(tag = 11, type = Message.Datatype.INT64)
    public final Long mercator_time;
    public static final Boolean DEFAULT_AP_CONNECTED = Boolean.FALSE;
    public static final Long DEFAULT_ADDR_TIMESTAMP = 0L;
    public static final Long DEFAULT_MERCATOR_TIME = 0L;
    public static final Integer DEFAULT_MERCATOR_CITY = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<AppPosInfo> {
        public Long addr_timestamp;
        public Boolean ap_connected;
        public String ap_mac;
        public String asp_shown_info;
        public String coordinate_type;
        public String latitude;
        public String longitude;
        public Integer mercator_city;
        public String mercator_lat;
        public String mercator_lon;
        public String mercator_radius;
        public Long mercator_time;

        public Builder() {
        }

        public Builder(AppPosInfo appPosInfo) {
            super(appPosInfo);
            if (appPosInfo == null) {
                return;
            }
            this.ap_mac = appPosInfo.ap_mac;
            this.ap_connected = appPosInfo.ap_connected;
            this.coordinate_type = appPosInfo.coordinate_type;
            this.longitude = appPosInfo.longitude;
            this.latitude = appPosInfo.latitude;
            this.addr_timestamp = appPosInfo.addr_timestamp;
            this.asp_shown_info = appPosInfo.asp_shown_info;
            this.mercator_lat = appPosInfo.mercator_lat;
            this.mercator_lon = appPosInfo.mercator_lon;
            this.mercator_radius = appPosInfo.mercator_radius;
            this.mercator_time = appPosInfo.mercator_time;
            this.mercator_city = appPosInfo.mercator_city;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AppPosInfo build(boolean z) {
            return new AppPosInfo(this, z);
        }
    }

    public AppPosInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.ap_mac;
            if (str == null) {
                this.ap_mac = "";
            } else {
                this.ap_mac = str;
            }
            Boolean bool = builder.ap_connected;
            if (bool == null) {
                this.ap_connected = DEFAULT_AP_CONNECTED;
            } else {
                this.ap_connected = bool;
            }
            String str2 = builder.coordinate_type;
            if (str2 == null) {
                this.coordinate_type = "";
            } else {
                this.coordinate_type = str2;
            }
            String str3 = builder.longitude;
            if (str3 == null) {
                this.longitude = "";
            } else {
                this.longitude = str3;
            }
            String str4 = builder.latitude;
            if (str4 == null) {
                this.latitude = "";
            } else {
                this.latitude = str4;
            }
            Long l = builder.addr_timestamp;
            if (l == null) {
                this.addr_timestamp = DEFAULT_ADDR_TIMESTAMP;
            } else {
                this.addr_timestamp = l;
            }
            String str5 = builder.asp_shown_info;
            if (str5 == null) {
                this.asp_shown_info = "";
            } else {
                this.asp_shown_info = str5;
            }
            String str6 = builder.mercator_lat;
            if (str6 == null) {
                this.mercator_lat = "";
            } else {
                this.mercator_lat = str6;
            }
            String str7 = builder.mercator_lon;
            if (str7 == null) {
                this.mercator_lon = "";
            } else {
                this.mercator_lon = str7;
            }
            String str8 = builder.mercator_radius;
            if (str8 == null) {
                this.mercator_radius = "";
            } else {
                this.mercator_radius = str8;
            }
            Long l2 = builder.mercator_time;
            if (l2 == null) {
                this.mercator_time = DEFAULT_MERCATOR_TIME;
            } else {
                this.mercator_time = l2;
            }
            Integer num = builder.mercator_city;
            if (num == null) {
                this.mercator_city = DEFAULT_MERCATOR_CITY;
                return;
            } else {
                this.mercator_city = num;
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
        this.mercator_lat = builder.mercator_lat;
        this.mercator_lon = builder.mercator_lon;
        this.mercator_radius = builder.mercator_radius;
        this.mercator_time = builder.mercator_time;
        this.mercator_city = builder.mercator_city;
    }
}
