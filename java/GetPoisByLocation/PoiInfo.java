package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
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

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PoiInfo> {
        public String addr;
        public String name;
        public String sn;

        public Builder() {
        }

        public Builder(PoiInfo poiInfo) {
            super(poiInfo);
            if (poiInfo == null) {
                return;
            }
            this.name = poiInfo.name;
            this.addr = poiInfo.addr;
            this.sn = poiInfo.sn;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PoiInfo build(boolean z) {
            return new PoiInfo(this, z);
        }
    }

    public PoiInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.addr;
            if (str2 == null) {
                this.addr = "";
            } else {
                this.addr = str2;
            }
            String str3 = builder.sn;
            if (str3 == null) {
                this.sn = "";
                return;
            } else {
                this.sn = str3;
                return;
            }
        }
        this.name = builder.name;
        this.addr = builder.addr;
        this.sn = builder.sn;
    }
}
