package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class CommonLocation extends Message {
    public static final String DEFAULT_DISTANCE = "";
    public static final Long DEFAULT_TIME = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String distance;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long time;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<CommonLocation> {
        public String distance;
        public Long time;

        public Builder() {
        }

        public Builder(CommonLocation commonLocation) {
            super(commonLocation);
            if (commonLocation == null) {
                return;
            }
            this.distance = commonLocation.distance;
            this.time = commonLocation.time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonLocation build(boolean z) {
            return new CommonLocation(this, z);
        }
    }

    public CommonLocation(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.distance;
            if (str == null) {
                this.distance = "";
            } else {
                this.distance = str;
            }
            Long l = builder.time;
            if (l == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = l;
                return;
            }
        }
        this.distance = builder.distance;
        this.time = builder.time;
    }
}
