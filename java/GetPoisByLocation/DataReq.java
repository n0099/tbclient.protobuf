package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_LAT = "";
    public static final String DEFAULT_LNG = "";
    @ProtoField(tag = 3)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69391common;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String lat;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String lng;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69392common;
        public String lat;
        public String lng;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.lat = dataReq.lat;
            this.lng = dataReq.lng;
            this.f69392common = dataReq.f69391common;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.lat;
            if (str == null) {
                this.lat = "";
            } else {
                this.lat = str;
            }
            String str2 = builder.lng;
            if (str2 == null) {
                this.lng = "";
            } else {
                this.lng = str2;
            }
            this.f69391common = builder.f69392common;
            return;
        }
        this.lat = builder.lat;
        this.lng = builder.lng;
        this.f69391common = builder.f69392common;
    }
}
