package tbclient.GetRankList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class LiveRankUserInfo extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_DATE = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_NICKNAME = "";
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String date;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer is_follow;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_live;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long live_id;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long point;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long rank;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer time_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String user_nickname;
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_TIME_TYPE = 0;
    public static final Long DEFAULT_POINT = 0L;
    public static final Long DEFAULT_RANK = 0L;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Integer DEFAULT_IS_LIVE = 0;
    public static final Integer DEFAULT_IS_FOLLOW = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LiveRankUserInfo> {
        public String avatar;
        public String date;
        public Long id;
        public Integer is_follow;
        public Integer is_live;
        public Long live_id;
        public Long point;
        public Long rank;
        public Integer time_type;
        public Integer type;
        public Long user_id;
        public String user_name;
        public String user_nickname;

        public Builder() {
        }

        public Builder(LiveRankUserInfo liveRankUserInfo) {
            super(liveRankUserInfo);
            if (liveRankUserInfo == null) {
                return;
            }
            this.id = liveRankUserInfo.id;
            this.user_id = liveRankUserInfo.user_id;
            this.type = liveRankUserInfo.type;
            this.date = liveRankUserInfo.date;
            this.time_type = liveRankUserInfo.time_type;
            this.point = liveRankUserInfo.point;
            this.rank = liveRankUserInfo.rank;
            this.user_name = liveRankUserInfo.user_name;
            this.user_nickname = liveRankUserInfo.user_nickname;
            this.avatar = liveRankUserInfo.avatar;
            this.live_id = liveRankUserInfo.live_id;
            this.is_live = liveRankUserInfo.is_live;
            this.is_follow = liveRankUserInfo.is_follow;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveRankUserInfo build(boolean z) {
            return new LiveRankUserInfo(this, z);
        }
    }

    public LiveRankUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.date;
            if (str == null) {
                this.date = "";
            } else {
                this.date = str;
            }
            Integer num2 = builder.time_type;
            if (num2 == null) {
                this.time_type = DEFAULT_TIME_TYPE;
            } else {
                this.time_type = num2;
            }
            Long l3 = builder.point;
            if (l3 == null) {
                this.point = DEFAULT_POINT;
            } else {
                this.point = l3;
            }
            Long l4 = builder.rank;
            if (l4 == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = l4;
            }
            String str2 = builder.user_name;
            if (str2 == null) {
                this.user_name = "";
            } else {
                this.user_name = str2;
            }
            String str3 = builder.user_nickname;
            if (str3 == null) {
                this.user_nickname = "";
            } else {
                this.user_nickname = str3;
            }
            String str4 = builder.avatar;
            if (str4 == null) {
                this.avatar = "";
            } else {
                this.avatar = str4;
            }
            Long l5 = builder.live_id;
            if (l5 == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l5;
            }
            Integer num3 = builder.is_live;
            if (num3 == null) {
                this.is_live = DEFAULT_IS_LIVE;
            } else {
                this.is_live = num3;
            }
            Integer num4 = builder.is_follow;
            if (num4 == null) {
                this.is_follow = DEFAULT_IS_FOLLOW;
                return;
            } else {
                this.is_follow = num4;
                return;
            }
        }
        this.id = builder.id;
        this.user_id = builder.user_id;
        this.type = builder.type;
        this.date = builder.date;
        this.time_type = builder.time_type;
        this.point = builder.point;
        this.rank = builder.rank;
        this.user_name = builder.user_name;
        this.user_nickname = builder.user_nickname;
        this.avatar = builder.avatar;
        this.live_id = builder.live_id;
        this.is_live = builder.is_live;
        this.is_follow = builder.is_follow;
    }
}
