package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class PayMemberInfo extends Message {
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

    private PayMemberInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.props_id == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = builder.props_id;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.expire_remind == null) {
                this.expire_remind = "";
                return;
            } else {
                this.expire_remind = builder.expire_remind;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.end_time = builder.end_time;
        this.url = builder.url;
        this.expire_remind = builder.expire_remind;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PayMemberInfo> {
        public Integer end_time;
        public String expire_remind;
        public Integer props_id;
        public String url;

        public Builder() {
        }

        public Builder(PayMemberInfo payMemberInfo) {
            super(payMemberInfo);
            if (payMemberInfo != null) {
                this.props_id = payMemberInfo.props_id;
                this.end_time = payMemberInfo.end_time;
                this.url = payMemberInfo.url;
                this.expire_remind = payMemberInfo.expire_remind;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PayMemberInfo build(boolean z) {
            return new PayMemberInfo(this, z);
        }
    }
}
