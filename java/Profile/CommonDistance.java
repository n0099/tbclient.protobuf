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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<CommonDistance> {
        public Integer distance;
        public Integer time;

        public Builder() {
        }

        public Builder(CommonDistance commonDistance) {
            super(commonDistance);
            if (commonDistance == null) {
                return;
            }
            this.distance = commonDistance.distance;
            this.time = commonDistance.time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonDistance build(boolean z) {
            return new CommonDistance(this, z);
        }
    }

    public CommonDistance(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.distance;
            if (num == null) {
                this.distance = DEFAULT_DISTANCE;
            } else {
                this.distance = num;
            }
            Integer num2 = builder.time;
            if (num2 == null) {
                this.time = DEFAULT_TIME;
                return;
            } else {
                this.time = num2;
                return;
            }
        }
        this.distance = builder.distance;
        this.time = builder.time;
    }
}
