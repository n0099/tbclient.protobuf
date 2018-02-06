package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes3.dex */
public final class ThreadForum extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;

    private ThreadForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = builder.forum_id;
                return;
            }
        }
        this.forum_id = builder.forum_id;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<ThreadForum> {
        public Long forum_id;

        public Builder() {
        }

        public Builder(ThreadForum threadForum) {
            super(threadForum);
            if (threadForum != null) {
                this.forum_id = threadForum.forum_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadForum build(boolean z) {
            return new ThreadForum(this, z);
        }
    }
}
