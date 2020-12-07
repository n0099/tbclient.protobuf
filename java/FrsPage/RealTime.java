package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes22.dex */
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

    private RealTime(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.task_id == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = builder.task_id;
            }
            if (builder.icon == null) {
                this.icon = "";
            } else {
                this.icon = builder.icon;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.task_id = builder.task_id;
        this.icon = builder.icon;
        this.url = builder.url;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<RealTime> {
        public String icon;
        public Long task_id;
        public String url;

        public Builder() {
        }

        public Builder(RealTime realTime) {
            super(realTime);
            if (realTime != null) {
                this.task_id = realTime.task_id;
                this.icon = realTime.icon;
                this.url = realTime.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RealTime build(boolean z) {
            return new RealTime(this, z);
        }
    }
}
