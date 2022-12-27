package tbclient.ForumPersonas;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class OnlineTimes extends Message {
    public static final String DEFAULT_END = "";
    public static final Integer DEFAULT_SEQ = 0;
    public static final String DEFAULT_START = "";
    public static final String DEFAULT_TIME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String end;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer seq;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String start;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String time;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<OnlineTimes> {
        public String end;
        public Integer seq;
        public String start;
        public String time;

        public Builder() {
        }

        public Builder(OnlineTimes onlineTimes) {
            super(onlineTimes);
            if (onlineTimes == null) {
                return;
            }
            this.time = onlineTimes.time;
            this.start = onlineTimes.start;
            this.end = onlineTimes.end;
            this.seq = onlineTimes.seq;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OnlineTimes build(boolean z) {
            return new OnlineTimes(this, z);
        }
    }

    public OnlineTimes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.time;
            if (str == null) {
                this.time = "";
            } else {
                this.time = str;
            }
            String str2 = builder.start;
            if (str2 == null) {
                this.start = "";
            } else {
                this.start = str2;
            }
            String str3 = builder.end;
            if (str3 == null) {
                this.end = "";
            } else {
                this.end = str3;
            }
            Integer num = builder.seq;
            if (num == null) {
                this.seq = DEFAULT_SEQ;
                return;
            } else {
                this.seq = num;
                return;
            }
        }
        this.time = builder.time;
        this.start = builder.start;
        this.end = builder.end;
        this.seq = builder.seq;
    }
}
