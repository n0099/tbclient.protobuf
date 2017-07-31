package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class CommonDistance extends Message {
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer distance;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer is_hide;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer time;
    public static final Integer DEFAULT_DISTANCE = 0;
    public static final Integer DEFAULT_TIME = 0;
    public static final Integer DEFAULT_IS_HIDE = 0;

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
            } else {
                this.time = builder.time;
            }
            if (builder.is_hide == null) {
                this.is_hide = DEFAULT_IS_HIDE;
                return;
            } else {
                this.is_hide = builder.is_hide;
                return;
            }
        }
        this.distance = builder.distance;
        this.time = builder.time;
        this.is_hide = builder.is_hide;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<CommonDistance> {
        public Integer distance;
        public Integer is_hide;
        public Integer time;

        public Builder() {
        }

        public Builder(CommonDistance commonDistance) {
            super(commonDistance);
            if (commonDistance != null) {
                this.distance = commonDistance.distance;
                this.time = commonDistance.time;
                this.is_hide = commonDistance.is_hide;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonDistance build(boolean z) {
            return new CommonDistance(this, z);
        }
    }
}
