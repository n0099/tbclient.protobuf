package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class LotteryAwardInfo extends Message {
    public static final String DEFAULT_AWARD_NAME = "";
    public static final String DEFAULT_AWARD_PICURL = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_LOTTERY_CODE = "";
    public static final String DEFAULT_USER_ADDRESS = "";
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_PHONE = "";
    public static final String DEFAULT_USER_PORTRAIT = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String award_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String award_picurl;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer award_type;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String lottery_code;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer lottery_id;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer need_address;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer status;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String user_address;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String user_phone;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String user_portrait;
    public static final Integer DEFAULT_LOTTERY_ID = 0;
    public static final Integer DEFAULT_NEED_ADDRESS = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_AWARD_TYPE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<LotteryAwardInfo> {
        public String award_name;
        public String award_picurl;
        public Integer award_type;
        public String forum_name;
        public String lottery_code;
        public Integer lottery_id;
        public Integer need_address;
        public Integer status;
        public String user_address;
        public String user_name;
        public String user_phone;
        public String user_portrait;

        public Builder() {
        }

        public Builder(LotteryAwardInfo lotteryAwardInfo) {
            super(lotteryAwardInfo);
            if (lotteryAwardInfo == null) {
                return;
            }
            this.lottery_id = lotteryAwardInfo.lottery_id;
            this.award_name = lotteryAwardInfo.award_name;
            this.award_picurl = lotteryAwardInfo.award_picurl;
            this.need_address = lotteryAwardInfo.need_address;
            this.user_name = lotteryAwardInfo.user_name;
            this.user_phone = lotteryAwardInfo.user_phone;
            this.user_address = lotteryAwardInfo.user_address;
            this.user_portrait = lotteryAwardInfo.user_portrait;
            this.lottery_code = lotteryAwardInfo.lottery_code;
            this.status = lotteryAwardInfo.status;
            this.award_type = lotteryAwardInfo.award_type;
            this.forum_name = lotteryAwardInfo.forum_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LotteryAwardInfo build(boolean z) {
            return new LotteryAwardInfo(this, z);
        }
    }

    public LotteryAwardInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.lottery_id;
            if (num == null) {
                this.lottery_id = DEFAULT_LOTTERY_ID;
            } else {
                this.lottery_id = num;
            }
            String str = builder.award_name;
            if (str == null) {
                this.award_name = "";
            } else {
                this.award_name = str;
            }
            String str2 = builder.award_picurl;
            if (str2 == null) {
                this.award_picurl = "";
            } else {
                this.award_picurl = str2;
            }
            Integer num2 = builder.need_address;
            if (num2 == null) {
                this.need_address = DEFAULT_NEED_ADDRESS;
            } else {
                this.need_address = num2;
            }
            String str3 = builder.user_name;
            if (str3 == null) {
                this.user_name = "";
            } else {
                this.user_name = str3;
            }
            String str4 = builder.user_phone;
            if (str4 == null) {
                this.user_phone = "";
            } else {
                this.user_phone = str4;
            }
            String str5 = builder.user_address;
            if (str5 == null) {
                this.user_address = "";
            } else {
                this.user_address = str5;
            }
            String str6 = builder.user_portrait;
            if (str6 == null) {
                this.user_portrait = "";
            } else {
                this.user_portrait = str6;
            }
            String str7 = builder.lottery_code;
            if (str7 == null) {
                this.lottery_code = "";
            } else {
                this.lottery_code = str7;
            }
            Integer num3 = builder.status;
            if (num3 == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num3;
            }
            Integer num4 = builder.award_type;
            if (num4 == null) {
                this.award_type = DEFAULT_AWARD_TYPE;
            } else {
                this.award_type = num4;
            }
            String str8 = builder.forum_name;
            if (str8 == null) {
                this.forum_name = "";
                return;
            } else {
                this.forum_name = str8;
                return;
            }
        }
        this.lottery_id = builder.lottery_id;
        this.award_name = builder.award_name;
        this.award_picurl = builder.award_picurl;
        this.need_address = builder.need_address;
        this.user_name = builder.user_name;
        this.user_phone = builder.user_phone;
        this.user_address = builder.user_address;
        this.user_portrait = builder.user_portrait;
        this.lottery_code = builder.lottery_code;
        this.status = builder.status;
        this.award_type = builder.award_type;
        this.forum_name = builder.forum_name;
    }
}
