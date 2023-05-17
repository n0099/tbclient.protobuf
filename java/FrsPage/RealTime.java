package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class RealTime extends Message {
    public static final String DEFAULT_ICON = "";
    public static final Long DEFAULT_TASK_ID = 0L;
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long task_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<RealTime> {
        public String icon;
        public Long task_id;
        public String url;

        public Builder() {
        }

        public Builder(RealTime realTime) {
            super(realTime);
            if (realTime == null) {
                return;
            }
            this.task_id = realTime.task_id;
            this.icon = realTime.icon;
            this.url = realTime.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RealTime build(boolean z) {
            return new RealTime(this, z);
        }
    }

    public RealTime(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.task_id;
            if (l == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = l;
            }
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.task_id = builder.task_id;
        this.icon = builder.icon;
        this.url = builder.url;
    }
}
