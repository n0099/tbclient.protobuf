package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class ThreadForum extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<ThreadForum> {
        public Long forum_id;

        public Builder() {
        }

        public Builder(ThreadForum threadForum) {
            super(threadForum);
            if (threadForum == null) {
                return;
            }
            this.forum_id = threadForum.forum_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadForum build(boolean z) {
            return new ThreadForum(this, z);
        }
    }

    public ThreadForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = l;
                return;
            }
        }
        this.forum_id = builder.forum_id;
    }
}
