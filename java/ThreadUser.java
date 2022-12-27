package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ThreadUser extends Message {
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 2)
    public final User user_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThreadUser> {
        public List<ThreadInfo> thread_list;
        public User user_info;

        public Builder() {
        }

        public Builder(ThreadUser threadUser) {
            super(threadUser);
            if (threadUser == null) {
                return;
            }
            this.thread_list = Message.copyOf(threadUser.thread_list);
            this.user_info = threadUser.user_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadUser build(boolean z) {
            return new ThreadUser(this, z);
        }
    }

    public ThreadUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            this.user_info = builder.user_info;
            return;
        }
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.user_info = builder.user_info;
    }
}
