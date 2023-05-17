package tbclient.ForumGuide;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;
/* loaded from: classes10.dex */
public final class LikeForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_LEVEL_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer hot_num;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_sign;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String level_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer member_count;
    @ProtoField(tag = 9, type = Message.Datatype.BOOL)
    public final Boolean need_trans;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long sort_value;
    @ProtoField(tag = 8)
    public final ThemeColorInfo theme_color;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer thread_num;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_HOT_NUM = 0;
    public static final Integer DEFAULT_MEMBER_COUNT = 0;
    public static final Integer DEFAULT_THREAD_NUM = 0;
    public static final Long DEFAULT_SORT_VALUE = 0L;
    public static final Boolean DEFAULT_NEED_TRANS = Boolean.FALSE;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final Integer DEFAULT_IS_SIGN = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LikeForum> {
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer hot_num;
        public Integer is_sign;
        public Integer level_id;
        public String level_name;
        public Integer member_count;
        public Boolean need_trans;
        public Long sort_value;
        public ThemeColorInfo theme_color;
        public Integer thread_num;

        public Builder() {
        }

        public Builder(LikeForum likeForum) {
            super(likeForum);
            if (likeForum == null) {
                return;
            }
            this.forum_id = likeForum.forum_id;
            this.forum_name = likeForum.forum_name;
            this.avatar = likeForum.avatar;
            this.hot_num = likeForum.hot_num;
            this.member_count = likeForum.member_count;
            this.thread_num = likeForum.thread_num;
            this.sort_value = likeForum.sort_value;
            this.theme_color = likeForum.theme_color;
            this.need_trans = likeForum.need_trans;
            this.level_id = likeForum.level_id;
            this.level_name = likeForum.level_name;
            this.is_sign = likeForum.is_sign;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LikeForum build(boolean z) {
            return new LikeForum(this, z);
        }
    }

    public LikeForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Integer num = builder.hot_num;
            if (num == null) {
                this.hot_num = DEFAULT_HOT_NUM;
            } else {
                this.hot_num = num;
            }
            Integer num2 = builder.member_count;
            if (num2 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num2;
            }
            Integer num3 = builder.thread_num;
            if (num3 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = num3;
            }
            Long l2 = builder.sort_value;
            if (l2 == null) {
                this.sort_value = DEFAULT_SORT_VALUE;
            } else {
                this.sort_value = l2;
            }
            this.theme_color = builder.theme_color;
            Boolean bool = builder.need_trans;
            if (bool == null) {
                this.need_trans = DEFAULT_NEED_TRANS;
            } else {
                this.need_trans = bool;
            }
            Integer num4 = builder.level_id;
            if (num4 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num4;
            }
            String str3 = builder.level_name;
            if (str3 == null) {
                this.level_name = "";
            } else {
                this.level_name = str3;
            }
            Integer num5 = builder.is_sign;
            if (num5 == null) {
                this.is_sign = DEFAULT_IS_SIGN;
                return;
            } else {
                this.is_sign = num5;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.hot_num = builder.hot_num;
        this.member_count = builder.member_count;
        this.thread_num = builder.thread_num;
        this.sort_value = builder.sort_value;
        this.theme_color = builder.theme_color;
        this.need_trans = builder.need_trans;
        this.level_id = builder.level_id;
        this.level_name = builder.level_name;
        this.is_sign = builder.is_sign;
    }
}
