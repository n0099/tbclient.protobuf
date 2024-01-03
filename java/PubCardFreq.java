package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class PubCardFreq extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long show_times;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long start_time;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_SHOW_TIMES = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PubCardFreq> {
        public Long end_time;
        public Long show_times;
        public Long start_time;

        public Builder() {
        }

        public Builder(PubCardFreq pubCardFreq) {
            super(pubCardFreq);
            if (pubCardFreq == null) {
                return;
            }
            this.start_time = pubCardFreq.start_time;
            this.end_time = pubCardFreq.end_time;
            this.show_times = pubCardFreq.show_times;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PubCardFreq build(boolean z) {
            return new PubCardFreq(this, z);
        }
    }

    public PubCardFreq(Builder builder, boolean z) {
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
            } else {
                this.end_time = l2;
            }
            Long l3 = builder.show_times;
            if (l3 == null) {
                this.show_times = DEFAULT_SHOW_TIMES;
                return;
            } else {
                this.show_times = l3;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.show_times = builder.show_times;
    }
}
