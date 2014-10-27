package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PoiInfo extends Message {
    public static final String DEFAULT_ADDR = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String addr;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    /* synthetic */ PoiInfo(Builder builder, boolean z, PoiInfo poiInfo) {
        this(builder, z);
    }

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
                return;
            } else {
                this.addr = builder.addr;
                return;
            }
        }
        this.name = builder.name;
        this.addr = builder.addr;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<PoiInfo> {
        public String addr;
        public String name;

        public Builder(PoiInfo poiInfo) {
            super(poiInfo);
            if (poiInfo != null) {
                this.name = poiInfo.name;
                this.addr = poiInfo.addr;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PoiInfo build(boolean z) {
            return new PoiInfo(this, z, null);
        }
    }
}
