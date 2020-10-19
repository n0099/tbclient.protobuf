package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
public final class PoiInfo extends Message {
    public static final String DEFAULT_ADDR = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SN = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String addr;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String sn;

    private PoiInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.addr == null) {
                this.addr = "";
            } else {
                this.addr = builder.addr;
            }
            if (builder.sn == null) {
                this.sn = "";
                return;
            } else {
                this.sn = builder.sn;
                return;
            }
        }
        this.name = builder.name;
        this.addr = builder.addr;
        this.sn = builder.sn;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<PoiInfo> {
        public String addr;
        public String name;
        public String sn;

        public Builder() {
        }

        public Builder(PoiInfo poiInfo) {
            super(poiInfo);
            if (poiInfo != null) {
                this.name = poiInfo.name;
                this.addr = poiInfo.addr;
                this.sn = poiInfo.sn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PoiInfo build(boolean z) {
            return new PoiInfo(this, z);
        }
    }
}
