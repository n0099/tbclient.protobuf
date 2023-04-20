package tbclient.AdKillerUserRank;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class UserRankRes extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer rank;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer score;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_SCORE = 0;
    public static final Integer DEFAULT_RANK = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserRankRes> {
        public String portrait;
        public Integer rank;
        public Integer score;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(UserRankRes userRankRes) {
            super(userRankRes);
            if (userRankRes == null) {
                return;
            }
            this.user_id = userRankRes.user_id;
            this.user_name = userRankRes.user_name;
            this.portrait = userRankRes.portrait;
            this.score = userRankRes.score;
            this.rank = userRankRes.rank;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserRankRes build(boolean z) {
            return new UserRankRes(this, z);
        }
    }

    public UserRankRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Integer num = builder.score;
            if (num == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = num;
            }
            Integer num2 = builder.rank;
            if (num2 == null) {
                this.rank = DEFAULT_RANK;
                return;
            } else {
                this.rank = num2;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.score = builder.score;
        this.rank = builder.rank;
    }
}
