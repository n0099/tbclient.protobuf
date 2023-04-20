package tbclient.GetUserLives;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class DataMonth extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long live_count;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long total_live_duration;
    public static final Long DEFAULT_TOTAL_LIVE_DURATION = 0L;
    public static final Long DEFAULT_LIVE_COUNT = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataMonth> {
        public Long live_count;
        public Long total_live_duration;

        public Builder() {
        }

        public Builder(DataMonth dataMonth) {
            super(dataMonth);
            if (dataMonth == null) {
                return;
            }
            this.total_live_duration = dataMonth.total_live_duration;
            this.live_count = dataMonth.live_count;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataMonth build(boolean z) {
            return new DataMonth(this, z);
        }
    }

    public DataMonth(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.total_live_duration;
            if (l == null) {
                this.total_live_duration = DEFAULT_TOTAL_LIVE_DURATION;
            } else {
                this.total_live_duration = l;
            }
            Long l2 = builder.live_count;
            if (l2 == null) {
                this.live_count = DEFAULT_LIVE_COUNT;
                return;
            } else {
                this.live_count = l2;
                return;
            }
        }
        this.total_live_duration = builder.total_live_duration;
        this.live_count = builder.live_count;
    }
}
