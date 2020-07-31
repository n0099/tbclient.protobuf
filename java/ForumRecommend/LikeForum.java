package tbclient.ForumRecommend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;
import tbclient.PrivateForumInfo;
import tbclient.ThemeColorInfo;
/* loaded from: classes16.dex */
public final class LikeForum extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_FORUM_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 20, type = Message.Datatype.INT64)
    public final Long hot_thread_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_brand_forum;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_liveforum;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer is_manager;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_private_forum;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_sign;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_top;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(tag = 14, type = Message.Datatype.BOOL)
    public final Boolean need_trans;
    @ProtoField(tag = 19)
    public final PrivateForumInfo private_forum_info;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 21)
    public final List<FrsTabInfo> tab_info;
    @ProtoField(tag = 12)
    public final ThemeColorInfo theme_color;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_SIGN = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final Integer DEFAULT_IS_LIVEFORUM = 0;
    public static final Integer DEFAULT_IS_BRAND_FORUM = 0;
    public static final Integer DEFAULT_IS_TOP = 0;
    public static final Integer DEFAULT_SORT_TYPE = 0;
    public static final Boolean DEFAULT_NEED_TRANS = false;
    public static final Integer DEFAULT_IS_PRIVATE_FORUM = 0;
    public static final Integer DEFAULT_IS_MANAGER = 0;
    public static final Long DEFAULT_HOT_THREAD_ID = 0L;
    public static final List<FrsTabInfo> DEFAULT_TAB_INFO = Collections.emptyList();

    private LikeForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.forum_name == null) {
                this.forum_name = "";
            } else {
                this.forum_name = builder.forum_name;
            }
            if (builder.avatar == null) {
                this.avatar = "";
            } else {
                this.avatar = builder.avatar;
            }
            if (builder.is_sign == null) {
                this.is_sign = DEFAULT_IS_SIGN;
            } else {
                this.is_sign = builder.is_sign;
            }
            if (builder.level_id == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = builder.level_id;
            }
            if (builder.is_liveforum == null) {
                this.is_liveforum = DEFAULT_IS_LIVEFORUM;
            } else {
                this.is_liveforum = builder.is_liveforum;
            }
            if (builder.is_brand_forum == null) {
                this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
            } else {
                this.is_brand_forum = builder.is_brand_forum;
            }
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            if (builder.is_top == null) {
                this.is_top = DEFAULT_IS_TOP;
            } else {
                this.is_top = builder.is_top;
            }
            if (builder.sort_type == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = builder.sort_type;
            }
            this.theme_color = builder.theme_color;
            if (builder.need_trans == null) {
                this.need_trans = DEFAULT_NEED_TRANS;
            } else {
                this.need_trans = builder.need_trans;
            }
            if (builder.is_private_forum == null) {
                this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
            } else {
                this.is_private_forum = builder.is_private_forum;
            }
            if (builder.is_manager == null) {
                this.is_manager = DEFAULT_IS_MANAGER;
            } else {
                this.is_manager = builder.is_manager;
            }
            this.private_forum_info = builder.private_forum_info;
            if (builder.hot_thread_id == null) {
                this.hot_thread_id = DEFAULT_HOT_THREAD_ID;
            } else {
                this.hot_thread_id = builder.hot_thread_id;
            }
            if (builder.tab_info == null) {
                this.tab_info = DEFAULT_TAB_INFO;
                return;
            } else {
                this.tab_info = immutableCopyOf(builder.tab_info);
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.is_sign = builder.is_sign;
        this.level_id = builder.level_id;
        this.is_liveforum = builder.is_liveforum;
        this.is_brand_forum = builder.is_brand_forum;
        this.content = builder.content;
        this.is_top = builder.is_top;
        this.sort_type = builder.sort_type;
        this.theme_color = builder.theme_color;
        this.need_trans = builder.need_trans;
        this.is_private_forum = builder.is_private_forum;
        this.is_manager = builder.is_manager;
        this.private_forum_info = builder.private_forum_info;
        this.hot_thread_id = builder.hot_thread_id;
        this.tab_info = immutableCopyOf(builder.tab_info);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<LikeForum> {
        public String avatar;
        public String content;
        public Long forum_id;
        public String forum_name;
        public Long hot_thread_id;
        public Integer is_brand_forum;
        public Integer is_liveforum;
        public Integer is_manager;
        public Integer is_private_forum;
        public Integer is_sign;
        public Integer is_top;
        public Integer level_id;
        public Boolean need_trans;
        public PrivateForumInfo private_forum_info;
        public Integer sort_type;
        public List<FrsTabInfo> tab_info;
        public ThemeColorInfo theme_color;

        public Builder() {
        }

        public Builder(LikeForum likeForum) {
            super(likeForum);
            if (likeForum != null) {
                this.forum_id = likeForum.forum_id;
                this.forum_name = likeForum.forum_name;
                this.avatar = likeForum.avatar;
                this.is_sign = likeForum.is_sign;
                this.level_id = likeForum.level_id;
                this.is_liveforum = likeForum.is_liveforum;
                this.is_brand_forum = likeForum.is_brand_forum;
                this.content = likeForum.content;
                this.is_top = likeForum.is_top;
                this.sort_type = likeForum.sort_type;
                this.theme_color = likeForum.theme_color;
                this.need_trans = likeForum.need_trans;
                this.is_private_forum = likeForum.is_private_forum;
                this.is_manager = likeForum.is_manager;
                this.private_forum_info = likeForum.private_forum_info;
                this.hot_thread_id = likeForum.hot_thread_id;
                this.tab_info = LikeForum.copyOf(likeForum.tab_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LikeForum build(boolean z) {
            return new LikeForum(this, z);
        }
    }
}
