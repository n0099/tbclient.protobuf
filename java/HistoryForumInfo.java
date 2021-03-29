package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class HistoryForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_VISIT_TIME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 14)
    public final BlockPopInfo block_pop_info;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer follow_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 18, type = Message.Datatype.BOOL)
    public final Boolean has_postpre;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer hot_num;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer is_forum_business_account;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_liveforum;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer level_id;
    @ProtoField(tag = 10, type = Message.Datatype.BOOL)
    public final Boolean need_trans;
    @ProtoField(tag = 19)
    public final PostPrefix post_prefix;
    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<FrsTabInfo> tab_info;
    @ProtoField(tag = 8)
    public final ThemeColorInfo theme_color;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer unread_num;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String visit_time;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_LIVEFORUM = 0;
    public static final Integer DEFAULT_UNREAD_NUM = 0;
    public static final Integer DEFAULT_FOLLOW_NUM = 0;
    public static final Boolean DEFAULT_NEED_TRANS = Boolean.FALSE;
    public static final Integer DEFAULT_HOT_NUM = 0;
    public static final Integer DEFAULT_LEVEL_ID = 0;
    public static final List<FrsTabInfo> DEFAULT_TAB_INFO = Collections.emptyList();
    public static final Boolean DEFAULT_HAS_POSTPRE = Boolean.FALSE;
    public static final Integer DEFAULT_IS_FORUM_BUSINESS_ACCOUNT = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<HistoryForumInfo> {
        public String avatar;
        public BlockPopInfo block_pop_info;
        public Integer follow_num;
        public Long forum_id;
        public String forum_name;
        public Boolean has_postpre;
        public Integer hot_num;
        public Integer is_forum_business_account;
        public Integer is_liveforum;
        public Integer level_id;
        public Boolean need_trans;
        public PostPrefix post_prefix;
        public List<FrsTabInfo> tab_info;
        public ThemeColorInfo theme_color;
        public Integer unread_num;
        public String visit_time;

        public Builder() {
        }

        public Builder(HistoryForumInfo historyForumInfo) {
            super(historyForumInfo);
            if (historyForumInfo == null) {
                return;
            }
            this.forum_id = historyForumInfo.forum_id;
            this.forum_name = historyForumInfo.forum_name;
            this.avatar = historyForumInfo.avatar;
            this.is_liveforum = historyForumInfo.is_liveforum;
            this.unread_num = historyForumInfo.unread_num;
            this.visit_time = historyForumInfo.visit_time;
            this.follow_num = historyForumInfo.follow_num;
            this.theme_color = historyForumInfo.theme_color;
            this.need_trans = historyForumInfo.need_trans;
            this.block_pop_info = historyForumInfo.block_pop_info;
            this.hot_num = historyForumInfo.hot_num;
            this.level_id = historyForumInfo.level_id;
            this.tab_info = Message.copyOf(historyForumInfo.tab_info);
            this.has_postpre = historyForumInfo.has_postpre;
            this.post_prefix = historyForumInfo.post_prefix;
            this.is_forum_business_account = historyForumInfo.is_forum_business_account;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HistoryForumInfo build(boolean z) {
            return new HistoryForumInfo(this, z);
        }
    }

    public HistoryForumInfo(Builder builder, boolean z) {
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
            Integer num = builder.is_liveforum;
            if (num == null) {
                this.is_liveforum = DEFAULT_IS_LIVEFORUM;
            } else {
                this.is_liveforum = num;
            }
            Integer num2 = builder.unread_num;
            if (num2 == null) {
                this.unread_num = DEFAULT_UNREAD_NUM;
            } else {
                this.unread_num = num2;
            }
            String str3 = builder.visit_time;
            if (str3 == null) {
                this.visit_time = "";
            } else {
                this.visit_time = str3;
            }
            Integer num3 = builder.follow_num;
            if (num3 == null) {
                this.follow_num = DEFAULT_FOLLOW_NUM;
            } else {
                this.follow_num = num3;
            }
            this.theme_color = builder.theme_color;
            Boolean bool = builder.need_trans;
            if (bool == null) {
                this.need_trans = DEFAULT_NEED_TRANS;
            } else {
                this.need_trans = bool;
            }
            this.block_pop_info = builder.block_pop_info;
            Integer num4 = builder.hot_num;
            if (num4 == null) {
                this.hot_num = DEFAULT_HOT_NUM;
            } else {
                this.hot_num = num4;
            }
            Integer num5 = builder.level_id;
            if (num5 == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num5;
            }
            List<FrsTabInfo> list = builder.tab_info;
            if (list == null) {
                this.tab_info = DEFAULT_TAB_INFO;
            } else {
                this.tab_info = Message.immutableCopyOf(list);
            }
            Boolean bool2 = builder.has_postpre;
            if (bool2 == null) {
                this.has_postpre = DEFAULT_HAS_POSTPRE;
            } else {
                this.has_postpre = bool2;
            }
            this.post_prefix = builder.post_prefix;
            Integer num6 = builder.is_forum_business_account;
            if (num6 == null) {
                this.is_forum_business_account = DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
                return;
            } else {
                this.is_forum_business_account = num6;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.is_liveforum = builder.is_liveforum;
        this.unread_num = builder.unread_num;
        this.visit_time = builder.visit_time;
        this.follow_num = builder.follow_num;
        this.theme_color = builder.theme_color;
        this.need_trans = builder.need_trans;
        this.block_pop_info = builder.block_pop_info;
        this.hot_num = builder.hot_num;
        this.level_id = builder.level_id;
        this.tab_info = Message.immutableCopyOf(builder.tab_info);
        this.has_postpre = builder.has_postpre;
        this.post_prefix = builder.post_prefix;
        this.is_forum_business_account = builder.is_forum_business_account;
    }
}
