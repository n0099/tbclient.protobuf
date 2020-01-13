package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class CommonDistance extends Message {
    public static final Integer DEFAULT_DISTANCE = 0;
    public static final Integer DEFAULT_TIME = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer distance;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer time;

    private CommonDistance(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.distance == null) {
                this.distance = DEFAULT_DISTANCE;
            } else {
                this.distance = builder.distance;
            }
            if (builder.time == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = builder.time;
                return;
            }
        }
        this.distance = builder.distance;
        this.time = builder.time;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<CommonDistance> {
        public Integer distance;
        public Integer time;

        public Builder() {
        }

        public Builder(CommonDistance commonDistance) {
            super(commonDistance);
            if (commonDistance != null) {
                this.distance = commonDistance.distance;
                this.time = commonDistance.time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonDistance build(boolean z) {
            return new CommonDistance(this, z);
        }
    }
}
