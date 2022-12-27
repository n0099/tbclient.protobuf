package tbclient.GetRecommendForumData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeColorInfo;
/* loaded from: classes9.dex */
public final class RecForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_ID = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_FROM = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String from;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer member_count;
    @ProtoField(tag = 10, type = Message.Datatype.BOOL)
    public final Boolean need_trans;
    @ProtoField(tag = 9)
    public final ThemeColorInfo theme_color;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer thread_count;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<ThreadList> threadlist;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Integer DEFAULT_THREAD_COUNT = 0;
    public static final List<ThreadList> DEFAULT_THREADLIST = Collections.emptyList();
    public static final Boolean DEFAULT_NEED_TRANS = Boolean.FALSE;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RecForumInfo> {
        public String avatar;
        public String forum_id;
        public String forum_name;
        public String from;
        public Integer member_count;
        public Boolean need_trans;
        public ThemeColorInfo theme_color;
        public Integer thread_count;
        public List<ThreadList> threadlist;

        public Builder() {
        }

        public Builder(RecForumInfo recForumInfo) {
            super(recForumInfo);
            if (recForumInfo == null) {
                return;
            }
            this.forum_id = recForumInfo.forum_id;
            this.forum_name = recForumInfo.forum_name;
            this.avatar = recForumInfo.avatar;
            this.member_count = recForumInfo.member_count;
            this.thread_count = recForumInfo.thread_count;
            this.from = recForumInfo.from;
            this.threadlist = Message.copyOf(recForumInfo.threadlist);
            this.theme_color = recForumInfo.theme_color;
            this.need_trans = recForumInfo.need_trans;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecForumInfo build(boolean z) {
            return new RecForumInfo(this, z);
        }
    }

    public RecForumInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.forum_id;
            if (str == null) {
                this.forum_id = "";
            } else {
                this.forum_id = str;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            String str3 = builder.avatar;
            if (str3 == null) {
                this.avatar = "";
            } else {
                this.avatar = str3;
            }
            Integer num = builder.member_count;
            if (num == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num;
            }
            Integer num2 = builder.thread_count;
            if (num2 == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
            } else {
                this.thread_count = num2;
            }
            String str4 = builder.from;
            if (str4 == null) {
                this.from = "";
            } else {
                this.from = str4;
            }
            List<ThreadList> list = builder.threadlist;
            if (list == null) {
                this.threadlist = DEFAULT_THREADLIST;
            } else {
                this.threadlist = Message.immutableCopyOf(list);
            }
            this.theme_color = builder.theme_color;
            Boolean bool = builder.need_trans;
            if (bool == null) {
                this.need_trans = DEFAULT_NEED_TRANS;
                return;
            } else {
                this.need_trans = bool;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.member_count = builder.member_count;
        this.thread_count = builder.thread_count;
        this.from = builder.from;
        this.threadlist = Message.immutableCopyOf(builder.threadlist);
        this.theme_color = builder.theme_color;
        this.need_trans = builder.need_trans;
    }
}
