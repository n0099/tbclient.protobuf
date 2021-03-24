package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Pay_Member_Info extends Message {
    public static final String DEFAULT_EXPIRE_REMIND = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer end_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String expire_remind;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_END_TIME = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Pay_Member_Info> {
        public Integer end_time;
        public String expire_remind;
        public Integer props_id;
        public String url;

        public Builder() {
        }

        public Builder(Pay_Member_Info pay_Member_Info) {
            super(pay_Member_Info);
            if (pay_Member_Info == null) {
                return;
            }
            this.props_id = pay_Member_Info.props_id;
            this.end_time = pay_Member_Info.end_time;
            this.url = pay_Member_Info.url;
            this.expire_remind = pay_Member_Info.expire_remind;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Pay_Member_Info build(boolean z) {
            return new Pay_Member_Info(this, z);
        }
    }

    public Pay_Member_Info(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            Integer num2 = builder.end_time;
            if (num2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num2;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.expire_remind;
            if (str2 == null) {
                this.expire_remind = "";
                return;
            } else {
                this.expire_remind = str2;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.end_time = builder.end_time;
        this.url = builder.url;
        this.expire_remind = builder.expire_remind;
    }
}
