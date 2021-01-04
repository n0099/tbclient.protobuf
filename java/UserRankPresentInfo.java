package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class UserRankPresentInfo extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer present_num;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long present_scores;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Integer DEFAULT_USER_ID = 0;
    public static final Integer DEFAULT_PRESENT_NUM = 0;
    public static final Long DEFAULT_PRESENT_SCORES = 0L;

    private UserRankPresentInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.user_id == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = builder.user_id;
            }
            if (builder.user_name == null) {
                this.user_name = "";
            } else {
                this.user_name = builder.user_name;
            }
            if (builder.present_num == null) {
                this.present_num = DEFAULT_PRESENT_NUM;
            } else {
                this.present_num = builder.present_num;
            }
            if (builder.present_scores == null) {
                this.present_scores = DEFAULT_PRESENT_SCORES;
            } else {
                this.present_scores = builder.present_scores;
            }
            if (builder.portrait == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = builder.portrait;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.present_num = builder.present_num;
        this.present_scores = builder.present_scores;
        this.portrait = builder.portrait;
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserRankPresentInfo> {
        public String portrait;
        public Integer present_num;
        public Long present_scores;
        public Integer user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(UserRankPresentInfo userRankPresentInfo) {
            super(userRankPresentInfo);
            if (userRankPresentInfo != null) {
                this.user_id = userRankPresentInfo.user_id;
                this.user_name = userRankPresentInfo.user_name;
                this.present_num = userRankPresentInfo.present_num;
                this.present_scores = userRankPresentInfo.present_scores;
                this.portrait = userRankPresentInfo.portrait;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserRankPresentInfo build(boolean z) {
            return new UserRankPresentInfo(this, z);
        }
    }
}
