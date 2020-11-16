package tbclient.ExcFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class TwZbInfo extends Message {
    public static final String DEFAULT_LAST_MODIFIED_TIME = "";
    public static final String DEFAULT_LIVECOVER_SRC = "";
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String last_modified_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String livecover_src;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    private TwZbInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.livecover_src == null) {
                this.livecover_src = "";
            } else {
                this.livecover_src = builder.livecover_src;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.thread_id == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = builder.thread_id;
            }
            if (builder.last_modified_time == null) {
                this.last_modified_time = "";
                return;
            } else {
                this.last_modified_time = builder.last_modified_time;
                return;
            }
        }
        this.livecover_src = builder.livecover_src;
        this.title = builder.title;
        this.thread_id = builder.thread_id;
        this.last_modified_time = builder.last_modified_time;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<TwZbInfo> {
        public String last_modified_time;
        public String livecover_src;
        public Long thread_id;
        public String title;

        public Builder() {
        }

        public Builder(TwZbInfo twZbInfo) {
            super(twZbInfo);
            if (twZbInfo != null) {
                this.livecover_src = twZbInfo.livecover_src;
                this.title = twZbInfo.title;
                this.thread_id = twZbInfo.thread_id;
                this.last_modified_time = twZbInfo.last_modified_time;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwZbInfo build(boolean z) {
            return new TwZbInfo(this, z);
        }
    }
}
