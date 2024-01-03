package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class BusinessAccountInfo extends Message {
    public static final String DEFAULT_BUSINESS_NAME = "";
    public static final String DEFAULT_IDENTIFI_EXPLAIN = "";
    public static final Integer DEFAULT_IS_BUSINESS_ACCOUNT = 0;
    public static final Integer DEFAULT_IS_FORUM_BUSINESS_ACCOUNT = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String business_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String identifi_explain;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_business_account;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_forum_business_account;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BusinessAccountInfo> {
        public String business_name;
        public String identifi_explain;
        public Integer is_business_account;
        public Integer is_forum_business_account;

        public Builder() {
        }

        public Builder(BusinessAccountInfo businessAccountInfo) {
            super(businessAccountInfo);
            if (businessAccountInfo == null) {
                return;
            }
            this.is_business_account = businessAccountInfo.is_business_account;
            this.is_forum_business_account = businessAccountInfo.is_forum_business_account;
            this.business_name = businessAccountInfo.business_name;
            this.identifi_explain = businessAccountInfo.identifi_explain;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessAccountInfo build(boolean z) {
            return new BusinessAccountInfo(this, z);
        }
    }

    public BusinessAccountInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_business_account;
            if (num == null) {
                this.is_business_account = DEFAULT_IS_BUSINESS_ACCOUNT;
            } else {
                this.is_business_account = num;
            }
            Integer num2 = builder.is_forum_business_account;
            if (num2 == null) {
                this.is_forum_business_account = DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
            } else {
                this.is_forum_business_account = num2;
            }
            String str = builder.business_name;
            if (str == null) {
                this.business_name = "";
            } else {
                this.business_name = str;
            }
            String str2 = builder.identifi_explain;
            if (str2 == null) {
                this.identifi_explain = "";
                return;
            } else {
                this.identifi_explain = str2;
                return;
            }
        }
        this.is_business_account = builder.is_business_account;
        this.is_forum_business_account = builder.is_forum_business_account;
        this.business_name = builder.business_name;
        this.identifi_explain = builder.identifi_explain;
    }
}
