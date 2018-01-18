package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FloatInfo extends Message {
    public static final String DEFAULT_FLOAT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long end_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String float_url;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long start_time;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;

    private FloatInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.float_url == null) {
                this.float_url = "";
            } else {
                this.float_url = builder.float_url;
            }
            if (builder.start_time == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = builder.start_time;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
                return;
            } else {
                this.end_time = builder.end_time;
                return;
            }
        }
        this.float_url = builder.float_url;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FloatInfo> {
        public Long end_time;
        public String float_url;
        public Long start_time;

        public Builder() {
        }

        public Builder(FloatInfo floatInfo) {
            super(floatInfo);
            if (floatInfo != null) {
                this.float_url = floatInfo.float_url;
                this.start_time = floatInfo.start_time;
                this.end_time = floatInfo.end_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FloatInfo build(boolean z) {
            return new FloatInfo(this, z);
        }
    }
}
