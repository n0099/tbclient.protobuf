package tbclient.GetRecentWatchRecord;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.LiveThreadInfo;
/* loaded from: classes9.dex */
public final class RecordUserInfo extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_follow;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long last_watch_time;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Tag> tags;
    @ProtoField(tag = 6)
    public final LiveThreadInfo thread_info;
    public static final List<Tag> DEFAULT_TAGS = Collections.emptyList();
    public static final Integer DEFAULT_IS_FOLLOW = 0;
    public static final Long DEFAULT_LAST_WATCH_TIME = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RecordUserInfo> {
        public Integer is_follow;
        public Long last_watch_time;
        public List<Tag> tags;
        public LiveThreadInfo thread_info;

        public Builder() {
        }

        public Builder(RecordUserInfo recordUserInfo) {
            super(recordUserInfo);
            if (recordUserInfo == null) {
                return;
            }
            this.tags = Message.copyOf(recordUserInfo.tags);
            this.is_follow = recordUserInfo.is_follow;
            this.last_watch_time = recordUserInfo.last_watch_time;
            this.thread_info = recordUserInfo.thread_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecordUserInfo build(boolean z) {
            return new RecordUserInfo(this, z);
        }
    }

    public RecordUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Tag> list = builder.tags;
            if (list == null) {
                this.tags = DEFAULT_TAGS;
            } else {
                this.tags = Message.immutableCopyOf(list);
            }
            Integer num = builder.is_follow;
            if (num == null) {
                this.is_follow = DEFAULT_IS_FOLLOW;
            } else {
                this.is_follow = num;
            }
            Long l = builder.last_watch_time;
            if (l == null) {
                this.last_watch_time = DEFAULT_LAST_WATCH_TIME;
            } else {
                this.last_watch_time = l;
            }
            this.thread_info = builder.thread_info;
            return;
        }
        this.tags = Message.immutableCopyOf(builder.tags);
        this.is_follow = builder.is_follow;
        this.last_watch_time = builder.last_watch_time;
        this.thread_info = builder.thread_info;
    }
}
