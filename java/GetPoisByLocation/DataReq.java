package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_LAT = "";
    public static final String DEFAULT_LNG = "";
    @ProtoField(tag = 3)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f14850common;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String lat;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String lng;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.lat == null) {
                this.lat = "";
            } else {
                this.lat = builder.lat;
            }
            if (builder.lng == null) {
                this.lng = "";
            } else {
                this.lng = builder.lng;
            }
            this.f14850common = builder.f14851common;
            return;
        }
        this.lat = builder.lat;
        this.lng = builder.lng;
        this.f14850common = builder.f14851common;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f14851common;
        public String lat;
        public String lng;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.lat = dataReq.lat;
                this.lng = dataReq.lng;
                this.f14851common = dataReq.f14850common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
