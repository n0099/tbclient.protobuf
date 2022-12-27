package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class FansRankUserInfo extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_PRESENT_SCORES = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer present_num;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String present_scores;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Integer DEFAULT_USER_ID = 0;
    public static final Integer DEFAULT_PRESENT_NUM = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FansRankUserInfo> {
        public String portrait;
        public Integer present_num;
        public String present_scores;
        public Integer user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(FansRankUserInfo fansRankUserInfo) {
            super(fansRankUserInfo);
            if (fansRankUserInfo == null) {
                return;
            }
            this.user_id = fansRankUserInfo.user_id;
            this.user_name = fansRankUserInfo.user_name;
            this.present_num = fansRankUserInfo.present_num;
            this.present_scores = fansRankUserInfo.present_scores;
            this.portrait = fansRankUserInfo.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FansRankUserInfo build(boolean z) {
            return new FansRankUserInfo(this, z);
        }
    }

    public FansRankUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.user_id;
            if (num == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = num;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Integer num2 = builder.present_num;
            if (num2 == null) {
                this.present_num = DEFAULT_PRESENT_NUM;
            } else {
                this.present_num = num2;
            }
            String str2 = builder.present_scores;
            if (str2 == null) {
                this.present_scores = "";
            } else {
                this.present_scores = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str3;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.present_num = builder.present_num;
        this.present_scores = builder.present_scores;
        this.portrait = builder.portrait;
    }
}
