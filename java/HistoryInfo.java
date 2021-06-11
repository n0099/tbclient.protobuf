package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class HistoryInfo extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final String DEFAULT_VISIT_TIME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String visit_time;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<HistoryInfo> {
        public Long forum_id;
        public String visit_time;

        public Builder() {
        }

        public Builder(HistoryInfo historyInfo) {
            super(historyInfo);
            if (historyInfo == null) {
                return;
            }
            this.forum_id = historyInfo.forum_id;
            this.visit_time = historyInfo.visit_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HistoryInfo build(boolean z) {
            return new HistoryInfo(this, z);
        }
    }

    public HistoryInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.visit_time;
            if (str == null) {
                this.visit_time = "";
                return;
            } else {
                this.visit_time = str;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.visit_time = builder.visit_time;
    }
}
