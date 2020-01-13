package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class LbsInfo extends Message {
    public static final String DEFAULT_LAT = "";
    public static final String DEFAULT_LON = "";
    public static final String DEFAULT_TOWN = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String lat;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String lon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String town;

    private LbsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.lat == null) {
                this.lat = "";
            } else {
                this.lat = builder.lat;
            }
            if (builder.lon == null) {
                this.lon = "";
            } else {
                this.lon = builder.lon;
            }
            if (builder.town == null) {
                this.town = "";
                return;
            } else {
                this.town = builder.town;
                return;
            }
        }
        this.lat = builder.lat;
        this.lon = builder.lon;
        this.town = builder.town;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<LbsInfo> {
        public String lat;
        public String lon;
        public String town;

        public Builder() {
        }

        public Builder(LbsInfo lbsInfo) {
            super(lbsInfo);
            if (lbsInfo != null) {
                this.lat = lbsInfo.lat;
                this.lon = lbsInfo.lon;
                this.town = lbsInfo.town;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LbsInfo build(boolean z) {
            return new LbsInfo(this, z);
        }
    }
}
