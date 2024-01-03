package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class ForumPopupInfo extends Message {
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer forum_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> forum_names;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer mem_count_static;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer thread_count_static;
    public static final Integer DEFAULT_FORUM_ID = 0;
    public static final Integer DEFAULT_MEM_COUNT_STATIC = 0;
    public static final Integer DEFAULT_THREAD_COUNT_STATIC = 0;
    public static final List<String> DEFAULT_FORUM_NAMES = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumPopupInfo> {
        public Integer forum_id;
        public String forum_name;
        public List<String> forum_names;
        public Integer mem_count_static;
        public Integer thread_count_static;

        public Builder() {
        }

        public Builder(ForumPopupInfo forumPopupInfo) {
            super(forumPopupInfo);
            if (forumPopupInfo == null) {
                return;
            }
            this.forum_id = forumPopupInfo.forum_id;
            this.mem_count_static = forumPopupInfo.mem_count_static;
            this.thread_count_static = forumPopupInfo.thread_count_static;
            this.forum_names = Message.copyOf(forumPopupInfo.forum_names);
            this.forum_name = forumPopupInfo.forum_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumPopupInfo build(boolean z) {
            return new ForumPopupInfo(this, z);
        }
    }

    public ForumPopupInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.forum_id;
            if (num == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = num;
            }
            Integer num2 = builder.mem_count_static;
            if (num2 == null) {
                this.mem_count_static = DEFAULT_MEM_COUNT_STATIC;
            } else {
                this.mem_count_static = num2;
            }
            Integer num3 = builder.thread_count_static;
            if (num3 == null) {
                this.thread_count_static = DEFAULT_THREAD_COUNT_STATIC;
            } else {
                this.thread_count_static = num3;
            }
            List<String> list = builder.forum_names;
            if (list == null) {
                this.forum_names = DEFAULT_FORUM_NAMES;
            } else {
                this.forum_names = Message.immutableCopyOf(list);
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
                return;
            } else {
                this.forum_name = str;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.mem_count_static = builder.mem_count_static;
        this.thread_count_static = builder.thread_count_static;
        this.forum_names = Message.immutableCopyOf(builder.forum_names);
        this.forum_name = builder.forum_name;
    }
}
