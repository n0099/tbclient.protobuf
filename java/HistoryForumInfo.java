package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class HistoryForumInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_VISIT_TIME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer follow_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_liveforum;
    @ProtoField(tag = 10, type = Message.Datatype.BOOL)
    public final Boolean need_trans;
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
    public static final Boolean DEFAULT_NEED_TRANS = false;

    private HistoryForumInfo(Builder builder, boolean z) {
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
            if (builder.is_liveforum == null) {
                this.is_liveforum = DEFAULT_IS_LIVEFORUM;
            } else {
                this.is_liveforum = builder.is_liveforum;
            }
            if (builder.unread_num == null) {
                this.unread_num = DEFAULT_UNREAD_NUM;
            } else {
                this.unread_num = builder.unread_num;
            }
            if (builder.visit_time == null) {
                this.visit_time = "";
            } else {
                this.visit_time = builder.visit_time;
            }
            if (builder.follow_num == null) {
                this.follow_num = DEFAULT_FOLLOW_NUM;
            } else {
                this.follow_num = builder.follow_num;
            }
            this.theme_color = builder.theme_color;
            if (builder.need_trans == null) {
                this.need_trans = DEFAULT_NEED_TRANS;
                return;
            } else {
                this.need_trans = builder.need_trans;
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
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<HistoryForumInfo> {
        public String avatar;
        public Integer follow_num;
        public Long forum_id;
        public String forum_name;
        public Integer is_liveforum;
        public Boolean need_trans;
        public ThemeColorInfo theme_color;
        public Integer unread_num;
        public String visit_time;

        public Builder() {
        }

        public Builder(HistoryForumInfo historyForumInfo) {
            super(historyForumInfo);
            if (historyForumInfo != null) {
                this.forum_id = historyForumInfo.forum_id;
                this.forum_name = historyForumInfo.forum_name;
                this.avatar = historyForumInfo.avatar;
                this.is_liveforum = historyForumInfo.is_liveforum;
                this.unread_num = historyForumInfo.unread_num;
                this.visit_time = historyForumInfo.visit_time;
                this.follow_num = historyForumInfo.follow_num;
                this.theme_color = historyForumInfo.theme_color;
                this.need_trans = historyForumInfo.need_trans;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HistoryForumInfo build(boolean z) {
            return new HistoryForumInfo(this, z);
        }
    }
}
