package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes21.dex */
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

    private ForumPopupInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.mem_count_static == null) {
                this.mem_count_static = DEFAULT_MEM_COUNT_STATIC;
            } else {
                this.mem_count_static = builder.mem_count_static;
            }
            if (builder.thread_count_static == null) {
                this.thread_count_static = DEFAULT_THREAD_COUNT_STATIC;
            } else {
                this.thread_count_static = builder.thread_count_static;
            }
            if (builder.forum_names == null) {
                this.forum_names = DEFAULT_FORUM_NAMES;
            } else {
                this.forum_names = immutableCopyOf(builder.forum_names);
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
                return;
            } else {
                this.forum_name = builder.forum_name;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.mem_count_static = builder.mem_count_static;
        this.thread_count_static = builder.thread_count_static;
        this.forum_names = immutableCopyOf(builder.forum_names);
        this.forum_name = builder.forum_name;
    }

    /* loaded from: classes21.dex */
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
            if (forumPopupInfo != null) {
                this.forum_id = forumPopupInfo.forum_id;
                this.mem_count_static = forumPopupInfo.mem_count_static;
                this.thread_count_static = forumPopupInfo.thread_count_static;
                this.forum_names = ForumPopupInfo.copyOf(forumPopupInfo.forum_names);
                this.forum_name = forumPopupInfo.forum_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumPopupInfo build(boolean z) {
            return new ForumPopupInfo(this, z);
        }
    }
}
