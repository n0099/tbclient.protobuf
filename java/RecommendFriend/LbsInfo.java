package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class LbsInfo extends Message {
    public static final String DEFAULT_DISTANCE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String distance;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_hide;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long time;
    public static final Long DEFAULT_TIME = 0L;
    public static final Integer DEFAULT_IS_HIDE = 0;

    private LbsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.distance == null) {
                this.distance = "";
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

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<LbsInfo> {
        public String distance;
        public Integer is_hide;
        public Long time;

        public Builder() {
        }

        public Builder(LbsInfo lbsInfo) {
            super(lbsInfo);
            if (lbsInfo != null) {
                this.distance = lbsInfo.distance;
                this.time = lbsInfo.time;
                this.is_hide = lbsInfo.is_hide;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LbsInfo build(boolean z) {
            return new LbsInfo(this, z);
        }
    }
}
