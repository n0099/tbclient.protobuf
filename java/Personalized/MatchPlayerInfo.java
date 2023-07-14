package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Post;
/* loaded from: classes2.dex */
public final class MatchPlayerInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SCORE_LINK = "";
    public static final String DEFAULT_SUB_AVATAR = "";
    public static final String DEFAULT_SUB_TEXT = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 5)
    public final Post hot_post;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long match_id;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer match_index;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 12, type = Message.Datatype.INT64)
    public final Long player_id;
    @ProtoField(tag = 3, type = Message.Datatype.DOUBLE)
    public final Double score;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long score_cnt;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String score_link;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer score_self;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String sub_avatar;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String sub_text;
    public static final Double DEFAULT_SCORE = Double.valueOf(0.0d);
    public static final Long DEFAULT_SCORE_CNT = 0L;
    public static final Integer DEFAULT_SCORE_SELF = 0;
    public static final Long DEFAULT_MATCH_ID = 0L;
    public static final Integer DEFAULT_MATCH_INDEX = 0;
    public static final Long DEFAULT_PLAYER_ID = 0L;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<MatchPlayerInfo> {
        public String avatar;
        public Post hot_post;
        public Long match_id;
        public Integer match_index;
        public String name;
        public Long player_id;
        public Double score;
        public Long score_cnt;
        public String score_link;
        public Integer score_self;
        public String sub_avatar;
        public String sub_text;

        public Builder() {
        }

        public Builder(MatchPlayerInfo matchPlayerInfo) {
            super(matchPlayerInfo);
            if (matchPlayerInfo == null) {
                return;
            }
            this.name = matchPlayerInfo.name;
            this.avatar = matchPlayerInfo.avatar;
            this.score = matchPlayerInfo.score;
            this.score_cnt = matchPlayerInfo.score_cnt;
            this.hot_post = matchPlayerInfo.hot_post;
            this.sub_avatar = matchPlayerInfo.sub_avatar;
            this.sub_text = matchPlayerInfo.sub_text;
            this.score_self = matchPlayerInfo.score_self;
            this.score_link = matchPlayerInfo.score_link;
            this.match_id = matchPlayerInfo.match_id;
            this.match_index = matchPlayerInfo.match_index;
            this.player_id = matchPlayerInfo.player_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MatchPlayerInfo build(boolean z) {
            return new MatchPlayerInfo(this, z);
        }
    }

    public MatchPlayerInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            Double d = builder.score;
            if (d == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = d;
            }
            Long l = builder.score_cnt;
            if (l == null) {
                this.score_cnt = DEFAULT_SCORE_CNT;
            } else {
                this.score_cnt = l;
            }
            this.hot_post = builder.hot_post;
            String str3 = builder.sub_avatar;
            if (str3 == null) {
                this.sub_avatar = "";
            } else {
                this.sub_avatar = str3;
            }
            String str4 = builder.sub_text;
            if (str4 == null) {
                this.sub_text = "";
            } else {
                this.sub_text = str4;
            }
            Integer num = builder.score_self;
            if (num == null) {
                this.score_self = DEFAULT_SCORE_SELF;
            } else {
                this.score_self = num;
            }
            String str5 = builder.score_link;
            if (str5 == null) {
                this.score_link = "";
            } else {
                this.score_link = str5;
            }
            Long l2 = builder.match_id;
            if (l2 == null) {
                this.match_id = DEFAULT_MATCH_ID;
            } else {
                this.match_id = l2;
            }
            Integer num2 = builder.match_index;
            if (num2 == null) {
                this.match_index = DEFAULT_MATCH_INDEX;
            } else {
                this.match_index = num2;
            }
            Long l3 = builder.player_id;
            if (l3 == null) {
                this.player_id = DEFAULT_PLAYER_ID;
                return;
            } else {
                this.player_id = l3;
                return;
            }
        }
        this.name = builder.name;
        this.avatar = builder.avatar;
        this.score = builder.score;
        this.score_cnt = builder.score_cnt;
        this.hot_post = builder.hot_post;
        this.sub_avatar = builder.sub_avatar;
        this.sub_text = builder.sub_text;
        this.score_self = builder.score_self;
        this.score_link = builder.score_link;
        this.match_id = builder.match_id;
        this.match_index = builder.match_index;
        this.player_id = builder.player_id;
    }
}
