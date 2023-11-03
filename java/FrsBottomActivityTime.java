package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class FrsBottomActivityTime extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long start_time;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<FrsBottomActivityTime> {
        public Long end_time;
        public Long start_time;

        public Builder() {
        }

        public Builder(FrsBottomActivityTime frsBottomActivityTime) {
            super(frsBottomActivityTime);
            if (frsBottomActivityTime == null) {
                return;
            }
            this.start_time = frsBottomActivityTime.start_time;
            this.end_time = frsBottomActivityTime.end_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsBottomActivityTime build(boolean z) {
            return new FrsBottomActivityTime(this, z);
        }
    }

    public FrsBottomActivityTime(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.start_time;
            if (l == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l;
            }
            Long l2 = builder.end_time;
            if (l2 == null) {
                this.end_time = DEFAULT_END_TIME;
                return;
            } else {
                this.end_time = l2;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
    }
}
