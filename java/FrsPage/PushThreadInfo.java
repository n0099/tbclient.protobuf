package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes9.dex */
public final class PushThreadInfo extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_pushcard;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_pushplace;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<User> user_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_PUSHCARD = 0;
    public static final Integer DEFAULT_HAS_PUSHPLACE = 0;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PushThreadInfo> {
        public Integer has_pushcard;
        public Integer has_pushplace;
        public List<ThreadInfo> thread_list;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(PushThreadInfo pushThreadInfo) {
            super(pushThreadInfo);
            if (pushThreadInfo == null) {
                return;
            }
            this.thread_list = Message.copyOf(pushThreadInfo.thread_list);
            this.has_pushcard = pushThreadInfo.has_pushcard;
            this.has_pushplace = pushThreadInfo.has_pushplace;
            this.user_list = Message.copyOf(pushThreadInfo.user_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PushThreadInfo build(boolean z) {
            return new PushThreadInfo(this, z);
        }
    }

    public PushThreadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_pushcard;
            if (num == null) {
                this.has_pushcard = DEFAULT_HAS_PUSHCARD;
            } else {
                this.has_pushcard = num;
            }
            Integer num2 = builder.has_pushplace;
            if (num2 == null) {
                this.has_pushplace = DEFAULT_HAS_PUSHPLACE;
            } else {
                this.has_pushplace = num2;
            }
            List<User> list2 = builder.user_list;
            if (list2 == null) {
                this.user_list = DEFAULT_USER_LIST;
                return;
            } else {
                this.user_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.has_pushcard = builder.has_pushcard;
        this.has_pushplace = builder.has_pushplace;
        this.user_list = Message.immutableCopyOf(builder.user_list);
    }
}
